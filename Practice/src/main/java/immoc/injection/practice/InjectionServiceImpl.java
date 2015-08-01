package immoc.injection.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class InjectionServiceImpl implements InjectionService {
	
	@Autowired private InjectionDAO injectionDAO;
	
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}
    
	public void save(String arg) {
		System.out.println("Parameter received in service : " +arg);
		arg = arg + ":" + this.hashCode();
		injectionDAO.save(arg);
	}
}
