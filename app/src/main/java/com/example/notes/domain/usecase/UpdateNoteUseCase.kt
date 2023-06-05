package com.example.notes.domain.usecase

import Note
import com.example.notes.domain.repository.NoteRepository
import javax.inject.Inject

class UpdateNoteUseCase @Inject  constructor(
    private val noteRepository: NoteRepository
) {

    fun updateNote(note: Note) = noteRepository.updateNote(note)

}