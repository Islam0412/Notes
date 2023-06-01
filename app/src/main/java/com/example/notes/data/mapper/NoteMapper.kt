package com.example.notes.data.mapper

import com.example.notes.data.model.NoteEntity
import com.geektech.notes.domain.model.Note


fun Note.toEntity() = NoteEntity(id, title, description)

fun NoteEntity.toNote() = Note(id, title, description)