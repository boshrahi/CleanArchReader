package com.boshra.cleanarch.reader.core.interactors

import com.boshra.cleanarch.reader.core.data.BookmarkRepository
import com.boshra.cleanarch.reader.core.domain.Bookmark
import com.boshra.cleanarch.reader.core.domain.Document

class RemoveBookmark(private val bookmarksRepository: BookmarkRepository) {
  suspend operator fun invoke(document: Document, bookmark: Bookmark) = bookmarksRepository
      .removeBookmark(document, bookmark)
}