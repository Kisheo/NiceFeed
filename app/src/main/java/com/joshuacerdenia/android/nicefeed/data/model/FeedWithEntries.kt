package com.joshuacerdenia.android.nicefeed.data.model

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class FeedWithEntries(
    @Embedded val feed: Feed,
    @Relation(
        parentColumn = "url",
        entityColumn = "guid",
        associateBy = Junction(FeedEntryCrossRef::class)
    )
    val entries: List<Entry>
)