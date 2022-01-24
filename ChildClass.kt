class ChildClass: MotherClass() {

    override val valFromInterface: String
        get() = "override in child class"

    override var providerInfo: String? = "child"

    override fun printInfo(personConstructors: PersonConstructors) {
        super.printInfo(personConstructors)
        println("some override in child")

    }

}

fun main(){

    val child = ChildClass()

    child.printInfo(PersonConstructors())

    println(child.valFromInterface)

}