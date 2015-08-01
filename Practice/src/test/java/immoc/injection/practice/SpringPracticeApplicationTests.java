package immoc.injection.practice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringPracticeApplication.class)
@Configuration

public class SpringPracticeApplicationTests {
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(InjectionCfg.class);
	
	@Test
	public void testSetter() {
		
		//InjectionService service = ctx.getBean(InjectionServiceImpl.class);
		InjectionService service = ctx.getBean(InjectionService.class);
		
		service.save("Hello Injection");
	}
}
