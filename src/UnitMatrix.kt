class UnitMatrix : SquareMatrix{
    constructor(length : Int) : super(length) {
        this.makeUnitMatrix()
    }

    private fun makeUnitMatrix() {
        for (i in this.matrix.indices) {
            this.matrix[i][i] = 1.0
        }
    }

    override fun changeLength(length: Int) {
        super.changeLength(length)
        this.makeUnitMatrix()

    }


}