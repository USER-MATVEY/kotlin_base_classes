import kotlin.math.pow
import kotlin.math.sqrt

class Triangle(private val p1: Point, private val p2: Point, private val p3: Point){
    var area: Double = 0.0

    private fun getDistance(first: Point, second: Point): Double {
        return sqrt(
            ((first.x.toDouble() - second.x.toDouble()).pow(2.0)
                    + (first.y.toDouble() - second.y.toDouble()).pow(2.0))
        )
    }

    private fun getHalfPerimetr(): Double {
        return (getDistance(p1, p2) + getDistance(p2, p3) + getDistance(p3, p1)) / 2.0
    }

    fun setArea() {
        val hp = getHalfPerimetr()
        val a = getDistance(p1, p2)
        val b = getDistance(p2, p3)
        val c = getDistance(p3, p1)
        this.area = sqrt((hp * (hp - a) * (hp - b) * (hp - c)))
    }
}
