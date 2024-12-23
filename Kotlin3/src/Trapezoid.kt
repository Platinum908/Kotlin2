class Trapezoid (private val lowerBase: Int, private val upperBase: Int) {

    fun calculateSemiSum(): Double {
        return (lowerBase + upperBase) / 2.0
    }
}