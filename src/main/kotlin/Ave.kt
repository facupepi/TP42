class Ave(
    nombre : String,
    edad : Int,
    var colorPlumaje : String
) : Animal(nombre,edad)

{
    override fun hacerSonido():String{
        return (super.hacerSonido() + " - Mi color es $colorPlumaje")
    }
    fun cantar() :String{
        return("estoy cantando!")
    }
}