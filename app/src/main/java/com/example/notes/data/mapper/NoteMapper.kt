package com.example.notes.data.mapper

import com.example.notes.domain.model.Note
import com.example.notes.data.model.NoteEntity


fun Note.toEntity() = NoteEntity(id, title, description)

fun NoteEntity.toNote() = Note(id, title, description)