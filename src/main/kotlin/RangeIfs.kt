fun main () {

    val x = 2 // variavel imutavel

    if (x in 1..5) {            // x está entre 1 e 5?
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) {          //  x não está entre 6 e 10?
        print("x is not in range from 6 to 10")
    }
}