class NullMatrix : Matrix {
    constructor(rowNumbers: Int, columnNumbers: Int) : super(rowNumbers, columnNumbers)
    override fun randomFillMatrixDouble(from: Double, to: Double) {
        println("unusable for this object")
    }

    override fun randomFillMatrixInt(from: Int, to: Int) {
        println("unusable for this object")
    }
}