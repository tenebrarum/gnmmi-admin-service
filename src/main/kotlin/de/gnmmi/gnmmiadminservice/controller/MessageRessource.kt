package de.gnmmi.gnmmiadminservice.controller

import de.gnmmi.gnmmiadminservice.dto.CreateMessageDto
import de.gnmmi.gnmmiadminservice.entity.Message
import de.gnmmi.gnmmiadminservice.service.MessageService
import org.springframework.web.bind.annotation.*

@RestController()
@RequestMapping("messages")
class MessageRessource (val messageService: MessageService) {

    @GetMapping
    fun index(): List<Message> = messageService.getMessages()

    @PostMapping
    fun createMessage(@RequestBody createmessageDto: CreateMessageDto): Message {
        return messageService.createMessage(Message(null, createmessageDto.text))
    }
}