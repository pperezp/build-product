package cl.prezdev.buildproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.prezdev.buildproduct.repository.PackRepository;

@RestController
public class RestTestController {

    @Autowired
    private PackRepository packRepository;

    @GetMapping("/test")
    public ResponseEntity test(){
        return ResponseEntity.ok(packRepository.findAll());
    }
}