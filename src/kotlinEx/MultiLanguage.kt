package kotlinEx

/**
 * Created by ipseeta on 5/22/17.
 */
fun main(args: Array<String>) {
    val language = if (args.isEmpty()) "EN" else args[0]
    println(when (language) {
        "EN" -> "Hello!"
        "FR" -> "Salut!"
        "IT" -> "Ciao!"
        else -> "Sorry, I can't greet you in $language yet"
    })
}