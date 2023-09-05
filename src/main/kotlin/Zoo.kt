class Zoo(
    var nombre: String,
    var animales : ArrayList<Animal> = arrayListOf()
) {
    fun agregarAnimal(animalTemp: Animal){
        animales.add(animalTemp)
    }
    fun hacerSonidosDelZoo() : String{
        var string_temporal = ""

        println("Sonidos del ZOO!")

        for(animalTemp in animales){
            string_temporal += animalTemp.hacerSonido() +"\n"
        }

        return string_temporal
    }
}