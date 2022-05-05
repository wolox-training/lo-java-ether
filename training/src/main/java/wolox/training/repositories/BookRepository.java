package wolox.training.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import wolox.training.models.Book;

import java.util.List;

@Component
public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByAuthor(String bookAuthor);

}
