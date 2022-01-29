package com.boshra.cleanarch.reader.core.interactors

import com.boshra.cleanarch.reader.core.data.DocumentRepository

class GetDocuments(private val documentRepository: DocumentRepository) {
  suspend operator fun invoke() = documentRepository.getDocuments()
}
