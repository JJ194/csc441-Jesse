package week3fri

fun main ()
{
    for (i in 1..5)
    {
        print ("$i ")
    }
    println()

    for (letter in 'a'..'e')
    {
        print ("$letter ")
    }
    println()

    for (i in 10 downTo 1)
    {
        print ("$i ")
    }
    println()

    for (i in 0..100 step 25)
    {
        print ("$i ")
    }
    println()

    //step 3
    val shoppingList = mutableListOf("Milk", "Bread", "Coffee")
    for (item in shoppingList)
    {
        println(item)
    }

    for ((index, item) in shoppingList.withIndex())
    {
        println("$index : $item")
    }

    shoppingList.forEachIndexed{
        index, item -> println("$index is $item")
    }

    for (i in 0 until shoppingList.size)
    {
        println("$i: ${shoppingList[i]}")
    }

    //step5
    val day = "Sunday"
    when (day)
    {
        "Monday" -> println("5 days until the weekend.")
        "Tuesday" -> println("4 days until the weekend.")
        "Wednesday" -> println("1 day until the weekend.")
        else -> println("The weekend is almost here!")
    }

    //Step 6
    val age = 40

    val amIOld =  when (age)
    {
        in 1..50 -> false
        in 20..100 -> true
        else -> true
    }

    println(amIOld)

    val years = 10
    val level = if (years > 20) "Senior" else "Junior"
    println(level)


}
