package com.example.oshibkinamilliondollarov.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "themes")
data class ThemeModel(
    @PrimaryKey
    val id: Int,
    @ColumnInfo(name="name")
    val name: String,
    @ColumnInfo(name="description")
    val description: String?,
    @ColumnInfo(name = "is_favorite")
    var isFavorite: Int = 0,
    @ColumnInfo(name = "text")
    var text: String?

)