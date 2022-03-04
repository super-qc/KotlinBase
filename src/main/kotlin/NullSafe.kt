/**
 *
 * ? 安全操作符
 *
 * let 函数返回lambda表达式最后一行的内容
 */
fun main(){
    var s:String?=null
    //s=null
    s = s?.let {
        if(it.isNotBlank()){
            it.capitalize()
        }else{
            "qq"
        }
    }

    // 非空断言操作费 !! 抛出空指针
    //s!!.count()

    println(s)

    // ?: 空合并操作符
    var strWithSafe:String?=null
    println(strWithSafe?:"other")

}