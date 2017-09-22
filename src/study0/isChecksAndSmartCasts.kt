package study0

fun main(args:Array<String>){
    val i = 2
    println(getStringLength(i))
}


fun getStringLength(obj: Any): Int? {
    if(obj is String){
        return obj.length
    }
    if(obj is Number){
        return obj.toString().length

    }
    return null
}