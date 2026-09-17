package week4wed

fun main ()
{
    println("--Req 1: Take nothing, return nothing--")
    describeToday()

    println("--Req 2: Taking nothing and returning a String--")
    println("I can't live without my ${favThing()}")

    println("--Req 3: Parameters--")
    println(birdPicker(3))
    println(birdPicker(7))
    println(birdPicker(1))

    println("--Req 4: Parameters the short way--")
    println(birdPicker1(5))

    println("--Req 5: Default parameters--")
    println(birdPicker2(4, "JJ"))
    println(birdPicker2(name = "Frodo"))

}

fun describeToday ()
{
    println("Living the dream.")
}

fun favThing () : String
{
    return("boombox.")
}

fun birdPicker (birdNumber: Int): String
{
    return when (birdNumber)
    {
        1->"Crow"
        2->"Peacock"
        3->"Albatross"
        4->"Blue bird"
        else->"Penguin"
    }
}

fun birdPicker1 (birdNumber: Int): String = when (birdNumber)
{
    1->"Crow"
    2->"Peacock"
    3->"Albatross"
    4->"Blue bird"
    else->"Penguin"
}

fun birdPicker2 (birdNumber: Int = 1, name: String = "You"): String {
    val bird = when (birdNumber)
    {
        1->"Crow"
        2->"Peacock"
        3->"Albatross"
        4->"Blue bird"
        else-> "Penguin"
    }
return "$name: $bird"
}
