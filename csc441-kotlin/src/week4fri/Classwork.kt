package week4fri

fun main () {
    println("--- Step 1: Two kinds of string ---")
    val firstName: String = "Jesse"
    val middleName: String? = null  //Add a name here to have an output for step 4

    println(firstName.length)
    println(middleName?.length)

    println("--- Step 2: Safe call ---")
    println(middleName?.length)

    println("--- Step 3: Elvis ---")
    println(middleName?.length ?: 0)


    println("--- Step 4: Let ---")

    middleName?.let { //middleName -> ("Middle name is : middleName") *Best practice*
        println("Middle name is : $it")
    }

    //if (middleName != null) {
        //println(middleName.length)
    //}

    println("--- Step 5: The risky one ---")
    val maybeNumber: Int? = 100  //null pointer crash if a non int is here
    println(maybeNumber!! + 1)



    println("--- Step 6: Where nulls actually come from---")
    val notANumber = "Bananas".toIntOrNull()
    println(notANumber ?: "Thats not a number.")

    val capitals = mapOf("France" to "Paris", "Japan" to "Tokyo")
    println(capitals["Canada"] ?: "Not in the map.")

    val emptyList = listOf<Int>()
    println(emptyList.maxOrNull() ?: "List is empty.")

    println("--- Step 7: List and MutableList")
    val shoppingList = listOf("Bread" , "Butter", "Water")
    val toDoList = mutableListOf("Homework" , "Laundry")

    toDoList.add("Dishes")
    toDoList.remove("Laundry")

    println(shoppingList)
    println(toDoList)
    println("Items: ${toDoList.size }")

    println("--- Step 8: Things list can ---")
    val scores = listOf(90 ,72 ,58 ,66 , 55)
    println(scores.sum())
    println(scores.average())
    println(scores.maxOrNull())
    println(scores.sorted())
    println(scores.filter { it >= 80 })


}