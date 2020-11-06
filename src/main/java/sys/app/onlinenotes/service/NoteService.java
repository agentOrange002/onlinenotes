package sys.app.onlinenotes.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import sys.app.onlinenotes.entity.Note;

public interface NoteService {

	Mono<Note> createNote(Note note);

	Flux<Note> getNotes();

	Mono<Note> getNoteById(String id);

}
