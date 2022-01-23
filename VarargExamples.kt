fun sayHellotoVararg(greeting: String, vararg thingsToGreet: String){
    thingsToGreet.forEach{ thingToGreet ->
        println("$greeting $thingToGreet")
    }
}

fun multipleParametersNoSignature(firstParameter: String, secondParameter: Int){
    println("first parameter = ($firstParameter), and second parameter = ($secondParameter)")
}

class VarargExamples {
}



fun main(){

    println()

    sayHellotoVararg("hi no one")

    sayHellotoVararg("hello", "one vararg")

    sayHellotoVararg("hello", "two vararg", "three vararg")

    sayHellotoVararg("hello", "four vararg", "five vararg", "six vararg")

    multipleParametersNoSignature(secondParameter = 3, firstParameter = "not first")

}