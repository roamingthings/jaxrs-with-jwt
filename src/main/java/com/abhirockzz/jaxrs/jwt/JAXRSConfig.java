package com.abhirockzz.jaxrs.jwt;

import com.abhirockzz.jaxrs.jwt.filters.JWTAuthFilter;
import com.abhirockzz.jaxrs.jwt.filters.JWTResponseFilter;
import com.abhirockzz.jaxrs.jwt.boundary.BooksResource;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * Specific to /resources/book
 */
@ApplicationPath("resources")
public class JAXRSConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> clazzes = new HashSet();
        clazzes.add(JWTAuthFilter.class);
        clazzes.add(BooksResource.class);
        clazzes.add(JWTResponseFilter.class);

        return clazzes;
    }
}
