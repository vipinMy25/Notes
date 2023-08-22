package com.dk.learning.domain.use_case

import com.dk.learning.domain.model.Note
import com.dk.learning.domain.repository.NoteRepository

class DeleteNoteUseCase(private val repository: NoteRepository) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }

}