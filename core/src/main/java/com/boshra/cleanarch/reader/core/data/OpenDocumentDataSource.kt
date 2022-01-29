package com.boshra.cleanarch.reader.core.data

import com.boshra.cleanarch.reader.core.domain.Document

interface OpenDocumentDataSource {
    fun setOpenDocument(document: Document)

    fun getOpenDocument(): Document
}