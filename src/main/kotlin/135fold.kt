
/*
 *
 *  fold()，这个合并函数接受一个初始累加器值，随后会根据匿名函数的结果更新
 */

fun main() {

    val foldeValue = listOf(1,2,3,4).fold(0){
        accmulator,number->
        println("accmulator value:$accmulator")
       accmulator+(number*3)
    }.easyPrint()


}