package com.example.android.horoscopochino;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class SignoActivity extends AppCompatActivity {
    int imagenesSignos []={R.drawable.rata,R.drawable.vaca,R.drawable.tigre,
            R.drawable.conejo,R.drawable.dragon,R.drawable.serpiente, R.drawable.caballo, R.drawable.cabra,
            R.drawable.mono, R.drawable.gallo, R.drawable.perro, R.drawable.cerdo};
    String predicciones []={
            "Los doce signos del zodíaco se dividen en grupos de tres en tres,los cuales producen energía cuando coinciden en el tiempo y el espacio. \n" +
                    "La rata, al formar uno de esos triángulos,se convierte en líder de la energía producida,que es el agua. \n" +
                    "Los tres signos regidos por el agua son la rata, el dragón y el mono.\n" +
                    "Eso significa que después de años de estar a la sombra,la rata vendrá a reclamar su lugar como líder, con el mono como cómplice.  \n" +
                    "Será un año de vacas gordas en el que se le recomienda curar, ahorrar, guardar, preservar. Puede volver a la escuela, o aprender un oficio o pasatiempo. \n" +
                    "El metal del mono alimenta el agua de la rata, y eso fortalece su energía. A su vez, el fuego del año 2016 representa riqueza, tranquilidad económica y una salud que hace mucho que no veía.\n" +
                     "Bienvenida al carruaje del éxito, que es el año del mono de fuego.",
                    "La primera mitad del año será de malos entendidos provocados por rumores. Habrá mucha energía fuego que aumentará la energía tierra del bovino, haciéndolo todavía más taciturno y fácil de manipular. \n" +
                            "Su cabeza cavilará mucho. Será un tiempo de despedidas.\n" +
                            "Tiempo de reflexión y aprendizaje. Los búfalos que pasan los sesenta años afianzarán su personalidad: \n" +
                            "será difícil que quieran cambiar de opinión, aprender nuevos trucos, comprender a los jóvenes. \n" +
                            "Este año es mejor ser discretos y absorber toda la energía metálica posible de la segunda mitad del año, \n" +
                            "hacer mucho el amor del tao, ver amaneceres y sacar partido a todas las conexiones profesionales.",
            "La primera mitad del año será de malos entendidos provocados por rumores. Habrá mucha energía fuego que aumentará la energía tierra del bovino, haciéndolo todavía más taciturno y fácil de manipular. \n" +
                    "Su cabeza cavilará mucho. Será un tiempo de despedidas.\n" +
                    "Tiempo de reflexión y aprendizaje. Los búfalos que pasan los sesenta años afianzarán su personalidad: será difícil que quieran cambiar de opinión, aprender nuevos trucos, comprender a los jóvenes. \n" +
                    "Este año es mejor ser discretos y absorber toda la energía metálica posible de la segunda mitad del año, hacer mucho el amor del tao, ver amaneceres y sacar partido a todas las conexiones profesionales.",
            "Es raro que un conejo se asocie o comience una relación de cualquier tipo con un mono. \n" +
                    "No pululan por los mismos círculos. Por ese motivo, solo algunos conejos sabrán qué está pasando y podrán manejar lo que se viene.\n" +
                    "El año del mono le traerá al conejo una sorpresa desagradable tras otra, con pequeños períodos de tranquilidad que no serán fáciles de afianzar; la supervivencia de su especie dependerá de su capacidad de adaptarse a lo que ocurra durante los días que siguen al 8 de febrero, comienzo del año del mono.\n" +
                    "El conejo, que es un ser de pradera o de bosque, tendrá que pasar un año entero en la jungla. Puede, de verdad, acabar en el estofado. Entonces sin lugar a dudas hay que ponerse de acuerdo con familiares y amigos para no perder de vista ninguna oportunidad y equilibrar las energías.",
            "Es amigo del mono porque su energía tierra/agua no se agota con la acción del metal fijo del mico. \n" +
                    "Pero la primera mitad del año sería complicada de abordar porque es cuando la influencia del fuego yang cubre la energía anual. Esa primera mitad será impredecible. La segunda mitad será perfecta.\n" +
                    "El dragón estará sociable, más vivo y, en algunos casos, hasta más atlético. \n" +
                    "Tendrá la oportunidad de restablecer lazos rotos y crear quimeras fantásticas en todo lo que imagine y cree con sus propias manos.\n" +
                    "Este año será perfecto en muchos sentidos. Los jóvenes dragones de 2000 se enamorarán perdidamente por primera vez, y los otros dragones, a pesar de verse envueltos en algunas rencillas, \n" +
                    "tendrán tanta energía que no sabrán cómo canalizarla. Encontrará las palabras perfectas para usarlas en los momentos perfectos.",
            "De todos los signos del zodíaco, el de la serpiente es el que más altibajos sufre en cuanto a relaciones personales y de energía se refiere y por eso prefiere las actividades altamente intelectuales y artísticas que reduzcan el roce con mucha gente. \n" +
                    "La primera mitad del año será mejor que la segunda, aún así es pertinente tomar algunas precauciones antes y durante este año.\n" +
                    "Los rumores se combinarán con la realidad hasta el punto de confundir a las serpientes, más que nada a las pequeñas de 2013 y las adolescentes de 2001, que tendrán que trabajar mucho en su autoestima. Se les recomienda terapia y aprender un pasatiempo relacionado con las artes plásticas, la danza, la actuación o las artes marciales; también leer sobre inteligencia emocional, practicar yoga o meditación.",
            "Es un gran viajero. Este año querrá quemar las naves y modificar su vida entera. No todos los caballos harán cambios tan definitivos, pero es posible que el equino dé un giro de 180º en algún aspecto de la vida.\n" +
                    "Bajo esa perspectiva, cualquier cambio drástico será menos doloroso porque su visión lo ayudará a revaluar las creencias y por eso se le pide que sea flexible. Los cambios más contundentes ocurrirán durante la primera mitad del año, que está regido por su propia \n" +
                    "energía fuego.\n" +
                    "Una vez que comience el mes del mono, la energía fuego será menor y comenzará una etapa de seis meses más metálicos que ayudarán mucho a que recupere su cordura.",
            "Ha tratado de lograr un lugar seguro para ver pasar las tormentas, pero eso la ha cansado. Hay que aclarar que en realidad no le fue demasiado mal en su propio año. Las cabras han luchado por mantener intactos su amor incondicional por los más desamparados, y la inocencia y la alegría \n" +
                    "de vivir que las caracteriza. Eso les da gracia y las ayuda a procesar los tragos amargos comunes del año propio.\n" +
                    "Las cabras de 1979 no se están acostumbrando a la idea de su próxima mediana edad. Las de 2003 estarán inquietas con su llegada a la  adolescencia, pero deberán tener cuidado ya que no gozarán del anonimato que disfrutaron las de otros años, pues ahora todo lo que hagan aparecerá en internet, y podrían sufrir de acoso en la red. La intuición estará un poco torpe este año, se podría enamorar sin medir las consecuencias.",
            "Este año es el año del ben mìng nián, que literalmente significa «en esta vida». Y es en esta vida cuando se viene al mundo a superar lo que no se pudo superar en otras vidas. Como humanos tenemos la capacidad de cumplir con nuestras deudas y además dejar nuestro mundo mejor de como \n" +
                    "lo encontramos.\n" +
                    "El ben mìng nián es el equivalente al retorno solar en la astrología caldea; significa que se han cumplido doce años del ciclo de los doce signos del zodíaco y que el mono debe pasar por un período de «muerte y renacimiento» en el cual todo representa una oportunidad para aprender, cambiar y crecer. Según el nivel de evolución espiritual y la inteligencia emocional de cada mono, el proceso será más doloroso o menos doloroso. \n" +
                    "Todos los reflectores estarán apuntando a él y será su responsabilidad terminar victorioso este año o salir en una camilla de paramédico.\n" +
                    "La primera mitad del año será una hecatombe. El año no está bien aspectado porque lo que controla la energía fija del mono que es el fuego. \n" +
                    "Querido mono, este es el punto de quiebre: no hay manera de ocultar la verdad de su condición humana bajo la fachada de la perfección. \n" +
                    "Este año hay que reconocerse todo, lo bueno, lo malo, y lo que es puro, absoluto.",
            "El año viene con habladurías, mentiras, robos menores y falta de independencia, tanto económica como emocional. \n" +
                    "A pesar de que el mono y el gallo son de energía metal, no es lo mismo yin que yang. La imagen es la de una daga de jade compitiendo contra un hacha de acero. Este año su paciencia y su salud serán puestas a prueba, deberán aprender mil y un mantras que les ayuden a soportar las limitaciones de los demás y las de él mismo. Los gallos de 1957 podrán comprender las acrobacias energéticas del mono, por lo tanto tienen que aprovechar este año para organizarlo, para que no se les venga abajo el gallinero. Los demás gallos necesitan aprender a meditar a como dé lugar. \n" +
                    "Cada uno de los meses que siguen son los ensayos generales para la hecatombe plumífera que se viene en 2017. \n" +
                    "Más les vale afilar los espolones.",
            "El beneficio que pueda obtener del año del mono dependerá de con quién se asocie y del estado de la salud de su sistema respiratorio, que debe cuidar mucho. \n" +
                    "El perro puede convivir bien con gente de distintos círculos y mezclarse como si fuera familia de todos. \n" +
                    "Eso es en general muy bueno y se debe a que el perro tiene no una, sino tres energías fijas: tierra/metal/fuego. Por lo tanto, el can será una especie de intérprete de la ONU tratando de hacer que dos energías combatientes (fuego y metal, que rigen el año) se lleven bien, y el nivel de beneficio que pueda obtener de aquí en adelante dependerá de quiénes sean sus amigos. El perro reaccionará intensamente a todo la primera mitad del año. \n" +
                    "La segunda mitad será más testarudo, y al mismo tiempo le costará trabajo concentrarse. \n" +
                    "Cuando aprenda a canalizar las emociones, el mono lo va a cobijar y ayudar en todos sus deseos, los cuales seguramente son maravillosos para todos nosotros.",
            "A partir de febrero, vienen no solo uno sino dos años complicados que el cerdo tendrá que manejar con toda la inteligencia y la astucia que pueda. \n" +
                    "Los cerdos de 1947, los de 1971 y los de 2007 estarán muy vulnerables a incidentes desagradables. Es de suma importancia que se organicen.\n" +
                    "La cabra fue muy benévola, les dio espacio y oportunidades donde antes solo habían encontrado obstáculos. Pero el mono no será igual, es importante que el cerdo no pierda los contactos hechos y se ande con un perfil lo más bajo posible, aunque manteniendo cierto nivel para que la gente con más poder y posición lo sienta indispensable. Una forma de lograr pasar por ese año turbulento es evitar confrontaciones con la pareja y los hijos, y soslayar la competencia.\n" +
                    "Deberá ser menos cándido a la hora de analizar a la gente. \n" +
                    "También necesitará mantenerse actualizado en todo. Su ego será la trampa; disolverlo, su camino a la tranquilidad."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signo);
        Bundle mochila=getIntent().getExtras();
        int queIndice=mochila.getInt("indice");
        String queSigno=mochila.getString("signo");
        String queElemento = mochila.getString("elemento");
        ImageView pi=(ImageView) findViewById(R.id.imageViewSigno);
        pi.setImageResource(imagenesSignos[queIndice]);
        TextView textoSigno=(TextView) findViewById(R.id.nombreSigno);
        textoSigno.setText(queSigno);
        TextView textoElemento=(TextView) findViewById(R.id.nombreElemento);
        textoElemento.setText("ELEMENTO: " + queElemento);
        TextView textoPredicciones = (TextView) findViewById(R.id.textoPrediccion);
        textoPredicciones.setText(predicciones[queIndice]);



    }


}
