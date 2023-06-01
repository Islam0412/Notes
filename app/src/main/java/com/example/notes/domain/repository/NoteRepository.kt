package com.example.notes.domain.repository

import Note

interface NoteRepository {

    fun getAllNotes(): List<Note>

    fun createNote(note: Note)

    fun updateNote(note: Note)

    fun deleteNote(note: Note)

}