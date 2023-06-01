package com.example.notes.domain.usecase

import Note
import com.example.notes.domain.repository.NoteRepository

class UpdateNoteUseCase(
    private val noteRepository: NoteRepository
) {

    fun updateNote(note: Note) = noteRepository.updateNote(note)

}