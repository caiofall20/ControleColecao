package services;



import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.glassfish.jersey.jackson.JacksonFeature;


@ApplicationPath("rest")
public class ApplicationJAXRS extends Application {
	
	public Set<Class<?>> getClasses() {
        Set<Class<?>> set = new HashSet<Class<?>>();
        
        set.add(CarrinhoService.class);
        set.add(AutenticacaoService.class);
        
   
        
        return set;
    }
	
	@Override
	public Set<Object> getSingletons() {
		Set<Object> singletons = new HashSet<>();
		singletons.add(new JacksonFeature());
/*		singletons.add(new CORSFilter());*/
		return singletons;
	}

}

