//a function that return a String and have a String parameter
fun saySomething(something: String): String{
    return something;
}

fun sayLotThins(something: String,anotherThing: String,andAnother: String): String{
    return "something = $something, \nanotherThing = $anotherThing, \nandAnother = $andAnother "
}

fun sayThingToListOfThings(somethingTosay: String, listOfThings: List<String>){
    listOfThings.forEach{ listOfThing ->
        println("$somethingTosay say to $listOfThing")
    }

}

fun main(args: Array<String>) {

    //val is final
    val name: String = "Rufus"

    println("name = $name")

    //var is variable
    var nameR: String = "Catherine"

    nameR = "Josephine"

    println("nameR = $nameR")

    //defaul variable in Kotlin don't have null value
    //so you need "?"
    var name_null: String? = null

    name_null = "void"

    //FUNCTIONAL PROGRAM
    when(name_null){
        null -> println("null")
        else -> println(name_null)
    }

    val greetingToPrint = if(name_null != null) nameR else "oh no"

    println("greetingToPrint = $greetingToPrint")

    println("a text from a function with parameter (thing) = \"" + saySomething("thing" + "\""))

    println(sayLotThins("one", "two","three"))

    //arrays in Kotlin

    val arrayOfThings = arrayOf("chair","door","guitar")

    println(arrayOfThings.size)
    println(arrayOfThings.get(0))
    println(arrayOfThings.get(1))
    println(arrayOfThings.get(2))

    arrayOfThings.forEach {
        println("for each arrayOfThings = " + it)
    }

    arrayOfThings.forEachIndexed { index, arrayOfThings ->
        println("from index[" + index + "] arrayOfThings = " + arrayOfThings)

    }

    //for lists not mutable
    val listOfThings = listOf("one list", "two list", "three list")

    listOfThings.forEach {
        println("for each listOfThings = " + it)
    }

    //for maps not mutable
    val mapOfThings = mapOf(1 to "a", 3 to "c", 5 to "e")

    println("in maps we have:")

    mapOfThings.forEach{ key, value ->
        println("key = $key and value = $value")

    }

    val mapTest = mapOf("bla" to true,"ble" to false, "bli" to true)

    println("in another maps we have:")

    mapTest.forEach{ key, value ->
        println("key = $key and value = $value")

    }

    //mutable lists and maps

    val listOfThingsMutable = mutableListOf("one list", "two list", "three list")
    listOfThingsMutable.add("four list")
    val mapOfThingsMutable = mutableMapOf(1 to "a", 3 to "c", 5 to "e")
    mapOfThingsMutable.put(6,"f")

    println()

    sayThingToListOfThings("(it is hot)", listOfThingsMutable)



    //FUNCTIONAL PROGRAM
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
}