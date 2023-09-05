class Mamifero(
    nombre : String,
    edad : Int,
    var colorPelaje : String,
    var velocidad : Double
) : Animal(nombre, edad)
{
    override fun hacerSonido(): String {
        return (super.hacerSonido() +" - Mi velocidad es $velocidad")
    }

    fun correr() : String {
        return "Estoy corriendo!"
    }
}