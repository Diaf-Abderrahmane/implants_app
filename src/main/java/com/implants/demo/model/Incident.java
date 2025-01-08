//package com.implants.demo.model;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//import java.util.List;
//
//
//@Document(collection = "incidents")
//public class Incident {
//
//    @Id
//    private String id;
//    private String description;
//    private String type;
//    private String severity;
//    private String status;
//    private String actuality;
//    private String incidentDate;
//    private String reportedAt;
//    private String updatedAt;
//
//    // Constructeurs, getters et setters
//
//    public Incident(String description, String type, String severity, String status,
//                    String actuality, String incidentDate, String reportedAt, String updatedAt) {
//        this.description = description;
//        this.type = type;
//        this.severity = severity;
//        this.status = status;
//        this.actuality = actuality;
//        this.incidentDate = incidentDate;
//        this.reportedAt = reportedAt;
//        this.updatedAt = updatedAt;
//    }
//
//    // Getters and setters...
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getSeverity() {
//        return severity;
//    }
//
//    public void setSeverity(String severity) {
//        this.severity = severity;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public String getActuality() {
//        return actuality;
//    }
//
//    public void setActuality(String actuality) {
//        this.actuality = actuality;
//    }
//
//    public String getIncidentDate() {
//        return incidentDate;
//    }
//
//    public void setIncidentDate(String incidentDate) {
//        this.incidentDate = incidentDate;
//    }
//
//    public String getReportedAt() {
//        return reportedAt;
//    }
//
//    public void setReportedAt(String reportedAt) {
//        this.reportedAt = reportedAt;
//    }
//
//    public String getUpdatedAt() {
//        return updatedAt;
//    }
//
//    public void setUpdatedAt(String updatedAt) {
//        this.updatedAt = updatedAt;
//    }
//}
