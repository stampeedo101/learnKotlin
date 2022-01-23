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

    when(name_null){
        null -> println("null")
        else -> println(name_null)
    }

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
}