package ch.zhaw.sml.iwi.meng.CineSearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ch.zhaw.sml.iwi.meng.CineSearch.entity.Provider;
import ch.zhaw.sml.iwi.meng.CineSearch.entity.ProviderRepository;

@Component
public class ProviderController {


    @Autowired
    private ProviderRepository providerRepository;

    public List<Provider> listAllProviders(String provider) {
        return providerRepository.findAllByProviderName(provider);
    }

    /* 
    public void persistToDo(Provider newToDo, String owner) {
        newToDo.setOwner(owner);
        newToDo.setId(null);
        toDoRepository.save(newToDo);
    }

    public void updateToDo(Provider toDo, String owner) {
        Provider orig = toDoRepository.getOne(toDo.getId());
        // Check if the original ToDo was present and that it belonged to the same owner
        if(orig == null || !orig.getOwner().equals(owner)) {
            return;
        }
        // Ok, let's overwrite the existing toDo.
        toDo.setOwner(owner); // Set the owner because this property is ignored in the Rest API
        toDoRepository.save(toDo);
    }
    */
    
}