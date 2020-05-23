package cl.prezdev.buildproduct.controller;

import cl.prezdev.buildproduct.repository.PackComponentRepository;
import cl.prezdev.buildproduct.service.PackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {

    @Autowired
    private PackService packService;

    @GetMapping("/test")
    public ResponseEntity test(){
        return ResponseEntity.ok(packService.findAllPacks());
    }
}