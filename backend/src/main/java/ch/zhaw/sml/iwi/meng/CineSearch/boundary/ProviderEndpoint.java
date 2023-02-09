package ch.zhaw.sml.iwi.meng.CineSearch.boundary;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.sml.iwi.meng.CineSearch.controller.ProviderController;
import ch.zhaw.sml.iwi.meng.CineSearch.entity.Provider;

@RestController
@CrossOrigin
public class ProviderEndpoint {

    @Autowired
    private ProviderController providerController;

    @RequestMapping(path = "/api/provider", method = RequestMethod.GET)
    @PreAuthorize("isAuthenticated() AND hasRole('USER')")
    public List<Provider> provider(Principal principal) {
        return  providerController.listAllProviders(principal.getName());        
    }

    /* 
    @RequestMapping(path = "/api/todo", method = RequestMethod.POST)
    @PreAuthorize("isAuthenticated() AND hasRole('USER')")
    public void addToDo(@RequestBody Provider newToDo, Principal principal) {
        toDoController.persistToDo(newToDo, principal.getName());
    }
    
    @RequestMapping(path = "/api/todo", method = RequestMethod.PUT)
    @PreAuthorize("isAuthenticated() AND hasRole('USER')")
    public void updateToDo(@RequestBody Provider toDo, Principal principal) {
        toDoController.updateToDo(toDo, principal.getName());
    }
    */
}