package com.boshra.cleanarch.reader.framework.datasourceimpl

import com.boshra.cleanarch.reader.core.data.OpenDocumentDataSource
import com.boshra.cleanarch.reader.core.domain.Document

class InMemoryOpenDocumentDataSource : OpenDocumentDataSource {

    private var openDocument: Document = Document.EMPTY

    override fun setOpenDocument(document: Document) {
        openDocument = document
    }

    override fun getOpenDocument() = openDocument
}