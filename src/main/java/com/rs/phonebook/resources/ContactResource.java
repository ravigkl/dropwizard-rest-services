package com.rs.phonebook.resources;

import com.rs.phonebook.core.Contact;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/contact")
@Produces(MediaType.APPLICATION_JSON)
public class ContactResource {

    @GET
    @Path("/{id}")
    public Response getContact(@PathParam("id") int id){

        //return Response.ok("{contact_id: " + id + ", name: \"Dummy Name\", phone: \"+0123456789\" }").build();
        //Now, I will use the POJO to get the JSON structure
        return Response.ok(new Contact(id, "John", "Dear", "+18765431020")).build();
    }

    @POST
    public Response createContact(@FormParam("name") String name, @FormParam("phone") String phone){
        return Response.created(null).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteContact(@PathParam("id") int id){
        return Response.noContent().build();
    }

    @PUT
    @Path("/{id}")

    public Response updateContact(@PathParam("id") int id, @FormParam("firstName") String firstName,
                                  @FormParam("lastName") String lastName, @FormParam("phone") String phone){
        return Response.ok(new Contact(id, firstName, lastName, phone)).build();
    }

}
