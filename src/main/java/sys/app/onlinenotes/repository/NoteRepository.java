package sys.app.onlinenotes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sys.app.onlinenotes.entity.Note;

@Repository
public interface NoteRepository extends CrudRepository<Note, String> {

}
