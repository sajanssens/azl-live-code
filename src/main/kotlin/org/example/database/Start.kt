package org.example.database

import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction
import java.time.LocalDate

fun main() {
    Database.connect("jdbc:mysql://localhost:3306/exposed", driver = "com.mysql.cj.jdbc.Driver", user = "root", password = "root")

    transaction {
        addLogger(StdOutSqlLogger)

        SchemaUtils.create(Actor, Movie, MovieActor)

        Actor.insert {
            it[firstName] = "Bram"
            it[lastName] = "Janssens"
            it[dateOfBirth] = LocalDate.parse("1975-10-12")
        }

        println(Actor.selectAll())
    }
}
