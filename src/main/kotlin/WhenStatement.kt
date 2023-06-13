fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(WhenStatement())
    cases("hello")
}


fun cases (obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Boas vindas!")
        is Long -> println("Long")
        !is String -> println("Não é uma string")
        else -> println("Desconhecido") // else pode ser usado como um default
    }
}

class  WhenStatement

