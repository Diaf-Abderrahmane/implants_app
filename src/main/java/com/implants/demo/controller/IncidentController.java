//package com.implants.demo.controller;
//
//import com.implants.demo.model.Incident;
//import com.implants.demo.repository.IncidentRepository;
//import com.implants.demo.service.IncidentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoOperations;
//import org.springframework.web.bind.annotation.*;
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/incidents")
//@CrossOrigin(origins = "http://localhost:5173") // Allow CORS only from your React app
//
//public class IncidentController {
//    @Autowired
//    private IncidentService incidentService;
//    @Autowired
//    private IncidentRepository incidentRepository;
//
//    @PostMapping
//    public Incident createIncident(@RequestBody Incident incident) {
//        return incidentService.createIncident(incident);
//    }
//
//    @GetMapping
//    public List<Incident> getAllIncidents() {
//        return incidentService.getAllIncidents();
//    }
//
////    @GetMapping("/{id}")
////    public Incident getIncidentById(@PathVariable String id) {
////        return IncidentRepository.findById(id)
////                .orElseThrow(() -> new RuntimeException("Incident not found with id: " + id));
////    }
//
//}
//
//
