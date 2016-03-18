package com.abhirockzz.jaxrs.jwt.boundary;

import com.abhirockzz.jaxrs.jwt.JWTokenUtility;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

/**
 *
 * just a dummy resource used to return the JWT token in response header
 */
@Path("token")
public class AuthResource {

    @Context
    SecurityContext sctx;

    @GET
    @Produces("text/plain")
    public Response auth() {
        System.out.println("Authenticated user: " + sctx.getUserPrincipal().getName());

        //this.sctx = sctx;
        String authenticatedUser = sctx.getUserPrincipal().getName();
        Response resp = Response.ok(authenticatedUser + " authenticated")
                .header("jwt", JWTokenUtility.buildJWT(authenticatedUser))
                .build();

        return resp;
    }

}
