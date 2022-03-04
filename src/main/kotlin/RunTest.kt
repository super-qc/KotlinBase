import java.io.File

/**
 * run
 *
 * run能用来执行函数引用
 */
fun main() {
    val file2= File ("E://完整藥局口罩資料(其中一天)1.json").apply {
        setReadable(true)
        setWritable(true)
        setExecutable(false)
    }

    file2.run {
        readText().contains("type")
    }.run {
        println(this)
    }


    // run能用来执行函数引用
    "All animals are equal,but some animals are more equal than others"
        .run {::isLong}
        .run {::showMessage}


    val reuslt = with(" \"All animals are equal,but some animals are more equal than others\""){
        length>=10
    }
}

fun isLong(name:String):Boolean=name.length>=10

fun showMessage(isLong:Boolean):String{
    return if(isLong){
        "Name is too long"
    }else{
        "ok"
    }
}
