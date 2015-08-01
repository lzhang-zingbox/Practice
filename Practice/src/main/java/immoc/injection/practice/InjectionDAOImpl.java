package immoc.injection.practice;

import org.springframework.context.annotation.Bean;

public class InjectionDAOImpl implements InjectionDAO {
	
	//simulate database save operation
	public void save(String arg) {
		System.out.println("Save data : " + arg);
	}
}
