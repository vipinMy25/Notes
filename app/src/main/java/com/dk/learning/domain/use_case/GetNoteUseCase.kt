package com.dk.learning.domain.use_case

import com.dk.learning.domain.model.Note
import com.dk.learning.domain.repository.NoteRepository

class GetNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}