fun main (){
    for (c in 'a'..'d') {        // percore de a até d
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) { // suporta intervalo de caracteres de 2 em 2
        print(c)
    }
    print(" ")
}