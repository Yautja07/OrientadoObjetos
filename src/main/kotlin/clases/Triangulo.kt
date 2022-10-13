package clases

class Triangulo(var base: Double, var altura: Double) : Poligono() {
    override fun obtenerArea(): Double {
        return (base * altura)/2
    }

    override fun obtenerPerimetro(): Double {
        return base * 3
    }

}
