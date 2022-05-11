fun main() {
    var vector = Vector(5)
    vector.randomFillMatrixInt(0, 10)
    println(vector)

    vector.manualInput()
    println(vector)
}