package com.boshra.cleanarch.reader.core.interactors

import com.boshra.cleanarch.reader.core.data.DocumentRepository
import com.boshra.cleanarch.reader.core.domain.Document


class RemoveDocument(private val documentRepository: DocumentRepository) {
  suspend operator fun invoke(document: Document) = documentRepository.remove(document)
}