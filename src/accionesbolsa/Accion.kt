package accionesbolsa

// Interfaz
interface AccionMovimiento {
    fun analizar()
}

// Clase abstracta
abstract class Accion(val nombre: String, val precio: Double) {
    abstract fun mostrarInfo()
}

// Subclase 1
class AccionCaida(nombre: String, precio: Double) : Accion(nombre, precio), AccionMovimiento {
    override fun mostrarInfo() {
        println("Acción: $nombre | Precio actual: $precio USD")
    }

    override fun analizar() {
        println("$nombre está en caída, cuidado con invertir a corto plazo.")
    }
}

// Subclase 2
class AccionEstable(nombre: String, precio: Double) : Accion(nombre, precio), AccionMovimiento {
    override fun mostrarInfo() {
        println("Acción: $nombre | Precio actual: $precio USD")
    }

    override fun analizar() {
        println("$nombre está estable, buena para inversión moderada.")
    }
}

// Función que crea las acciones y llama a sus métodos
fun crearAcciones() {
    val amc = AccionCaida("AMC Entertainment", 2.72)
    val apple = AccionEstable("Apple", 230.50)

    amc.mostrarInfo()
    amc.analizar()

    apple.mostrarInfo()
    apple.analizar()
}

// Main
fun main() {
    crearAcciones()

}