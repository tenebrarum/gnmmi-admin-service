package de.gnmmi.gnmmiadminservice.repository

import de.gnmmi.gnmmiadminservice.entity.Message
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface MessageRepository: CrudRepository<Message, String> {

    @Query("SELECT * FROM messages WHERE text NOT NULL")
    fun findMessagesWithText(): List<Message>
}