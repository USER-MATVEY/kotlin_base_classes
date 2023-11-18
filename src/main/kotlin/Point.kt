data class Point(var x: Int = 0, var y: Int = 0) {

    fun setcoords(){
        println("Введите координаты точки: ")
        print("x = ")
        this.x = readlnOrNull()?.toInt() ?:0
        print("y = ")
        this.y = readlnOrNull()?.toInt() ?:0
    }
}
