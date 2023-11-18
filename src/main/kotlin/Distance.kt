import kotlin.math.pow
import kotlin.math.sqrt

class Distance {
    companion object {
        fun getDistance(first: Point, second: Point): Double {
            return sqrt(
                ((first.x.toDouble() - second.x.toDouble()).pow(2.0)
                        + (first.y.toDouble() - second.y.toDouble()).pow(2.0))
            )
        }
    }
}