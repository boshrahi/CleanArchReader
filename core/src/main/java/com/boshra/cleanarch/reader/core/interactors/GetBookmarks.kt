package com.boshra.cleanarch.reader.core.interactors

import com.boshra.cleanarch.reader.core.data.BookmarkRepository
import com.boshra.cleanarch.reader.core.domain.Document


class GetBookmarks(private val bookmarkRepository: BookmarkRepository) {

  suspend operator fun invoke(document: Document) = bookmarkRepository.getBookmarks(document)
}