# Definición de las Clases y Acciones
![image](https://github.com/facupepi/TP42/assets/109759897/7448bdf4-af11-414a-a6be-cd409d0afc20)
## Clases y Métodos

- Se definen las siguientes clases y se les asignan los métodos correspondientes:
  - `Animal`: Clase base que contiene un método `hacer_sonido` que será sobreescrito en las subclases. Esta clase tiene atributos `nombre` y `tipo`.
  - `Ave`: Subclase de `Animal` que representa aves. Incluye el atributo `velocidad_vuelo` y sobrescribe `hacer_sonido` para hacer sonidos de ave.
  - `Mamifero`: Subclase de `Animal` que representa mamíferos. Incluye el atributo `velocidad_correr` y sobrescribe `hacer_sonido` para hacer sonidos de mamífero.
  - `Zoologico`: Clase que representa un zoológico y permite agregar animales.

## Acciones a Realizar

- En el programa principal (`main`), se deben llevar a cabo las siguientes acciones:

  a. Se instancian dos aves, dos mamíferos y un zoológico.
  b. Se agregan los animales al zoológico.
  c. Se llama al método `hacer_sonido` en el zoológico, el cual recorre todos los animales y muestra los sonidos que hacen.
