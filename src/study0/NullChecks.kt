package study0

fun parseInt(str: String): Int? {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        println("One of the arguments isn't Int")
    }
    return null
}

fun main(args: Array<String>) {
    val a = "2"
    val b = "3"
    if(a != null && b != null){
        val x = parseInt(a);
        val y = parseInt(b);
        println(x!! * y!!)
    }
}
