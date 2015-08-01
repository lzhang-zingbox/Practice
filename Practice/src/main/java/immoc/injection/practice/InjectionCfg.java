package immoc.injection.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InjectionCfg {
	
	@Bean
	public InjectionDAO injectionDAO() {
		return new InjectionDAOImpl();
	}
	
	@Bean
	public InjectionService injectionService() {
		return new InjectionServiceImpl();
	}
}

