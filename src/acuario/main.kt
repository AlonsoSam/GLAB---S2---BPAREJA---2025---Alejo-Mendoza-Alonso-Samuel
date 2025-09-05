package acuario

fun crearPeces(){
    val tiburon= Tiburon()
    val pezPayaso= PezPayaso()
    println("El tiburón es color: ${tiburon.color}")
    println("Su alimentación se basa en: ")
    tiburon.comer()
    println("El pez payaso es color: ${pezPayaso.color}")
    println("Su alimentación se basa en: ")
    pezPayaso.comer()

}

fun main(){
    crearPeces()
}
