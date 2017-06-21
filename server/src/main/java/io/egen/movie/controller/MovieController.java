package io.egen.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.MediaType;
import io.egen.movie.entity.Movies;
import io.egen.movie.service.MovieService;


@Controller
@RequestMapping(path = "movies")
public class MovieController {
	@Autowired
	MovieService service;

@RequestMapping(method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
		public java.util.List<Movies> findAll(){
			return service.findAll();
		}
	@RequestMapping(method = RequestMethod.GET, path = "{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movies findOne(@PathVariable("id") String Id) {
		return service.findOne(Id);
	}

	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movies create(@RequestBody Movies mov) {
		return service.create(mov);
	}

	@RequestMapping(method = RequestMethod.PUT, path = "{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movies update(@PathVariable("id") String id, @RequestBody Movies mov) {

		return service.update(mov, id);

	}

	@RequestMapping(method = RequestMethod.DELETE, path = "{id}")
	public void delete(@PathVariable("id") String imdbId) {

	}
}
