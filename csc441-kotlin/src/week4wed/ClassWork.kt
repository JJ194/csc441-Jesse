package week4wed

fun main()
{
    println("--Step 1: Function returning nothing--")
    todaysExercise()

    println("--Step 2: Function returning a value--")
    println("Today I'll do ${todaysExercise1()}")

    println("--Step 3: A parameter--")
    println(todaysExercise2( dayNumber = 3))
    println(todaysExercise2( dayNumber = 7))

    println("--Step 4: the short form")
    println(todaysExercise3(3))

    println("--Step 5: A parameter--")
    println(todaysExercise4())
    println(todaysExercise4(2))

    println("--Step 6: naming conventions")
    println(todaysExercise5( dayNumber = 1, name = "Me"))

}

fun todaysExercise()
{
    println("Push ups")
}

fun todaysExercise1(): String
{
    return "Push-ups"
}

fun todaysExercise2(dayNumber: Int): String
{
    return when (dayNumber)
    {
        1-> "Push-ups"
        2-> "Running"
        3-> "Swimming"
        4-> "Cycling"
        5-> "Lunch"
        else -> "Legs"

    }

}

fun todaysExercise3 (dayNumber : Int): String = when (dayNumber)
{
    1->"Push-ups"
    2->"Running"
    3->"Swimming"
    4->"Cycling"
    5->"Lunch"
    else -> "Legs"
}

fun todaysExercise4 (dayNumber: Int = 1): String = when (dayNumber)
{
    1-> "Push-ups"
    2->"Running"
    3->"Swimming"
    4->"Cycling"
    5->"Lunch"
    else-> "Legs"
}

fun todaysExercise5(dayNumber: Int = 1, name: String = "You"):String
{
    val exercise = when (dayNumber)
    {
        1->"Push-ups"
        2->"Running"
        3->"Swimming"
        4->"Cycling"
        5->"Lunch"
        else-> "Legs"
    }

    return  "$name: $exercise"
}

