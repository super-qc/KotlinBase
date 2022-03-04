// 找素数，只能被1和他本身整除的数
fun main() {
    val numbers = listOf(7, 8, 9, 22, 18, 11, 3)

    numbers.filter {
            number -> (2 until number)
        .map { number % it }
        .none{it==0}
    }.easyPrint()


}