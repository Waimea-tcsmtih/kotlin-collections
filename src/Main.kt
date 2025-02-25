import jdk.internal.joptsimple.internal.Strings

/**
 * Learning about Kotlin collections, particularly
 * the MutableList type
 */

fun main() {
    println("Kotlin MutableList!")
    println()

    // Create our list
    val snacks = mutableListOf<String>()

    // show it
    println(snacks)

    //Add in some things
    snacks.add("Kit-Kat")
    snacks.add("Twix")
    snacks.add("Cheese and crackers")

    println(snacks)

    // show specific items
    println(snacks[0])

    println(snacks)

    snacks[1] = "Dog Biscuts"
    println(snacks)
    snacks.removeAt(0)
    println(snacks)

    snacks.add(1, "Grapefruit")


    //sort the list
    snacks.sort()
    println(snacks)


    //randomizer
    snacks.shuffle()
    println(snacks)

    for (snack in snacks) {
        println(snack)



    }
// Get a random item from list
    val item = snacks.random()
    println("Random item: $item")

    // Searching for an item
    println("Beer is in line: ${ snacks.contains("Beer") }")
    println("Horse is in line: ${snacks.contains("Horse") }")

    // Getting index of item
    println("Bear index: ${snacks.indexOf("Bear") }")
    println("Horse index: ${snacks.indexOf("Horse") }")


    // Loop through the list
    for (snack in snacks) {
        println(snack)
    }


    //loop using an index
    for (i in 0 .. snacks.size) {
        println ("$i: $( snacks[1] }")
        }

    //loop getting index and values
    for ((i, snack) in snacks.withIndex()) {
        println("$i: $snack")

    }


    }


























