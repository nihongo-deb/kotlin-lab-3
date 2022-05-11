class Vector : Matrix {
    private var size : Int? = null

    constructor(size : Int) : super (1, size){
        this.size = size
    }

    override fun setRowNumbers(rowNumbers: Int) {
        println("unusable for this object")
    }

    fun setSize(size: Int){
        setColumnNumbers(size)
        this.size = size
    }

    override fun toString(): String {
        var stringResult = "size: $size \n"
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