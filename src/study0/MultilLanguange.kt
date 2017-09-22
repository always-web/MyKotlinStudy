package study0

fun main(args: Array<String>) {
    val language = if (args.isEmpty()) "EN" else args[0]
    println(
            when (language) {
                "EN" -> "Hello!"
                "FR" -> "Sault!"
                "CN" -> "你好!"
                else -> "illeage arguments"
            }
    )
}