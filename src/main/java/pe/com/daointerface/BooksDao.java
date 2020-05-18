package pe.com.daointerface;

import java.util.List;

import pe.edu.upc.entity.Books;

public interface BooksDao {
	public void insert(Books i);

	public List<Books> list();
	
	public void modificar(Books i);
	
	public void delete(int idlibros);
	
}
