object MatrixMath {
    fun sumMatrix(matrix1: Matrix, matrix2: Matrix): Matrix? {
        return if (matrix1.getColumnNumbers() == matrix2.getColumnNumbers() && matrix1.getRowNumbers() == matrix2.getRowNumbers()) {
            var resultMatrix = Matrix(matrix1.getRowNumbers(), matrix1.getColumnNumbers())
            for (i in 0 until matrix1.getRowNumbers()) for (j in 0 until matrix1.getColumnNumbers()) {
                resultMatrix.getMatrix()[i][j] = matrix1.getMatrix()[i][j] + matrix2.getMatrix()[i][j]
            }
            resultMatrix
        } else {
            println("This matrices don't have equal number of rows or columns")
            null
        }
    }

    fun subMatrix(matrix1: Matrix, matrix2: Matrix): Matrix? {
        return if (matrix1.getColumnNumbers() == matrix2.getColumnNumbers() && matrix1.getRowNumbers() == matrix2.getRowNumbers()) {
            var resultMatrix = Matrix(matrix1.getRowNumbers(), matrix1.getColumnNumbers())
            for (i in 0 until matrix1.getRowNumbers()) for (j in 0 until matrix1.getColumnNumbers()) {
                resultMatrix.getMatrix()[i][j] = matrix1.getMatrix()[i][j] - matrix2.getMatrix()[i][j]
            }
            resultMatrix
        } else {
            println("This matrices don't have equal number of rows or columns")
            null
        }
    }

    fun multiplyMatrix(matrix1: Matrix, matrix2: Matrix) : Matrix? {
        return if(matrix1.getColumnNumbers() == matrix2.getRowNumbers()){
            var resultMatrix = Matrix(matrix1.getRowNumbers(), matrix2.getColumnNumbers())
            for (i in 0 until matrix1.getRowNumbers())
                for (j in 0 until matrix2.getColumnNumbers())
                    for (k in 0 until matrix1.getColumnNumbers())
                        resultMatrix.getMatrix()[i][j] += matrix1.getMatrix()[i][k] * matrix2.getMatrix()[k][j]
            resultMatrix
        }
        else {
            println("Matrices can't by multiplied")
            null
        }

    }
}