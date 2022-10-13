package clases

import java.util.Date

class Nota(var nombre: String, var contenido: String, var fechaCeacion: Date) {  //constructor primario
    init {
        numeroInstancia++
    }
    companion object{

        var numeroInstancia = 0

    }

}