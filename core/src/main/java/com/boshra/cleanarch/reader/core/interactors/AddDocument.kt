package com.boshra.cleanarch.reader.core.interactors

import com.boshra.cleanarch.reader.core.data.DocumentRepository
import com.boshra.cleanarch.reader.core.domain.Document

class AddDocument (private val docRepo: DocumentRepository) {
    suspend operator fun invoke(document: Document) =
        docRepo.add(document)
}