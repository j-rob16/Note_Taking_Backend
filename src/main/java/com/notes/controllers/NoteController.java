package com.notes.controllers;

import com.notes.models.Note;
import com.notes.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class NoteController {

    @Autowired
    NoteRepository noteRepository;

    // GET ALL NOTES
    @GetMapping(value="/notes")
    public ResponseEntity<List<Note>> getAllNotes() {
        return new ResponseEntity<>(noteRepository.findAll(), HttpStatus.OK);
    }

    // GET NOTE BY ID
    @GetMapping(value="/notes/{id}")
    public ResponseEntity<Optional<Note>> getNote(@PathVariable Long id) {
        return new ResponseEntity<>(noteRepository.findById(id), HttpStatus.OK);
    }

    // POST A NEW NOTE
    @PostMapping(value="/notes")
    public ResponseEntity<Note> createNote(@RequestBody Note note) {
        noteRepository.save(note);
        return new ResponseEntity<>(note, HttpStatus.CREATED);
    }
}
