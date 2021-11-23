fun main() {
    val countryAndCapital = mutableMapOf<String, String>()
    for (i in 1..3){
        print("plz enter country: ")
        val country = readLine()!!.toString()

        print("now enter the capital city: ")
        val city = readLine()!!.toString()
        countryAndCapital[country] = city
}
    println(countryAndCapital)
}