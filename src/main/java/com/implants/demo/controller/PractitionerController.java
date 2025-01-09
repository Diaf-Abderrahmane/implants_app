package com.implants.demo.controller;

import com.implants.demo.model.Practitioner;
import com.implants.demo.service.PractitionerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/practitioners")
public class PractitionerController {

    @Autowired
    private PractitionerService practitionerService;

    // GET all practitioners
    @GetMapping
    public ResponseEntity<List<Practitioner>> getAllPractitioners() {
        List<Practitioner> practitioners = practitionerService.getAllPractitioners();
        return ResponseEntity.ok(practitioners);
    }

    // GET a practitioner by ID
    @GetMapping("/{id}")
    public ResponseEntity<Practitioner> getPractitionerById(@PathVariable String id) {
        return practitionerService.getPractitionerById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // POST a new practitioner
    @PostMapping
    public ResponseEntity<Practitioner> createPractitioner(@RequestBody Practitioner practitioner) {
        Practitioner savedPractitioner = practitionerService.savePractitioner(practitioner);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedPractitioner);
    }

    // DELETE a practitioner by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePractitioner(@PathVariable String id) {
        practitionerService.deletePractitionerById(id);
        return ResponseEntity.noContent().build();
    }
}
