fun main() {
    var num: Int = (1..100).random()
    var trobat: Boolean = false
    var intents: Int = 0

    while (!trobat) {
        print("Introdueix un numero entre 1 i 100: ")
        val input = readln().toInt()

        intents++

        when {
            input < num -> println("El numero es mes gran.")
            input > num -> println("El numero es mes petit.")
            else -> {
                println("Felicitats! Has endevinat el numero $num en $intents intents.")
                trobat = true
            }
        }
    }
}