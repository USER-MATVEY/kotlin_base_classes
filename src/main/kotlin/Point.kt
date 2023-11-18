class Point {
    var x: Int = 0
    var y: Int = 0

    fun setcoords(){
        println("Введите координаты точки: ")
        this.x = readlnOrNull()?.toInt() ?:0
        this.y = readlnOrNull()?.toInt() ?:0
    }
}
