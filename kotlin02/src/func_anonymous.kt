fun main(){
    val total="Mississippi".count()

    val totalS="Mississippi".count({ letter ->
        letter == 's'
    })

    println("total:$total")
    println("totalS:$totalS")



    // 变量的类型是一个匿名函数
    // 函数返回值类型：string
    val blesingFunction:()->String
    blesingFunction={
        val holiday="New Year"
        //return "Happy $holiday"
        // 匿名函数默认将最后一行的数据类型，作为返回值类型,最后一行就是返回值
        "Happy $holiday"
    }
    println(fu());

}


func fu(){
    "hello"
}
