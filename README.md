# MarsRover

La NASA tiene la intención de aterrizar vehículos robóticos en Marte para explorar una meseta de aspecto particularmente curioso. Los rovers deben navegar esta meseta rectangular de manera que sus cámaras a bordo puedan obtener una imagen completa del terreno circundante para enviarla a la Tierra. Una cuadrícula de coordenadas bidimensional simple se asigna a la meseta para ayudar en la navegación móvil. Cada punto de la cuadrícula está representado por un par de números X Y que corresponden al número de puntos al Este o al Norte, respectivamente, desde el origen. El origen de la cuadrícula está representado por 0 0 que corresponde a la esquina suroeste de la meseta. 0 1 es el punto directamente al norte de 0 0, 1 1 es el punto inmediatamente al este de 0 1, etc. La posición actual y el rumbo de un móvil están representados por un triple X Y Z que consta de su posición de cuadrícula actual X Y más una letra Z que corresponde a uno de los cuatro puntos cardinales de la brújula, N E S W. Por ejemplo, 0 0 N indica que el móvil está en el mismo esquina suroeste de la meseta, mirando al norte. La NASA controla de forma remota los rovers a través de instrucciones que consisten en cadenas de letras. Las posibles letras de instrucción son L, R y M. L y R indican al móvil que gire 90 grados a la izquierda o a la derecha, respectivamente (sin moverse de su punto actual), mientras que M indica al móvil que avance un punto de cuadrícula a lo largo de su rumbo actual . Su tarea es escribir una aplicación que tome la entrada de prueba (instrucciones de la NASA) y proporcione la salida esperada (los comentarios de los rovers a la NASA). Cada rover se moverá en serie, es decir, el próximo rover no comenzará a moverse hasta que el anterior termine.

Entrada

Suponga que la esquina suroeste de la cuadrícula es 0,0 (el origen). La primera línea de entrada establece los límites de la cuadrícula de exploración al indicar las coordenadas correspondientes a la esquina noreste de la meseta. A continuación, cada rover recibe sus instrucciones por turno. Las instrucciones de cada rover consisten en dos líneas de cadenas. La primera cadena confirma la posición y el rumbo actuales del móvil. La segunda cadena consta de instrucciones de giro/movimiento

5 5 
1 2 N 
LMLMLMLMM 

Salida

Una vez que cada rover ha recibido y ejecutado completamente las instrucciones dadas, transmite su posición actualizada y rumbo a la NASA.

1,3,N