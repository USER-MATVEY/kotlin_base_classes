import Distance.Companion.getDistance

fun main(){
    val point1 = Point()
    val point2 = Point()
    point1.setcoords()
    point2.setcoords()
    println(getDistance(point1, point2))
}