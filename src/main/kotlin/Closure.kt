/**
 *
 * 在kotlin中，匿名函数可以引用定义在自己作用域外的变量，匿名函数引用着定义自身的函数里的变量，Kotlin中的lambda就是闭包
 * 闭包:
 *能接受函数作为参数或者返回函数类型的函数，为高级函数,高级函数广泛应用于函数式编程
 *
 * 匿名函数
 */

fun main() {
    val getDiscountWords = configDiscountWords();
    println(getDiscountWords("沐浴露"))
}

fun configDiscountWords():(String)->String {
    val currentYear = 2021
    val hour=(1..24).shuffled().last()
    return {goodsName:String->
        // 匿名函数中可以使用父级函数的变量
        /**
         *     val currentYear = 2021
        val hour=(1..24).shuffled().last()
         */
        "$currentYear 年,$goodsName 促销倒计时:$hour 小时"

    }
}

