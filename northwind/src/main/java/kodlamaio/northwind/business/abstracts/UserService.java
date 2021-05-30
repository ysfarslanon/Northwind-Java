package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.results.*;

public interface UserService {
	Result add(User user);
	DataResult<List<User>> findAll();
	DataResult<User> findByEmail(String email);
}
