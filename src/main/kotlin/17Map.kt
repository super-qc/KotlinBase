// Map
fun main() {
    val map = mapOf(1 to "Jack", 2 to "Rose", 3 to "Jimmy")

    println(map[1]);

    map.forEach {
        println("$it.key,$it.value")
    }


    // 可变map
    val map2= mutableMapOf<Int,String>();
    map2.put(1,"Lisa")


}