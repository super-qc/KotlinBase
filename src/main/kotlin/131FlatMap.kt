


fun main() {
    // faltMap 合并集合
   val result = listOf(listOf(1,2,3), listOf(4,5,6)).flatMap { it }
    println(result)


    // filter 过滤
    val result2= listOf("Jimmy","Jack","Tom").filter {
        it.contains("J")
    }
    println(result2)



}


