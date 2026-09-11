package week3wed

fun main ()
{
    val name = "Jesse"
    val major = "CS"
    val favfood = "Pizza"


    println(name)
    println(major)
    println(favfood)


    var coursesTaken = 15
    println ("Courses taken so far: $coursesTaken")
    coursesTaken += 1
    println ("Courses taken after this one: $coursesTaken")


    val string = "This is a string."
    val year = 1956
    val gigaWatts = 1.21
    val timeTravel = true

    println (string)
    println (year)
    println (gigaWatts)
    println (timeTravel)

    println("$name is almost done with $major")
    println("After $major graduation I plan to cook $favfood with ${gigaWatts + 1} gigawatts of energy.")
    println("Length of the string sentence: ${string.length}")

    print("What is your favorite season? ")
    val season = readlnOrNull()
    println ("Yes, $season is a great season. Except winters in CNY")












}