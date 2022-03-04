// 数据类
data class Coordinate(var x:Int,var y:Int){

}

fun main() {
    println(Coordinate(10,15))

    println(Coordinate(10,15)==Coordinate(10,15))
}