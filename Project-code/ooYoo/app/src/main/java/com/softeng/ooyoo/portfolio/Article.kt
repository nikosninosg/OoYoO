package com.softeng.ooyoo.portfolio

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * This class represents an article.
 */
@Parcelize
class Article (
        private val id: String = "",
        private val title: String = "",
        private val body: String = "",
        private val authorId: String = "",
        private val likes: Int = 0,
        private val comments: ArrayList<String> = arrayListOf()
): Parcelable