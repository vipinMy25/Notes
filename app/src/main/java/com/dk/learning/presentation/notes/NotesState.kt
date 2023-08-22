package com.dk.learning.presentation.notes

import com.dk.learning.domain.model.Note
import com.dk.learning.domain.util.NoteOrder
import com.dk.learning.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
