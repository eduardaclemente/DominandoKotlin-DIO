fun main () {

    fun max(a: Int, b: Int) = if (a > b) a else b         // a nova

    fun maxOld(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    println(max(99, -42))
    println(maxOld(99, -42))
}