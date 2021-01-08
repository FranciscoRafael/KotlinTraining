fun calc_bonus(a: Int, b: Int, c: Int) : Int {

    return a + b * c
}

fun calc_bonus_x2 (a: Int, b: Int, c: Int) : Int {

    return 2*(a + b * c)

}

fun calc_bonus_1_line(a: Int, b: Int, c: Int) = a + b *c
fun calc_bonus_x2_1_line(a: Int, b: Int, c: Int) = 2*(a + b * c)

fun main() {

    val a = 10
    val b = 20
    val c = 30

    //normal functions
    println("O bonos é: ${calc_bonus(a, b, c)}")
    println("O bonos é: ${calc_bonus_x2(a, b, c)}")


    // one line functions

    println("O bonos é: ${calc_bonus_1_line(a, b, c)}")
    println("O bonos é: ${calc_bonus_x2_1_line(a, b, c)}")
}


