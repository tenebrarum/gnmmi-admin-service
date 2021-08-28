package de.gnmmi.gnmmiadminservice.service

import de.gnmmi.gnmmiadminservice.entity.Message
import de.gnmmi.gnmmiadminservice.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService (val messageRepository: MessageRepository) {


    fun getMessages(): List<Message> {
        return messageRepository.findAll().toList()
    }

    fun createMessage(message: Message): Message {
        return messageRepository.save(message)
    }
}