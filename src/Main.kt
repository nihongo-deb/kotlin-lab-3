fun main() {
    var vector : Matrix = Vector(5)
    vector.randomFillMatrixInt(0, 10)
    println(vector)

    var squareMatrix : Matrix = SquareMatrix(5)
    squareMatrix.randomFillMatrixDouble(0.0, 7.5)
    println(squareMatrix)

    var nullMatrix : Matrix = NullMatrix(5,5)
    println(nullMatrix)

    var diagonalMatrix : Matrix = DiagonalMatrix(5)
    diagonalMatrix.randomFillMatrixInt(0, 15)
    println(diagonalMatrix)

    var unitMatrix : Matrix = UnitMatrix(5)
    println(unitMatrix)

    println("squareMatrix + unitMatrix:\n" + MatrixMath.sumMatrix(squareMatrix, unitMatrix))
    println("squareMatrix * unitMatrix:\n" + MatrixMath.multiplyMatrix(squareMatrix, unitMatrix))
}