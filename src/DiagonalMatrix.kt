import kotlin.random.Random

class DiagonalMatrix(length: Int) : SquareMatrix(length) {
    override fun randomFillMatrixDouble(from: Double, to: Double) {
        for (i in matrix.indices){
            matrix[i][i] = Random.nextDouble(from, to)
        }
    }

    override fun randomFillMatrixInt(from: Int, to: Int) {
        for (i in matrix.indices){
            matrix[i][i] = Random.nextInt(from, to).toDouble()
        }
    }
}