package io.egen.movie.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.egen.movie.entity.Movies;
@Repository
public class MovieRepositoryImp implements MovieRepository {

	@Override
	public List<Movies> findAll() {
		
		return null;
	}

	@Override
	public Movies findOne(String imdbId) {
	
		return null;
	}

	@Override
	public Movies create(Movies mov) {

		return null;
	}

	@Override
	public Movies update(Movies mov) {
		
		return null;
	}

	@Override
	public Movies delete(String imdbId) {
		
		return null;
	}

	@Override
	public Movies findBytitle(String title) {
		
		return null;
	}

}
