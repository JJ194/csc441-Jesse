package week3fri

fun main ()
{
    for (i in 1..10)
    {
        print("$i ")
    }
    println()

    for (i in 20 downTo 1 step 3)
    {
        print("$i ")
    }
    println()

    val packingList = mutableListOf("Towel, " , "Money orders, " , "Travel guide, " , "Sat phone ")
    for (item in packingList)
    {
        print(item)
    }
    println()

    packingList.forEachIndexed{
        index, item -> println("$item: $index")
    }

    for (i in 0 until packingList.size)
    {
        print("$i:${packingList[i]} ")
    }
    println()

    val day = "5"
    when (day)
    {
        "1" -> println("Today is Monday")
        "2" -> println("Today is Tuesday")
        "3" -> println("Today is Wednesday")
        "4" -> println("Today is Thursday")
        "5" -> println("Today is Friday")
        "6" -> println("Today is Saturday")
        "7" -> println("Today is Sunday")
        else -> println("Unknown day")

    }

    val fish = 1
    val penguinHappy = if (fish >= 1) "Happy" else "Sad"
    println("Penguin is $penguinHappy")



}