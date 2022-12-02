package org.example.classes2

import org.example.veranderGeslacht

fun main() {
    val auto = Auto("Skoda", 180)

    val mieke = Persoon("Bram", 43, Geslacht.MAN, auto)
    val naam = mieke.naam
    mieke.naam = "Mieke"
    mieke.veranderGeslacht(Geslacht.VROUW)
    println(mieke)

    val bram = Deelnemer("Bram", 43, Geslacht.MAN, auto)

    val a = ActiefDienstverband()
    bram.adv = a

    val personen = listOf(mieke, bram)

    for (p in personen) {
        if (p.geslacht == Geslacht.MAN) {
            println(p)
        }

        if (p is Deelnemer) {
            println(p.adv)
        }
    }

    personen
        .filter { p -> p.geslacht == Geslacht.MAN }
        .forEach { p -> println(p) }

    personen
        .filter { p -> p is Deelnemer }
        .forEach { d -> println(d) }

    val huidigeSnelheid = auto geefGas 50
}

fun String.lastchar(): String {
    return this.last() + ""
}
