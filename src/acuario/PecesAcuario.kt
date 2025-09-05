package acuario

abstract class Pez{
    abstract val color:String
}

interface AccionPez{
    fun comer()
}

class Tiburon : Pez() , AccionPez{
    override val color:String = "gris"
    override fun comer(){
        println("Cazar y come peces")
    }
}

class PezPayaso : Pez(), AccionPez{
    override val color:String = "dorado"
    override fun comer(){
        println("Comer algas")
    }
}