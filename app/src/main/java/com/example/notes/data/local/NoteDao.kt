package com.example.notes.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.notes.data.model.NoteEntity

@Dao
interface NoteDao {

    @Query("SELECT * FROM notes")
    fun getAllNotes(): List<NoteEntity>

    @Insert
    fun createNotes(noteEntity: NoteEntity)

    @Update
    fun updateNotes(noteEntity: NoteEntity)

    @Delete
    fun deleteNotes(noteEntity: NoteEntity)
}