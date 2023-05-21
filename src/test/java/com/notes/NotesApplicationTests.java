package com.notes;

import com.notes.models.Note;
import com.notes.repositories.NoteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class NotesApplicationTests {

	@Autowired
	NoteRepository noteRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createNewNote() {
		List<Note> initialNotes = noteRepository.findAll();
		assertEquals(2, initialNotes.size());
		Note testNote = new Note("Unit Test", "Test if this note can be saved to the repository");
		noteRepository.save(testNote);
		List<Note> allNotes = noteRepository.findAll();
		assertEquals(3, allNotes.size());
	}

}
