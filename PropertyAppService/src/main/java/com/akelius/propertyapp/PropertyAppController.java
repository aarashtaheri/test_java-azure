package com.akelius.propertyapp;

import java.util.ArrayList;
import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/json")
public class PropertyAppController {
	@GET
	@Path("/question/{id}")
	@Produces(MediaType.APPLICATION_JSON)    
    public Question getQuestion(@PathParam("id") int id)
    {
		
		Question q1 = new Question();
		q1.setId(1);
		q1.setText("Hello how are you?");
		q1.setDescription("This is a question");
		
        return q1;
    }
	
	
	@GET
	@Path("/questions")
	@Produces(MediaType.APPLICATION_JSON)    
    public Collection<Question> getAllQuestions()
    {
		
		Question q1 = new Question();
		q1.setId(1);
		q1.setText("Hello how are you?");
		q1.setDescription("This is a question");
		Collection<Question> qs = new ArrayList<Question>();
		qs.add(q1);
		
        return qs;
    }
}
