package org.example.classes2

interface Benoembaar {
    var naam: String
}

open class Persoon(
    override var naam: String,
    val leeftijd: Int?,
    var geslacht: Geslacht,
    val auto: Auto
) : Benoembaar {

    override fun toString(): String {
        return "Persoon(naam='${this.naam}', leeftijd=$leeftijd, geslacht=$geslacht, auto=$auto)"
    }

    open fun jarig() {
        // doet iets
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

    override fun jarig() {
        // doe iets anders...
    }
}

class ActiefDienstverband

object PersoonDao {
    fun selectAll() {

    }
}

fun main() {
    PersoonDao.selectAll()
    
    val dao = PersoonDao
    dao.selectAll()
}
