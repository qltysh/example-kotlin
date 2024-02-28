class Sample() {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun main() {
        println("Hello, world!");

        println("3 + 2 = ${sum(3, 2)}");
        println("5 - 3 = ${subtract(5, 3)}");
        println("4 * 3 = ${multiply(4, 3)}");
    }
}