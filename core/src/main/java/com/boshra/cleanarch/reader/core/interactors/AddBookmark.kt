package com.boshra.cleanarch.reader.core.interactors

import com.boshra.cleanarch.reader.core.data.BookmarkRepository
import com.boshra.cleanarch.reader.core.domain.Bookmark
import com.boshra.cleanarch.reader.core.domain.Document

//Each use case class has only one function that invokes the use case
class AddBookmark (private val bookmarkRepository: BookmarkRepository) {
    suspend operator fun invoke(document: Document, bookmark: Bookmark) =
        bookmarkRepository.addBookmark(document, bookmark)
}