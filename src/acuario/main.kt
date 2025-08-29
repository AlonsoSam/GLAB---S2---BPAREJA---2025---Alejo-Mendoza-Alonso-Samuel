package acuario

fun construirAcuario() {
    val miAcuario = Acuario(largo=25,ancho=25,alto=40)
    miAcuario.imprimirTamano()
    val miTorre = TanqueTorre(diametro=25,alto=40)
    miTorre.imprimirTamano()
}

fun main(){
    construirAcuario()
}