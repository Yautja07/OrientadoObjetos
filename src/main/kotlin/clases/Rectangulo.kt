package clases

class Rectangulo(var base: Double, var altura: Double): Poligono() {
    override fun obtenerArea(): Double {
        return base * altura

    }

    override fun obtenerPerimetro(): Double {
        return (2 * base) + (2 * altura)

    }
}