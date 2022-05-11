open class SquareMatrix : Matrix {
    private var length:Int = 0

    constructor(length : Int) : super(length, length){
        this.length = length
    }

    fun getLength() : Int {
        return length
    }

    open fun changeLength(length: Int){
        var bufMatrix = Matrix(this.length, this.length)
//        for(i in 0 until this.length)
//            for (j in 0 until this.length)
//                bufMatrix.getMatrix()[i][j] = this.matrix[i][j]
        bufMatrix.setMatrix(this.matrix)

        bufMatrix.setRowNumbers(length)
        bufMatrix.setColumnNumbers(length)

        this.matrix = bufMatrix.getMatrix()
//        this.setJustRowNumbers(length)
//        this.setJustColumnNumbers(length)
        this.length = length

    }

    override fun setRowNumbers(rowNumbers : Int){
        println("unusable for this object")
    }

    override fun setColumnNumbers(columnNumbers: Int) {
        println("unusable for this object")
    }

    override fun toString(): String {
        var stringResult = "length: $length\n"
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