package com.example.notesapplication

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "NotesTable")
class Note(@ColumnInfo(name="title") val noteTitle:String,@ColumnInfo(name="descrption")val noteDescription:String,@ColumnInfo(name="timeStamp")val timeStamp:String) {
    @PrimaryKey(autoGenerate = true)var id=0
}

