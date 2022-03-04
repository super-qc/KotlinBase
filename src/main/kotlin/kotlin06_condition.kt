// 条件语句

//if/else if

//range in关键字检查某个值是否在指定范围内

fun main() {
    var age = 3
    if (age in 0..3) {
        println("baby")
    } else if (age in 3..12) {
        println("teenager")
    } else {
        println("other")
    }


    var school = "小学"
    var level = when (school) {
        "学前班"->"幼儿"
        "小学"->"少儿"
        else -> {
            println("未知")
        }
    }
    println(level)


    // string 模板  支持在字符串的引号内放入变量值 $
    //





}