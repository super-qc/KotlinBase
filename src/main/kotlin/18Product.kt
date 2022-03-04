import java.io.File

// 继承

open class Product(val name:String){
    fun description()="Product:$name"
    open fun load()="Nothing.."
}

class LuxuryProduct:Product("Luxury"){
    override fun load() ="LuxuryProduct loading.."

    fun special()= "special"
}

fun main() {
    val p:Product=LuxuryProduct()
    println(p.load())

    // is 关键词 判断类型
    println(p is Product)
    println(p is LuxuryProduct)
    println(p is File)


    if(p is LuxuryProduct){
            // as 类型转换
        println((p as LuxuryProduct).special());

        // 只需要转换一次即可，后续会自动转换
        p.special()
    }



}