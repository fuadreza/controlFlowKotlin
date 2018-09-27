fun main(args: Array<String>) {
    for (i in 1..100) {
        when {
            i % 10 == 0 -> println("$i -> angka kelipatan 10")
            i % 2 == 0 -> println("$i -> angka genap")
            else -> println(i)
        }
    }
}