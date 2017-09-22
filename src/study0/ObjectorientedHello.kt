package study0

class Greeter(private val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}

fun main(args: Array<String>) {
    Greeter("卫队长").greet();
}