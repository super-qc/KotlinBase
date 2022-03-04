fun main() {

    /**
     *  ==  比较两个字符串中的字符是否匹配
     *  === 比较两个变量是否指在内存中的同一对象
     */
    println("a"=="b")
    var s="a";
    var l=s;
    println(s===l)
    s="q"
    println(l)
}