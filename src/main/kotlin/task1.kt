fun main() {
    println("Создаём главный треугольник:")
    val point_1 = Point()
    val point_2 = Point()
    val point_3 = Point()
    point_1.setcoords()
    point_2.setcoords()
    point_3.setcoords()
    val main_triangle = Triangle(point_1, point_2, point_3)
    println("Вводим дополнительную точку:")
    val ex_point = Point()
    ex_point.setcoords()
    println("Создаются дополнительные треугольники........")
    val ex_tr_1 = Triangle(point_1, point_2, ex_point)
    val ex_tr_2 = Triangle(point_2, point_3, ex_point)
    val ex_tr_3 = Triangle(point_1, point_3, ex_point)
    main_triangle.setArea()
    ex_tr_1.setArea()
    ex_tr_2.setArea()
    ex_tr_3.setArea()

    if (main_triangle.area != (ex_tr_1.area + ex_tr_2.area + ex_tr_3.area))
        println("Введённая точка находится за пределами треугольника!")
    else println("Введённая точка в пределах треугольника.")
}