package io.egen.movie.service;

import java.util.List;

import org.hibernate.tool.schema.internal.exec.ImprovedDatabaseInformationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import io.egen.movie.entity.Movies;
import io.egen.movie.exceptions.MovieAlreadyExistsException;
import io.egen.movie.exceptions.MovieNotFoundException;
import io.egen.movie.repository.MovieRepository;

@Service
public class MovieServiceImp implements MovieService {

	@Autowired
	MovieRepository repository;
	@Override
	public List<Movies> findAll() {
		
		return repository.findAll();
	}

	@Override
	public Movies findOne(String imdbId) {
		Movies existing=repository.findOne(imdbId);
		if (existing==null){
			throw new MovieNotFoundException("Movie with imdb:"+imdbId+ "not found");
		}
		return existing;
	}

	@Override
	public Movies create(Movies mov) {
		Movies existing=repository.findBytitle(mov.getTitle());
		if (existing!=null){
			throw new MovieAlreadyExistsException("Email is already in use:"+mov.getTitle());
		}
		return repository.create(mov);
		
	}

	@Override
	public Movies update(Movies mov,String imdbId) {
		Movies existing=repository.findOne(imdbId);
		if (existing==null){
			throw new MovieNotFoundException("Movie with imdb:"+imdbId+ "not found");
		}
		return repository.update(mov);
	}

	@Override
	public Movies delete(String imdbId) {
	
		Movies existing=repository.findOne(imdbId);
		if (existing==null){
			throw new MovieNotFoundException("Movie with imdb:"+imdbId+ "not found");
		}
		return repository.delete(imdbId);
	}




}
