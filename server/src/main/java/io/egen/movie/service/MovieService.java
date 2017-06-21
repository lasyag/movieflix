package io.egen.movie.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.egen.movie.entity.Movies;
@Service
public interface MovieService {

	public List<Movies> findAll() ;
	public Movies findOne(String imdbId);
	public Movies create(Movies mov);
    public Movies delete(String imdbId);
    public	Movies update(Movies mov, String imdbId);
}
