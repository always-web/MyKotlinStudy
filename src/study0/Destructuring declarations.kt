package study0

fun main(args: Array<String>) {
    val pair = Pair(1, "One")
    val (k, v) = pair
    println("num = $k name = $v")
}

class Pair<out K, out V>(private val first: K, private val second: V) {
    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }


}