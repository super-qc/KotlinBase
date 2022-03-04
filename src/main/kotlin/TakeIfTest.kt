import java.io.File


fun main() {
    val file2= File ("E://完整藥局口罩資料(其中一天)1.json")
    val result = file2.takeIf { it.exists()&&it.canRead() }
        ?.readText()
    println(result)
}