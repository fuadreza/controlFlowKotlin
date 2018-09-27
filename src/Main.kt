fun main(args: Array<String>) {
    for (i in 1..100) {
        println(when(0){
            i%10 -> "$i -> angka kelipatan 10"
            i%2 -> "$i -> angka genap"
            else -> i
        })
    }
}