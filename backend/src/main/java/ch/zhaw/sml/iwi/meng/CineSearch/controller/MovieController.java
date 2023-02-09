package ch.zhaw.sml.iwi.meng.CineSearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ch.zhaw.sml.iwi.meng.CineSearch.entity.Movie;
import ch.zhaw.sml.iwi.meng.CineSearch.entity.MovieRepository;

@Component
public class MovieController {


    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> listAllMovies(String movie) {
        return movieRepository.findByMovieName(movie);
    }

    /*
    public void persistProject(Movie newProject, String owner) {
        newProject.setId(null);
        // We only create empty projects
        newProject.getToDos().clear();
        newProject.setOwner(owner);
        projectRepository.save(newProject);
    }

    public void addToDo(Long projectId, Provider toDo, String owner) {
        Movie project = projectRepository.getOne(projectId);
        if(project == null || !project.getOwner().equals(owner)) {
            return;
        }  
        // Ensure that JPA creates a new entity
        toDo.setId(null);
        toDo.setOwner(owner);
        project.getToDos().add(toDo);
        projectRepository.save(project);
    }
    */
    
}