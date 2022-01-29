package com.boshra.cleanarch.reader.core.data

import com.boshra.cleanarch.reader.core.domain.Document

class DocumentRepository (private val documentDataSource: DocumentDataSource,
    private val openDocument: OpenDocumentDataSource){

    suspend fun add(document: Document) = documentDataSource.add(document)
    suspend fun remove(document: Document) = documentDataSource.remove(document)
    suspend fun getDocuments() : List<Document> = documentDataSource.readAll()

    fun getOpenDocuments()  = openDocument.getOpenDocument()
    fun setOpenDocument(document: Document) = openDocument.setOpenDocument(document)
}