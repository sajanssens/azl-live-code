package org.example.ch1

fun main() {
    val i = 42

    var bericht = ""
    if (i < 0) {
        bericht = "${i} is negatief"
    } else {
        bericht = "${i + 2} positief"
    }

    var bericht2 = if (i < 0) "Negatief" else "Positief"

    val string = "Dit is een  \n " +
            "blok tekst. Je moet \"quotes\"  escapen."
    println(string)

    val textblock = """
                 |       Dit is een 
                 |       blok tekst. Je hoeft "niets" te escapen.
                """.trimMargin("|")
    println(textblock)

    val som = som(j = 2, i = 1)
    val som2 = som2(j = 2)

    val s1 = "42".padStart(10)
    val s2 = "142".padStart(10)
    println(s1)
    println(s2)

}

fun som(i: Int = 0, j: Int): Int {
    return i + j
}

// expression body
fun som2(i: Int = 0, j: Int) = i + j
