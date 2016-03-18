package com.abhirockzz.jaxrs.jwt;

import com.abhirockzz.jaxrs.jwt.boundary.AuthResource;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * specific to /auth/token
 */
@ApplicationPath("auth")
public class ProtectedJAXRSConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> clazzes = new HashSet();
        //clazzes.add(AuthFilter.class);
        clazzes.add(AuthResource.class);
        //clazzes.add(ReponseFilter.class);

        return clazzes;
        //return super.getClasses(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
