fun main () {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // 1: Retorna verdadeiro porque chama authores.equals(writers) e define a ordem dos elementos ignorados.
    println(authors === writers)  // 2: Retorna false porque autores e escritores são referências distintas.
}