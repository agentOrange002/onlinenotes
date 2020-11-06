package sys.app.onlinenotes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import sys.app.onlinenotes.entity.Note;
import sys.app.onlinenotes.repository.NoteRepository;

@Service
public class NoteServiceImpl implements NoteService {
	
	@Autowired
	NoteRepository repository;

	@Override
	public Mono<Note> createNote(Note note) {		
		return Mono.just(repository.save(note));
	}

	@Override
	public Flux<Note> getNotes() {		
		return Flux.fromIterable(repository.findAll());
	}

	@Override
	public Mono<Note> getNoteById(String id) {		
		return Mono.fromCallable(() -> repository.findById(id))
				  .flatMap(optional -> optional.map(Mono::just).orElseGet(Mono::empty));
	}

}
