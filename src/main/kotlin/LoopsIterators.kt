class Animal(val name: String) // variavel imutavel

class Zoo(val animals: List<Animal>) { // lista imutavel

    operator fun iterator(): Iterator<Animal> {  // cria dentro da classe zoo a capacidade de iteração
        return animals.iterator()  // pega os animais e itera na lista
    }
}

fun main() {

    // lista de animais resumida
    // val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    // + legível, porém pode ser feito dos dois jeitos
    val animals = listOf(Animal("Zebra"), Animal("Lion"))
    val zoo = Zoo(animals)

    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }

}