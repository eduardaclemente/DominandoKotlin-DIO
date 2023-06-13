fun comaBolo() = println("Coma um bolo!")
fun asseBolo() = println("Asse um bolo")

fun main() {
    var bolosComidos = 0
    var bolosAssados = 0

    while (bolosComidos < 5) {                    // while
        comaBolo()
        bolosComidos ++
    }

    do {                                        // do-while
        asseBolo()
        bolosAssados++
    } while (bolosComidos < bolosAssados)

}