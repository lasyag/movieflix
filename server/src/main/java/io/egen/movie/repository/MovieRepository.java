package io.egen.movie.repository;

import java.util.List;

import io.egen.movie.entity.Movies;

public interface MovieRepository {
	public List<Movies> findAll() ;
	public Movies findOne(String imdbId);
	public Movies findBytitle(String title );
	public Movies create(Movies mov);
	public Movies update(Movies mov) ;
	public Movies delete(String imdbId);
}
