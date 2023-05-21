package com.notes.ModelTests;

import com.notes.models.Note;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoteTest {

    Note testNote;

    @BeforeEach
    public void before() {
        testNote = new Note("Test Title", "This is a test note");
    }

    @Test
    public void canGetTestNoteTitle() {
        assertEquals("Test Title", testNote.getTitle());
    }

    @Test
    public void canGetTestNoteContent() {
        assertEquals("This is a test note", testNote.getContent());
    }
}
