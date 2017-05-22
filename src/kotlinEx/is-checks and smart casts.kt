package kotlinEx

/**
 * Created by ipseeta on 5/22/17.
 */
fun main(args:Array<String>){
    println(getStringLength("Ipseeta"))
    println(getStringLength(1))
}
fun getStringLength(obj : Any): Int ? {
    if(obj is String)
        return obj.length
    return null
}