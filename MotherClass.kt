interface InterfaceForMotherClass{

    val valFromInterface: String

    fun functionFromInterface(){
        println("Interface default")
    }
}

open class MotherClass: InterfaceForMotherClass {

    override val valFromInterface: String
        get() = "override val in mother class"

    open var providerInfo: String? = "defaul provider"

    open fun printInfo(personConstructors: PersonConstructors){
        println("print defaul")
        personConstructors.printInfo()
        println()
    }
}