package com.boshra.cleanarch.reader.framework.datasourceimpl

import android.content.Context
import com.boshra.cleanarch.reader.core.data.BookmarkDataSource
import com.boshra.cleanarch.reader.core.domain.Bookmark
import com.boshra.cleanarch.reader.core.domain.Document
import com.boshra.cleanarch.reader.framework.db.BookmarkEntity
import com.boshra.cleanarch.reader.framework.db.MajesticReaderDatabase

class RoomBookmarkDataSource(context: Context) : BookmarkDataSource {

    private val bookmarkDao = MajesticReaderDatabase.getInstance(context).bookmarkDao()

    override suspend fun add(document: Document, bookmark: Bookmark) =
        bookmarkDao.addBookmark(
            BookmarkEntity(
            documentUri = document.url,
            page = bookmark.page))

    override suspend fun read(document: Document): List<Bookmark> = bookmarkDao
        .getBookmarks(document.url).map { Bookmark(it.id, it.page)}


    override suspend fun remove(document: Document, bookmark: Bookmark) =
        bookmarkDao.removeBookmark(
            BookmarkEntity(id = bookmark.id, documentUri = document.url, page = bookmark.page)
        )
}