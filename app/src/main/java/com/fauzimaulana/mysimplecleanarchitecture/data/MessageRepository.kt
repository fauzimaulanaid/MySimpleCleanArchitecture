package com.fauzimaulana.mysimplecleanarchitecture.data

import com.fauzimaulana.mysimplecleanarchitecture.domain.IMessageRepository
import com.fauzimaulana.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}