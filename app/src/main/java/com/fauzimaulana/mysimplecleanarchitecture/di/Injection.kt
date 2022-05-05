package com.fauzimaulana.mysimplecleanarchitecture.di

import com.fauzimaulana.mysimplecleanarchitecture.data.IMessageDataSource
import com.fauzimaulana.mysimplecleanarchitecture.data.MessageDataSource
import com.fauzimaulana.mysimplecleanarchitecture.data.MessageRepository
import com.fauzimaulana.mysimplecleanarchitecture.domain.IMessageRepository
import com.fauzimaulana.mysimplecleanarchitecture.domain.MessageInteractor
import com.fauzimaulana.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}