interface PersonInfoProvider {
    fun printInfoInterface(person: PersonConstructors)
}

class BasicInfoProvider: PersonInfoProvider{
    override fun printInfoInterface(person: PersonConstructors) {
        println("override method saying something")
    }
}

fun main(){

    val provider = BasicInfoProvider()

    provider.printInfoInterface(PersonConstructors())

}