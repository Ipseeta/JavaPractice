package kotlinEx

/**
 * Created by ipseeta on 5/22/17.
 */
fun main(args : Array<String>) {
    if(args.isEmpty()) {
        println("Please enter commandline argument")
        return
    }
    println("Hello ${args[0]}!")
}
