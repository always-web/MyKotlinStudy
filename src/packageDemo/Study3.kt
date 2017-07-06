package packageDemo

/**
 * Created by wendong.hu on 2017/7/6.
 */
fun main(args: Array<String>) {
    var a:Int
    var b = 5
    b+=1
    println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇")
    val s = "Hello"
    val v = "hwdd"
    println("$s $v")
    var c = "$s $v"
    println("$c.length is ${c.length}")
    println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇")
    val price = "$9.99"
    println(price)
    println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇")
    println("${maxof(1,2)}")
    println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇")
    println("${maxof2(10,2)}")
    println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇")

}

fun parseInt(a:String): Int? {
    return a.toIntOrNull()
}


fun maxof2(a:Int,b:Int) = if(a>b) a else b

fun maxof(a:Int,b:Int):Int{
    if(a<b){
        return a
    }else{
        return b
    }
}


