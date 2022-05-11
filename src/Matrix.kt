import kotlin.random.Random

open class Matrix {
    private var rowNumbers: Int = 0
    private var columnNumbers: Int = 0
    protected var matrix = ArrayList<ArrayList<Double>>()

    constructor(rowNumbers: Int, columnNumbers: Int) {
        this.rowNumbers = rowNumbers
        this.columnNumbers = columnNumbers
        fillMatrixByNull()
    }

    constructor()

    @JvmName("getMatrix1")
    fun getMatrix(): ArrayList<ArrayList<Double>> {
        return this.matrix
    }

    @JvmName("setMatrix1")
    fun setMatrix(matrix: ArrayList<ArrayList<Double>>) {
        this.matrix = matrix
    }

    fun getRowNumbers(): Int {
        return this.rowNumbers
    }

    open fun setRowNumbers(rowNumbers: Int) {
        if (this.rowNumbers > rowNumbers) {
            for (i in this.rowNumbers - 1 downTo rowNumbers)
                matrix.removeAt(i)
        }
        if (this.rowNumbers < rowNumbers) {
            for (i in this.rowNumbers until rowNumbers) {
                var row = ArrayList<Double>()
                for (i in 0 until columnNumbers)
                    row.add(0.0)
                matrix.add(row)
            }
        }
        this.rowNumbers = rowNumbers
    }

    protected fun setJustRowNumbers(rowNumbers: Int) {
        this.rowNumbers = rowNumbers
    }

    fun getColumnNumbers(): Int {
        return this.columnNumbers
    }

    open fun setColumnNumbers(columnNumbers: Int) {
        if (this.columnNumbers > columnNumbers) {
            for (i in matrix.indices) {
                for (k in this.columnNumbers - 1 downTo columnNumbers) {
                    matrix[i].removeAt(k)
                }
            }
        }
        if (this.columnNumbers < columnNumbers) {
            for (i in matrix.indices) {
                for (k in matrix[i].size until columnNumbers) {
                    matrix[i].add(0.0)
                }
            }
        }
        this.columnNumbers = columnNumbers
    }

    protected fun setJustColumnNumbers(columnNumbers: Int) {
        this.columnNumbers = columnNumbers
    }

    open fun randomFillMatrixDouble(from: Double, to: Double) {
        for (i in matrix.indices) {
            for (k in matrix[i].indices) {
                matrix[i][k] = Random.nextDouble(from, to)
            }
        }
    }

    open fun randomFillMatrixInt(from: Int, to: Int) {
        for (i in matrix.indices) {
            for (k in matrix[i].indices) {
                matrix[i][k] = Random.nextInt(from, to).toDouble()
            }
        }
    }


    private fun fillMatrixByNull() {
        for (i in 0 until rowNumbers) {
            var row = ArrayList<Double>()
            for (k in 0 until columnNumbers) {
                row.add(0.0)
            }
            matrix.add(i, row)
        }
    }

    fun manualInput() {
        println("rows:\t$rowNumbers\ncolumns:\t$columnNumbers" )
        for (i in matrix.indices){
            print("row: $i\n")
            for (k in matrix[i].indices){
                print("column: $k\n")
                matrix[i][k] = readln().toDouble()
            }
        }
    }

    /**
     * in singleton class MatrixMath
     */
//    companion object
//        {fun multiplyMatrix(matrix1: Matrix, matrix2: Matrix) : Matrix{
//        var resultMatrix = Matrix(1,1)
//            if(matrix1.getColumnNumbers() == matrix2.getRowNumbers()){
//                resultMatrix.setRowNumbers(matrix1.getRowNumbers())
//                resultMatrix.setColumnNumbers(matrix2.getColumnNumbers())
//
//                for (i in 0 until matrix1.getRowNumbers())
//                    for (j in 0 until matrix2.getColumnNumbers())
//                        for (k in 0 until matrix1.getColumnNumbers())
//                            resultMatrix.matrix[i][j] += matrix1.matrix[i][k] * matrix2.matrix[k][j]
//            }
//            else
//                println("Matrices can't by multiplied")
//            return resultMatrix
//            }
//        }

    fun isSquare(): Boolean {
        return rowNumbers == columnNumbers
    }


    @Override
    override fun toString(): String {
        var stringResult = "rows:\t$rowNumbers\ncolumns:\t$columnNumbers\n"
        for (i in matrix.indices) {
            var row = matrix[i]
            for (k in matrix[i].indices) {
                stringResult += String.format("%.2f", row[k]) + '\t'
            }
            stringResult += '\n'
        }
        return stringResult
    }


}