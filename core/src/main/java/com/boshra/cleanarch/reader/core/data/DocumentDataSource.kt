package com.boshra.cleanarch.reader.core.data

import com.boshra.cleanarch.reader.core.domain.Document

interface DocumentDataSource {
    suspend fun add(document: Document)

    suspend fun readAll(): List<Document>

    suspend fun remove(document: Document)
}