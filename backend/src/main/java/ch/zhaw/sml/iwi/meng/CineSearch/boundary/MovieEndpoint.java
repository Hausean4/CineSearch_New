package ch.zhaw.sml.iwi.meng.CineSearch.boundary;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.sml.iwi.meng.CineSearch.controller.MovieController;
import ch.zhaw.sml.iwi.meng.CineSearch.entity.Movie;

@RestController
@CrossOrigin
public class MovieEndpoint {

    @Autowired
    private MovieController movieController;

    @RequestMapping(path = "/api/movie", method = RequestMethod.GET)
    @PreAuthorize("isAuthenticated() AND hasRole('USER')")
    public List<Movie> getMovie(Principal principal) {
        return movieController.listAllMovies(principal.getName());
    }
    
    /* 
    @RequestMapping(path = "/api/project/{id}", method = RequestMethod.POST)
    @PreAuthorize("isAuthenticated() AND hasRole('USER')")
    public void addToDo(@RequestParam(name="id") Long projectId, @RequestBody Provider toDo,  Principal principal) {
        projectController.addToDo(projectId, toDo, principal.getName());
    }
    */
}