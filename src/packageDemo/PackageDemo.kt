package packageDemo

/**
 * Created by wendong.hu on 2017/7/6.
 */
fun main(args: Array<String>) {
    //为什么会这样
    print("sum of 3 and 5 is ")
    println(sum(3, 5))
    println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇")
    print("sum1 of 3 and 5 is ")
    println(sum1(3, 5))
    println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇")
    println("sum1 of 100 and 200 is ${sum(100, 200)}")
    println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇")
    println("返回无意义的值: ${printSum(0, 10)}")
    println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇")
    test(10000)
    println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇")
    printSum1(10,-1)

}

fun test(a:Int) = println("$a")


fun printSum1(a:Int,b:Int){
    println("printSum1 of $a and $b is ${a+b}")
}


fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}


fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum1(a: Int, b: Int) = a + b