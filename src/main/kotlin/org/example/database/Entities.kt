package org.example.database

import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.javatime.date
import org.jetbrains.exposed.sql.javatime.datetime

object Movie : IntIdTable("movie") {
    val name = varchar("name", 256)
    val producerName = varchar("producer_name", 255)
    val releaseDate = datetime("release_date")
}

object Actor : IntIdTable("actor") {
    val firstName = varchar("first_name", 256)
    val lastName = varchar("last_name", 256)
    val dateOfBirth = date("date_of_birth")
}

object MovieActor : IntIdTable("movieactor") {
    val actorId = integer("actor_id").references(Actor.id, onDelete = ReferenceOption.CASCADE)
    val movieId = integer("movie_id").references(Movie.id, onDelete = ReferenceOption.CASCADE)
}
