import Distance.Companion.getDistance

fun main(){
    println("Введите ккол-во точек: ")
    val point_count: Int = readln().toInt()
    var point_arr = Array<Point>(size = point_count) { _ ->  Point()}
    var max_distance = 0.0
    var min_distance = 100.0

    point_arr.forEach(action = Point::setcoords)
    point_arr = point_arr.toSet().toTypedArray()
    for (first in point_arr.indices){
        for (second in point_arr.indices){
            if (first == second) continue
            val distance = getDistance(point_arr[first], point_arr[second])
            if (distance > max_distance){
                max_distance = distance
                continue
            }
            if (distance < min_distance){
                min_distance = distance
                continue
            }
        }
    }
    println("Максимальное расстояние между точками: $max_distance")
    println("Минимальное расстояние между точками: $min_distance")
}