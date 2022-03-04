fun main() {
    login("zhangsan", "123",
        {
            println("success")

        }, {
            println("错误码：$it")

        })
}


fun login(username: String, pwd: String, onSuccess: () -> Unit, onFail: (Int) -> Unit) {
    val errorCode = 400
    val temp = (1..2).random()
    if (temp > 1) {
        onSuccess()
    } else {
        onFail(errorCode)
    }

}
