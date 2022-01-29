package com.boshra.cleanarch.reader.core.interactors

import com.boshra.cleanarch.reader.core.data.DocumentRepository
import com.boshra.cleanarch.reader.core.domain.Document


class SetOpenDocument(private val documentRepository: DocumentRepository) {
  operator fun invoke(document: Document) = documentRepository.setOpenDocument(document)
}