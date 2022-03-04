import java.io.File

/**
 * apply
 * apply能让每个配置函数都作用于接收者
 */
fun main() {
    val file1= File ("E://完整藥局口罩資料(其中一天)1.json")
    file1.setReadable(true)
    file1.setWritable(true)
    file1.setExecutable(false)

    val file2= File ("E://完整藥局口罩資料(其中一天)1.json").apply {
        setReadable(true)
        setWritable(true)
        setExecutable(false)
    }
    println(file1==file2)
}