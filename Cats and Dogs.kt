import kotlin.random.Random

fun main() {
    val ages = listOf(11, 6, 8,2, 3, 9, 5, 12, 7)

    abstract class Animals(name: String, age: Int) {
        abstract fun talk()
    }
    class Cat (val name: String, val age: Int) : Animals(name, age) {

        override fun talk() {
            println("$name : Meow")
        }
    }
    class Dog (val name: String, val age: Int) : Animals(name, age) {

        override fun talk() {
            println("$name : Woof")
        }
    }

    val dogs = listOf<Dog>(
        Dog("Simba", ages[Random.nextInt(ages.size)]),
        Dog("Cleo", ages[Random.nextInt(ages.size)]),
        Dog("Toppy", ages[Random.nextInt(ages.size)]),
        Dog("Mark", ages[Random.nextInt(ages.size)]),
        Dog("Scott", ages[Random.nextInt(ages.size)])
    )

    val cats = listOf<Cat>(
        Cat("Willow", ages[Random.nextInt(ages.size)]),
        Cat("Bella", ages[Random.nextInt(ages.size)]),
        Cat("Angel", ages[Random.nextInt(ages.size)]),
        Cat("Nala", ages[Random.nextInt(ages.size)]),
        Cat("Luna", ages[Random.nextInt(ages.size)])
    )

    for(i in cats){
        i.talk()
        for(j in dogs){
            if(i.age < j.age){
                j.talk()
            }
        }
    }
}

