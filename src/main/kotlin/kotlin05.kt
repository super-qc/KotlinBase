

// 编译时常量
const val PI=3.1415


fun main(){

    // 提示：修饰符const不适用于 局部变量 ，编译时常量只能在函数外定义
    // const val PI=3.14;
    // val==不可改变的 只读
    val info:String="MyInfo"
    println(info)
}