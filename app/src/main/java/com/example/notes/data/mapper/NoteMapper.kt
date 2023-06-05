package com.example.notes.data.mapper

import Note
import com.example.notes.data.model.NoteEntity


fun Note.toEntity() = NoteEntity(id, title, description)

fun NoteEntity.toNote() = Note(id, title, description)