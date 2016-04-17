package com.abhirockzz.jaxrs.jwt.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


/**
 *
 * just a test resource
 */
@Path("books")
//@RolesAllowed("superuser")
//@DenyAll
public class BooksResource {

    @GET
    public Response all(@Context SecurityContext ctx) {
        Response resp = Response.
                ok("Welcome to the Book shop! "+ ctx.getUserPrincipal().getName() + " superuser: " + ctx.isUserInRole("superuser") + " | users: " + ctx.isUserInRole("users") ).
                build();

        return resp;
    }
}
