package org.application.notecalendarserver.repository;

import org.application.notecalendarserver.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {



}
