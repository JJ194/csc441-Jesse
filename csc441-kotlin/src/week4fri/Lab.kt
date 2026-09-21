package week4fri

fun main () {

    println("-- Req 1: A value string, and an empty string --")
    val carModel: String = "El Pinto"
    val carColor: String? = null  //"Red" to get an output on step 4
    println(carModel.length)

    println("-- Req 2: The safe call --")
    println(carColor?.length)

    println("-- Req 3: The Elvis --")
    println(carColor?.length ?: 0)

    println("-- Req 4: The .let --")
    carColor?.let {
        println("The car is $it")
    }

    println("-- Req 5: Don't use the not nulls !! --")
    val possibleNumber: Int? = 5
    val toIntOrNull = "Oranges".toIntOrNull()
    println(toIntOrNull ?: "That isn't a number. Try again.")

    println("-- Req 6: Listing --")
    val carTrimList = listOf("Touring" , "Limited" , "Classic" , "Standard")
    println(carTrimList)

    println("-- Req 7: Mutable listings--")
    val trimUpgrades = mutableListOf("Touring")
    trimUpgrades.add ("Grand Touring")
    trimUpgrades.remove("Touring")
    println("Trim packages: ${carTrimList.size}")
    println(trimUpgrades)

    println("-- Req 8: Numbers listings--")
    val speedLimits = listOf(55,65,75,45,35,20,20,15,10,5)
    println(speedLimits.sum())
    println(speedLimits.average())
    println(speedLimits.filter { it >= 55 })








}