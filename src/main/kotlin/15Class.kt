class Player0 {
    var name: String = " jack"

        // 首字母转换为大写 field:覆盖默认的方法
        //get() = field.capitalize()


        get()=(1..5).random().toString()

        set(value) {
            field = value.trim()
        }
}

fun main() {
    var p = Player0()
    println(p.name)

    p.name=" rose"
    println(p.name)
}