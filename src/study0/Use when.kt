package study0

class MyClass() {}

fun main(args: Array<String>) {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("Hello")
}

fun cases(obj: Any) {
    when(obj){
        1-> println("One")
        "Hello"-> println("Greeting")
        is Long -> println("Not a String")
        is MyClass -> println("MyClass instance")
        else -> println("Unknown")
    }
}

