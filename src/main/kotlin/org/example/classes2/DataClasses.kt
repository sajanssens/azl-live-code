package org.example.classes2

open class Persoon(
    var naam: String,
    val leeftijd: Int?,
    var geslacht: Geslacht,
    val auto: Auto
) {
    override fun toString(): String {
        return "Persoon(naam='${this.naam}', leeftijd=$leeftijd, geslacht=$geslacht, auto=$auto)"
    }
}

class Auto(val merk: String, var snelheid: Int) {
    override fun toString(): String {
        return "Auto(merk='$merk', snelheid=$snelheid)"
    }

    infix fun geefGas(hoeveelheid: Int): Int {
        this.snelheid += hoeveelheid
        return this.snelheid
    }
}

enum class Geslacht { MAN, VROUW, BINAIR }

class Deelnemer(n: String, l: Int?, g: Geslacht, a: Auto) : Persoon(n, l, g, a) {
    var adv: ActiefDienstverband? = null
}

class ActiefDienstverband
