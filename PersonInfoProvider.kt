interface PersonInfoProvider {

    val providerInfo: String

    fun printInfoInterface(person: PersonConstructors){
        println(providerInfo)
        person.printInfo()
    }
}

interface anotherInterface{

    fun printSomething(){
        println("another Interface used")
    }

}

interface andAnotherInterface{
    fun andprintSomething(){
        println("and another Interface used")
    }
}

class BasicInfoProvider: PersonInfoProvider, anotherInterface,andAnotherInterface{
    override val providerInfo: String
        get() = "not override function"

    override fun printInfoInterface(person: PersonConstructors) {
        super.printInfoInterface(person)

        println("more thing to do in override function")
    }
}

fun checkInterface(personInfoProvider: PersonInfoProvider){
    if(personInfoProvider is anotherInterface){
        println("it is a anotherInterface")
    }else{
        println("it is not a anotherInterface")
    }
}

fun main(){

    val provider = BasicInfoProvider()

    provider.printInfoInterface(PersonConstructors())

    provider.printSomething()
    provider.andprintSomething()

    checkInterface(provider)

}