class PersonConstructors(val firstName: String, val age: Int) {

    constructor(): this("john",19){
        println("secondary constructor initialized")
    }

    var nickName: String? = null
    set(value){
        field = value
        println("set invoked with value = " + value)

    }

    fun printInfo(){
//        val nickNameToPrint = if(nickName != null) nickName else "no nickName"
        val nickNameToPrint = nickName ?: "no nickName"
        println("name $firstName age $age and nickname $nickNameToPrint")
    }


}

fun main(){

    val josephine = PersonConstructors("Josephine", 23)

    println("name of person " + josephine.firstName)
    println("age of person " + josephine.age)
    println("nickname = " + josephine.nickName)

    josephine.nickName = "cool person"

    println("new nickname = " + josephine.nickName)

    josephine.printInfo()



}