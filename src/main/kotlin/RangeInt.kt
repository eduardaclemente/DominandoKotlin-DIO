fun main () {

    for(i in 0..3) {             // range dentro da estrutura de repetição, do inicio ao fim
        print(i)
    }
    print(" ")

    for(i in 0 until 3) {        // de 0 a until (um antes do numero final, 3 exclusive)
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {      // de 2 a 8, em step de 2 (ou seja, de 2 em 2)
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {      //
        print(i)
    }
    print(" ")
}