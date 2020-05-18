package pe.com.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.com.daointerface.BooksDao;
import pe.com.entity.Books;
import pe.com.serviceinterface.BooksService;

@Named
@RequestScoped
public class BooksServiceImpl implements BooksService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private BooksDao iD;

	@Override
	public void insert(Books i) {
		iD.insert(i);
	}

	@Override
	public List<Books> list() {
		// TODO Auto-generated method stub
		return iD.list();
	}


	public void modificar(Books i) {
		// TODO Auto-generated method stub
		iD.modificar(i);
	}
	
	@Override
	public void delete(int idlibros) {
		iD.delete(idlibros);
	}
}