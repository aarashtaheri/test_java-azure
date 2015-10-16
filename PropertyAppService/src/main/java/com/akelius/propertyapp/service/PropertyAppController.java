package com.akelius.propertyapp.service;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.akelius.propertyapp.dao.QuestionDAOImpl;
import com.akelius.propertyapp.domain.Question;

@Path("/json")
public class PropertyAppController {

	QuestionDAOImpl<Question, Integer> questionDAO = new QuestionDAOImpl<Question, Integer>();
	
	@GET
	@Path("/question/{id}")
	@Produces(MediaType.APPLICATION_JSON)    
    public Question getQuestion(@PathParam("id") int id)
    {
		
        return questionDAO.getOne(id);
    }
	
	
	@GET
	@Path("/questions")
	@Produces(MediaType.APPLICATION_JSON)    
    public Collection<Question> getAllQuestions()
    {		
		return questionDAO.getAll();
		
    }
}
