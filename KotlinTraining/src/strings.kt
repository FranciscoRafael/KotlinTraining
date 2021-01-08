fun main() {

    val string: String = "Valor imutavel de string"
    val charc: String = " Vamos testar"
    println(string)
    println(charc)

    val result = string + charc
    println(result)

    //melhor jeito de concactenar

    val frase: String = "Kotlin é uma linguagem"
    val carac: String = "Show"

    println("Kotlin é uma linguagem $carac")
    println("Kotlin é uma linguagem ${carac.length}")
}