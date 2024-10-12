package org.application.notecalendarserver.service;

import org.application.notecalendarserver.model.Note;
import org.application.notecalendarserver.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    public static Long add(Note note, NoteRepository noteRepository) {
        return (long) 0;
    }

    public static Long edit(Note note, NoteRepository NoteRepository) {
        return (long) 0;
    }

    public static Long delete(Note note, NoteRepository noteRepository) {
        return (long) 0;
    }

    public static List<Note> findAll(Long userId, NoteRepository noteRepository) {
        return null;
    }

}
