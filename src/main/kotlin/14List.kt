/**
 *
 *
 * list 列表
 */

fun main(){
    val list = listOf("jack","rose","Jason")
    // 数组越界异常
    //println(list[3])

    // 安全获取
    println(list.getOrNull(3))

    // 可变列表 utableList, 与不可变列表 listOf

    val list2= mutableListOf("wendy");
    list2.add("lorry")


    // 不可变列表转换为可变列表
    list.toMutableList();


    // 遍历元素
    list.forEach({
        println(it)
    })

    // 1,jack 2,rose
    list.forEachIndexed({index, item ->
        println("$index, $item")
    })

}