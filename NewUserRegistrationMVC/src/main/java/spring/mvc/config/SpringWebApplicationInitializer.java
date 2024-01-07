package spring.mvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class SpringWebApplicationInitializer implements WebApplicationInitializer {

	private WebApplicationContext getContext() {
		AnnotationConfigWebApplicationContext  ctx = new AnnotationConfigWebApplicationContext();
		
		ctx.setConfigLocation("spring");
		
		return ctx;
		
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		WebApplicationContext WebCtx = getContext();
		
		DispatcherServlet frontControllServlet = new DispatcherServlet(WebCtx);
		
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("frontController", frontControllServlet);
		
		dispatcher.addMapping("/");
		
	}
}
