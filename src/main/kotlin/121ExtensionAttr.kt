val String.numVowels
    get() = count { "aeiouy".contains(it) }

fun Any.easyPrint() {
    println(this)
}

fun main() {
    "All animals are equal".numVowels.easyPrint()
}