package com.boshra.cleanarch.reader.core.interactors

import com.boshra.cleanarch.reader.core.data.DocumentRepository

class GetOpenDocument(private val documentRepository: DocumentRepository) {
  operator fun invoke() = documentRepository.getOpenDocuments()
}
