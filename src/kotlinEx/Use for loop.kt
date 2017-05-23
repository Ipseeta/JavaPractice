package kotlinEx

/**
 * Created by ipseeta on 5/23/17.
 */
fun main(args : Array<String>){
    val array : IntArray = intArrayOf(1,2,3,4,5)
    for(arr in array){
        println(arr)
    }
    println("next")
    for(i in array.indices){
        print(array[i])
    }
}