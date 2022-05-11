class NullMatrix : Matrix() {
    override fun randomFillMatrixDouble(from: Double, to: Double) {
        println("unusable for this object")
    }

    override fun randomFillMatrixInt(from: Int, to: Int) {
        println("unusable for this object")
    }
}