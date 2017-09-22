package study0

fun main(args: Array<String>) {
    val x = 9
    val y = 10

    //判断是否在区间内
    if (x in 1..y - 1) {// 双闭
        println("OK")
    }

    if (x in 1 until y) {//左闭,有开 半开半闭
        println("OK")
    }
    println()
    //循环输出
    for (a in 1..5) {
        print("$a ")
    }
    println()
    for (a in 1 until 5) {
        print("$a ")
    }

    val array = arrayListOf<String>()
    array.add("aaa")
    array.add("bbb")
    array.add("ccc")
    array.add("ab")

    println()
    for (i in 0 until array.size) {
        //
    }
    if("a" in array){
        println("a is in array")
    }




}