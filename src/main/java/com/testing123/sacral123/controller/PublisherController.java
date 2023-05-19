package com.testing123.sacral123.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testing123.sacral123.model.Publisher;
import com.testing123.sacral123.service.PublisherService;

@RestController
@RequestMapping("/publishers")
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    @GetMapping("/byName")
    public List<Publisher> getByName(@RequestParam("name") String name) {
        return publisherService.getByName(name);
    }

    @GetMapping("/byId/{id}")
    public Optional<Publisher> getById(@PathVariable("id") Long id) {
        return publisherService.getById(id);
    }

    @GetMapping("/byActiveTrue")
    public List<Publisher> getByActiveTrue() {
        return publisherService.getByActiveTrue();
    }

    @GetMapping("/byNameAndActiveTrue")
    public List<Publisher> getByNameAndActiveTrue(@RequestParam("name") String name) {
        return publisherService.getByNameAndActiveTrue(name);
    }

    @GetMapping("/byNameAndActiveFalse")
    public List<Publisher> getByNameAndActiveFalse(@RequestParam("name") String name) {
        return publisherService.getByNameAndActiveFalse(name);
    }

    @GetMapping("/byNameAndActive")
    public List<Publisher> getByNameAndActive(@RequestParam("name") String name, @RequestParam("active") boolean active) {
        return publisherService.getByNameAndActive(name, active);
    }

    @GetMapping("/byActive")
    public List<Publisher> getByActive(@RequestParam("active") boolean active) {
        return publisherService.getByActive(active);
    }

    @PutMapping("/edit")
    public void editPublisher(@RequestParam("id") Long id, @RequestParam("name") String name, @RequestParam("active") boolean active) {
        publisherService.editPublisher(id, name, active);
    }

    @PostMapping("/delete/{id}") 
    public void deletePublisher(@PathVariable("id") Long id) {
        publisherService.deletePublisher(id);
    }

    @PostMapping("/download")
    public void downloadBranchesAsCsvFile(){
        publisherService.downloadBranchesAsCsvFile();
    }

    @PostMapping("/submit")
    public void submit(){
        publisherService.submit();
    }
    
    @PostMapping("/reset")
    public void reset(){
        publisherService.reset();
    }
}