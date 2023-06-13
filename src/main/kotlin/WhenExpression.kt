fun main() {
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(WhenExpression()))
}

//Aqui a função não é só imprimir, é verificar os valores de entrada
// que chegaram como parametros para poder fazer uma atribuição por ele.
fun whenAssign(obj: Any): Any {                 // recebe Amy(qualquer coisa) e retorna qualquer coisa
    val result = when (obj) {                   // 1
        1 -> "one"                              // 2
        "Hello" -> 1                            // 3
        is Long -> false                        // 4
        else -> 42                              // 5
    }
    return result
}

class WhenExpression