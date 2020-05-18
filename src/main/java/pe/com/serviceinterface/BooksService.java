package pe.com.serviceinterface;

import java.util.List;
import pe.com.entity.Books;

public interface BooksService {
	public void insert(Books i);

	public List<Books> list();
	 public void modificar(Books i);
	 public void delete(int idlibros);
	 
}