package kotlinEx

/**
 * Created by ipseeta on 5/22/17.
 */
class Greeting(val name: String){
    fun greet(){
        println("Hello! ${name}")
    }
}
fun main(args : Array<String>){
    Greeting(args[0]).greet()
}