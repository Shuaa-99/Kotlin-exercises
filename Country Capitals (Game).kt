import kotlin.random.Random
    fun main() {
        class Countrys(val country: String, val capital: String) {
            fun display() {
                println(" $capital is Capital of $country")
            }
        }
        val countries = listOf(
            Countrys("Kuwait", "Kuwait City"),
            Countrys("Albania", "Tirana"),
            Countrys("Saudi Arabia", "Riyadh"),
            Countrys("Iraq", "Baghdad"),
            Countrys("Australia", "Canberra"),
            Countrys("Afghanistan", "Kabul")
        )
        var i = 0
        var score = 0
        while (true) {
            val currentCountry = countries[Random.nextInt(countries.size)]
            println("What is the capital of ${currentCountry.country}?")
            i++
            val answer = readLine()
            if (answer!! == currentCountry.capital) {
                println("You got it!")
                score++
            } else {
                println("Wrong guess :(, the current answer: ${currentCountry.capital}")
               // currentCountry.display()
            }
            if (i >= 3) {
                println("You have guessed $score out of 3 correctly.")
                i = 0
                score = 0
                print("Would you like to continue? (Y/N)  ")
                val userAnswer = readLine().toString()
                if (userAnswer == "Y" || userAnswer == "y") {
                } else if (userAnswer == "N" || userAnswer == "n")
                    break

            }
        }
    }
