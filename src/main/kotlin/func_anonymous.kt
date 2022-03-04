fun main(){
    val total="Mississippi".count()

    val totalS="Mississippi".count({ letter ->
        letter == 's'
    })

    println("total:$total")
    println("totalS:$totalS")



    // 变量的类型是一个匿名函数
    // 函数返回值类型：string
    /*
    val blessingFunction:()->String
    blessingFunction={
        val holiday="New Year"
        //return "Happy $holiday"
        // 匿名函数默认将最后一行的数据类型，作为返回值类型,最后一行就是返回值
        "Happy $holiday"
    }*/



    // 匿名函数增加传入参数
    /*
    val blessingFunction:(String)->String={ name->
        val holiday="New Year"

        "$name,Happy $holiday"
    }
    println(blessingFunction("Jerry"))
*/
    /*
    val blessingFunction:(String)->String={
        val holiday="New Year"

        "$it,Happy $holiday"
    }*/
    val blessingFunction= {name:String->
        val holiday = "New Year"

        "$name,Happy $holiday"
    }
    println(blessingFunction("Jerry"))

 
    println()
}



