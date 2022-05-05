package com.fauzimaulana.mysimplecleanarchitecture.data

import com.fauzimaulana.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}