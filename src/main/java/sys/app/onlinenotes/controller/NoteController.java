package sys.app.onlinenotes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import sys.app.onlinenotes.entity.Note;
import sys.app.onlinenotes.service.NoteService;

@RestController
@RequestMapping({"notes"})
public class NoteController {
	
	@Autowired
	NoteService service;
	
	@Autowired
	Environment env;
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	public Mono<Note> createNote(@RequestBody Note note){
		return service.createNote(note);
	}
	
	@GetMapping(produces = "application/json")
	public Flux<Note> getNotes(){
		return service.getNotes();
	}
	
	@GetMapping("/server")
	public Mono<String> getServer(){
		return Mono.just("Server port is :"+env.getProperty("local.server.port"));
	}
	
	@GetMapping(path="/{id}",produces = "application/json")
	public Mono<Note> getNoteById(@PathVariable String id){
		return service.getNoteById(id);
	}

}
