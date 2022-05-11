fun main() {
    var vector : Matrix = Vector(5)
    vector.randomFillMatrixInt(0, 10)
    println(vector)

    var squareMatrix : Matrix = SquareMatrix(6)
    squareMatrix.randomFillMatrixDouble(0.0, 7.5)
    println(squareMatrix)

    var nullMatrix : Matrix = NullMatrix(5,5)
    println(nullMatrix)

    
}