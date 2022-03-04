import java.io.File

/**
 * also
 * also返回的是接收者对象，可以基于原始接收者对象执行额外的链式调用
 *
 */
fun main() {
    val file2= File ("E://完整藥局口罩資料(其中一天)1.json")
    var fileContents:List<String>
    file2.also {
        println(it.name)
    }.also {
        fileContents=it.readLines()
    }
    println(fileContents)
}