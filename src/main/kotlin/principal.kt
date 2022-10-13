import clases.Poligono
import clases.Rectangulo
import clases.Triangulo
import kotlin.io.path.createTempDirectory

fun main(){
    println("Esto es una prueba de git")
    println(calculadora(80, 10, :: sumar))

}

fun suma(num1: Int, num2: Int):Int{
    return num1 + num2
}

fun calculadora(num1: Int, num2: Int, fn: (Int, Int)-> Int): Int{

    return fn(num1, num2)

}

fun sumar(x1: Int, x2: Int) = x1 + x2


class PersonaA(var nombre: String, var telefono: String){
    override fun toString(): String {
        return "Nombre: $nombre, Telegono: $telefono"
    }

}

data class PersonaB(var nombre: String, var telefono: String){
    fun obtenerLargoNombre():Int{
        return nombre.length
    }
}


