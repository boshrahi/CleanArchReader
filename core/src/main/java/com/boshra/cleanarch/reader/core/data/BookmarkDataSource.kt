package com.boshra.cleanarch.reader.core.data

import com.boshra.cleanarch.reader.core.domain.Bookmark
import com.boshra.cleanarch.reader.core.domain.Document

interface BookmarkDataSource {

    suspend fun add(document: Document, bookmark: Bookmark)

    suspend fun read(document: Document): List<Bookmark>

    suspend fun remove(document: Document, bookmark: Bookmark)
}