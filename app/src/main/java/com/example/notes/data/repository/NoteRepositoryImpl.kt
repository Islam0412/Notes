package com.example.notes.data.repository

import Note
import com.example.notes.data.local.NoteDao
import com.example.notes.data.mapper.toEntity
import com.example.notes.data.mapper.toNote
import com.example.notes.domain.repository.NoteRepository
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(

    private val noteDao: NoteDao

) : NoteRepository {
    override fun getAllNotes(): List<Note> {
        return noteDao.getAllNotes().map { it.toNote()
        }
    }

    override fun createNote(note: Note) {
        noteDao.createNotes(note.toEntity())
    }

    override fun updateNote(note: Note) {
        noteDao.updateNotes(note.toEntity())
    }

    override fun deleteNote(note: Note) {
        noteDao.deleteNotes(note.toEntity())
    }
}