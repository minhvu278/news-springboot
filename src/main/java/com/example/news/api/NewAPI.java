package com.example.news.api;

import com.example.news.dto.NewDTO;
import com.example.news.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class NewAPI {

    @Autowired
    private INewService newService;

    @PostMapping(value = "/new")
    public NewDTO createNew(@RequestBody NewDTO model) {
        return newService.save(model);
    }

    @PutMapping(value = "/new/{id}")
    public NewDTO updateNew(@RequestBody NewDTO model, @PathVariable("id") Long id)  {
        model.setId(id);
        return newService.save(model);
    }

    @DeleteMapping(value = "/new")
    public void  deleteNew(@RequestBody long[] ids) {

    }

}
