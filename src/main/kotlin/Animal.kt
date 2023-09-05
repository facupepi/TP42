abstract class Animal (
    var nombre : String,
    var edad : Int
){
    open fun hacerSonido():String{
        return "Hola! soy $nombre"
    }
}