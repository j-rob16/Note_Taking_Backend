package com.notes.components;

import com.notes.models.Note;
import com.notes.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    NoteRepository noteRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {
        Note firstNote = new Note("First Note", "This is the first test note");
        noteRepository.save(firstNote);

        Note secondNote = new Note("Second Data Loader Note", "This is a second note created using the data loader");
        noteRepository.save(secondNote);
    }
}
