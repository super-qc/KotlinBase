
// 定义参数是函数的 函数
fun main() {

    showOnBoard("dress",{goodsName:String,hour:Int->

        val currentYear=2021
        "$currentYear 年,$goodsName 促销倒计时:$hour 小时"
    })

}
fun showOnBoard(goodsName:String,getDiscountWords:(String,Int)->String){
    var hour=(1..24).shuffled().last()
    println(getDiscountWords(goodsName,hour))
}