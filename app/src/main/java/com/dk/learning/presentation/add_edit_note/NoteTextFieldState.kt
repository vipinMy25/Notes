package com.dk.learning.presentation.add_edit_note

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)
