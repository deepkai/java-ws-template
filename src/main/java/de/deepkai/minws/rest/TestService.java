package de.deepkai.minws.rest;

import de.deepkai.minws.model.TestModel;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDateTime;

/**
 * Created by Kai on 29.06.2017.
 */
@Path("test")
public class TestService {

    @GET
    @Path("/test")
    @Produces("text/plain")
    public Response test() {
        return Response.ok("Hallo Welt").build();
    }

    @GET
    @Path("/time")
    @Produces(MediaType.APPLICATION_JSON)
    public LocalDateTime getTime() {
        return LocalDateTime.now();
    }

    @PUT
    @Path("/put-temp")
    @Consumes("application/json")
    @Produces("text/plain")
    public Response testTemp(TestModel[] data) {
        for (TestModel t : data) {
            System.out.printf("Time: %s, Temp: %f\n", t.getTime().toString(), t.getTemperatur());
        }
        return Response.ok("Done").build();
    }
}
