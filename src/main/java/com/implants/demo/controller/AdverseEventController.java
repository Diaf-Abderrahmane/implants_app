package com.implants.demo.controller;


import com.implants.demo.model.AdverseEvent;
import com.implants.demo.model.Patient;
import com.implants.demo.service.AdverseEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173") // Allow only your frontend's origin
public class AdverseEventController {

    @Autowired
    private AdverseEventService adverseEventService;

    @PostMapping("/adverseevent")
    public ResponseEntity<AdverseEvent> createAdverseEvent(@RequestBody AdverseEvent adverseEvent) {
        System.out.println("Received AdverseEvent: " + adverseEvent);
        AdverseEvent savedAdverseEvent = adverseEventService.createAdverseEvent(adverseEvent);
        return ResponseEntity.ok(savedAdverseEvent);
    }

    @GetMapping("/adverseevents/{id}")
    public ResponseEntity<AdverseEvent> getAdverseEventById(@PathVariable String id) {
        AdverseEvent adverseEvent = adverseEventService.getAdverseEventById(id);
        if (adverseEvent != null) {
            return ResponseEntity.ok(adverseEvent);
        } else {
            return ResponseEntity.notFound().build(); // 404 if not found
        }
    }

    @GetMapping("/adverseevents")
    public List<AdverseEvent> getAllAdverseEvents() {
        return adverseEventService.getAllAdverseEvents();  // Returns a list of all patients
    }
}

