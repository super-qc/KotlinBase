import java.io.File


// T.() -> Unit 泛型无参扩展函数
public inline fun <T> T.apply(block: T.() -> Unit): T {
    block()
    return this
}

fun main() {
    File("xx").apply {
        setReadable(true)
    }.apply {

    }.apply {

    }
     "~qu~".doSomething({println("before+$this")},{println("end+$this")} )

}

public inline fun <T> T.doSomething(before:T.()->Unit,end:T.()->Unit):T{
    before()
    println("doSomething")
    end()
    return this
}
