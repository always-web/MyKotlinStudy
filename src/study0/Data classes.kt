package study0

data class User(val name: String, val id: Int)

fun getUser(): User {
    return User("卫队长", 1)
}

fun main(args: Array<String>) {
    println("one day must be you day. but if you give up, no day will be you day " +
            "don't stop, don't quest,listen to me,don't give up")

    println("one day must be you day. but if you give up, no day will be you day " +
            "don't stop,dont't quest,listen to me,don't give up")
}



