package com.boshra.cleanarch.reader.framework.datasourceimpl

import android.content.Context
import com.boshra.cleanarch.reader.core.data.DocumentDataSource
import com.boshra.cleanarch.reader.core.domain.Document
import com.boshra.cleanarch.reader.framework.db.DocumentEntity
import com.boshra.cleanarch.reader.framework.db.MajesticReaderDatabase

class RoomDocumentDataSource(context: Context): DocumentDataSource {

    private val docDao = MajesticReaderDatabase.getInstance(context).documentDao()

    override suspend fun add(document: Document) {
        docDao.addDocument(DocumentEntity(document.url,document.name,
        document.size, document.thumbnail))
    }

    override suspend fun readAll(): List<Document> {
        return docDao.getDocuments()
            .map { Document(it.uri,it.title,it.size,it.thumbnailUri) }
    }

    override suspend fun remove(document: Document) {
        docDao.removeDocument(
            DocumentEntity(document.url,
            document.name, document.size, document.thumbnail)
        )
    }
}