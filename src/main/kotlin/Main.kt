fun main() {
    var ave1 = Ave("Pepita",5,"Verde")
    var ave2 = Ave("Luisita",1,"Amarillo")

    var mamifero1 = Mamifero("Rafael",10,"Negro",35.0)
    var mamifero2 = Mamifero("Sebastian",8,"Azul",60.0)

    var zoologico = Zoo("zoologico")
    //No le pasamos el array ya que la clase tiene un valor por defecto. No importa que no espeficiquemos
    //el array, el objeto se crea con un array por defecto (un array vacio)

    zoologico.agregarAnimal(ave1)
    zoologico.agregarAnimal(ave2)
    zoologico.agregarAnimal(mamifero1)
    zoologico.agregarAnimal(mamifero2)

    println(zoologico.hacerSonidosDelZoo())

}