package com.implants.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.ALWAYS)

@Document(collection = "appointments")
public class Appointment {

    @Id
    private String id;

    @Field("resourceType")
    private String resourceType = "Appointment";



    @Field("identifier")
    private List<Identifier> identifier;

    @Field("status")
    private String status;

    @Field("cancellationReason")
    private CodeableConcept cancellationReason;

    @Field("class")
    private List<CodeableConcept> classification;

    @Field("serviceCategory")
    private List<CodeableConcept> serviceCategory;

    @Field("serviceType")
    private List<CodeableReference> serviceType;

    @Field("specialty")
    private List<CodeableConcept> specialty;

    @Field("appointmentType")
    private CodeableConcept appointmentType;

    @Field("reason")
    private List<CodeableReference> reason;

    @Field("priority")
    private CodeableConcept priority;

    @Field("description")
    private String description;

    @Field("replaces")
    private List<Reference> replaces;

    @Field("virtualService")
    private List<VirtualServiceDetail> virtualService;

    @Field("supportingInformation")
    private List<Reference> supportingInformation;

    @Field("previousAppointment")
    private Reference previousAppointment;

    @Field("originatingAppointment")
    private Reference originatingAppointment;

    @Field("start")
    private Date start;

    @Field("end")
    private Date end;

    @Field("minutesDuration")
    private Integer minutesDuration;

    @Field("requestedPeriod")
    private List<Period> requestedPeriod;

    @Field("slot")
    private List<Reference> slot;

    @Field("account")
    private List<Reference> account;

    @Field("created")
    private Date created;

    @Field("cancellationDate")
    private Date cancellationDate;

    @Field("note")
    private List<Annotation> note;

    @Field("patientInstruction")
    private List<CodeableReference> patientInstruction;

    @Field("basedOn")
    private List<Reference> basedOn;

    @Field("subject")
    private Reference subject;

    @Field("participant")
    private List<Participant> participant;

    @Field("recurrenceId")
    private Integer recurrenceId;

    @Field("occurrenceChanged")
    private Boolean occurrenceChanged;

    @Field("recurrenceTemplate")
    private List<RecurrenceTemplate> recurrenceTemplate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public List<Identifier> getIdentifier() {
        return identifier;
    }

    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CodeableConcept getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(CodeableConcept cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    public List<CodeableConcept> getClassification() {
        return classification;
    }

    public void setClassification(List<CodeableConcept> classification) {
        this.classification = classification;
    }

    public List<CodeableConcept> getServiceCategory() {
        return serviceCategory;
    }

    public void setServiceCategory(List<CodeableConcept> serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    public List<CodeableReference> getServiceType() {
        return serviceType;
    }

    public void setServiceType(List<CodeableReference> serviceType) {
        this.serviceType = serviceType;
    }

    public List<CodeableConcept> getSpecialty() {
        return specialty;
    }

    public void setSpecialty(List<CodeableConcept> specialty) {
        this.specialty = specialty;
    }

    public CodeableConcept getAppointmentType() {
        return appointmentType;
    }

    public void setAppointmentType(CodeableConcept appointmentType) {
        this.appointmentType = appointmentType;
    }

    public List<CodeableReference> getReason() {
        return reason;
    }

    public void setReason(List<CodeableReference> reason) {
        this.reason = reason;
    }

    public CodeableConcept getPriority() {
        return priority;
    }

    public void setPriority(CodeableConcept priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Reference> getReplaces() {
        return replaces;
    }

    public void setReplaces(List<Reference> replaces) {
        this.replaces = replaces;
    }

    public List<VirtualServiceDetail> getVirtualService() {
        return virtualService;
    }

    public void setVirtualService(List<VirtualServiceDetail> virtualService) {
        this.virtualService = virtualService;
    }

    public List<Reference> getSupportingInformation() {
        return supportingInformation;
    }

    public void setSupportingInformation(List<Reference> supportingInformation) {
        this.supportingInformation = supportingInformation;
    }

    public Reference getPreviousAppointment() {
        return previousAppointment;
    }

    public void setPreviousAppointment(Reference previousAppointment) {
        this.previousAppointment = previousAppointment;
    }

    public Reference getOriginatingAppointment() {
        return originatingAppointment;
    }

    public void setOriginatingAppointment(Reference originatingAppointment) {
        this.originatingAppointment = originatingAppointment;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Integer getMinutesDuration() {
        return minutesDuration;
    }

    public void setMinutesDuration(Integer minutesDuration) {
        this.minutesDuration = minutesDuration;
    }

    public List<Period> getRequestedPeriod() {
        return requestedPeriod;
    }

    public void setRequestedPeriod(List<Period> requestedPeriod) {
        this.requestedPeriod = requestedPeriod;
    }

    public List<Reference> getSlot() {
        return slot;
    }

    public void setSlot(List<Reference> slot) {
        this.slot = slot;
    }

    public List<Reference> getAccount() {
        return account;
    }

    public void setAccount(List<Reference> account) {
        this.account = account;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getCancellationDate() {
        return cancellationDate;
    }

    public void setCancellationDate(Date cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    public List<Annotation> getNote() {
        return note;
    }

    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    public List<CodeableReference> getPatientInstruction() {
        return patientInstruction;
    }

    public void setPatientInstruction(List<CodeableReference> patientInstruction) {
        this.patientInstruction = patientInstruction;
    }

    public List<Reference> getBasedOn() {
        return basedOn;
    }

    public void setBasedOn(List<Reference> basedOn) {
        this.basedOn = basedOn;
    }

    public Reference getSubject() {
        return subject;
    }

    public void setSubject(Reference subject) {
        this.subject = subject;
    }

    public List<Participant> getParticipant() {
        return participant;
    }

    public void setParticipant(List<Participant> participant) {
        this.participant = participant;
    }

    public Integer getRecurrenceId() {
        return recurrenceId;
    }

    public void setRecurrenceId(Integer recurrenceId) {
        this.recurrenceId = recurrenceId;
    }

    public Boolean getOccurrenceChanged() {
        return occurrenceChanged;
    }

    public void setOccurrenceChanged(Boolean occurrenceChanged) {
        this.occurrenceChanged = occurrenceChanged;
    }

    public List<RecurrenceTemplate> getRecurrenceTemplate() {
        return recurrenceTemplate;
    }

    public void setRecurrenceTemplate(List<RecurrenceTemplate> recurrenceTemplate) {
        this.recurrenceTemplate = recurrenceTemplate;
    }

    public static class Identifier {
        private String system;
        private String value;

        public String getSystem() {
            return system;
        }

        public void setSystem(String system) {
            this.system = system;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class CodeableConcept {
        private List<Coding> coding;
        private String text;

        public static class Coding {
            private String system;
            private String code;
            private String display;

            public String getSystem() {
                return system;
            }

            public void setSystem(String system) {
                this.system = system;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getDisplay() {
                return display;
            }

            public void setDisplay(String display) {
                this.display = display;
            }
        }

        public List<Coding> getCoding() {
            return coding;
        }

        public void setCoding(List<Coding> coding) {
            this.coding = coding;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static class Reference {
        private String reference;
        private String type;
        private Identifier identifier;
        private String display;

        public String getReference() {
            return reference;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Identifier getIdentifier() {
            return identifier;
        }

        public void setIdentifier(Identifier identifier) {
            this.identifier = identifier;
        }

        public String getDisplay() {
            return display;
        }

        public void setDisplay(String display) {
            this.display = display;
        }
    }

    public static class CodeableReference {
        private Reference reference;
        private CodeableConcept concept;

        public Reference getReference() {
            return reference;
        }

        public void setReference(Reference reference) {
            this.reference = reference;
        }

        public CodeableConcept getConcept() {
            return concept;
        }

        public void setConcept(CodeableConcept concept) {
            this.concept = concept;
        }
    }

    public static class Period {
        private Date start;
        private Date end;

        public Date getStart() {
            return start;
        }

        public void setStart(Date start) {
            this.start = start;
        }

        public Date getEnd() {
            return end;
        }

        public void setEnd(Date end) {
            this.end = end;
        }
    }

    public static class Participant {
        private List<CodeableConcept> type;
        private Period period;
        private Reference actor;
        private Boolean required;
        private String status;

        public List<CodeableConcept> getType() {
            return type;
        }

        public void setType(List<CodeableConcept> type) {
            this.type = type;
        }

        public Period getPeriod() {
            return period;
        }

        public void setPeriod(Period period) {
            this.period = period;
        }

        public Reference getActor() {
            return actor;
        }

        public void setActor(Reference actor) {
            this.actor = actor;
        }

        public Boolean getRequired() {
            return required;
        }

        public void setRequired(Boolean required) {
            this.required = required;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

    public static class Annotation {
        private String text;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static class VirtualServiceDetail {
        // Add fields as needed
    }

    public static class RecurrenceTemplate {
        private CodeableConcept timezone;
        private CodeableConcept recurrenceType;
        private Date lastOccurrenceDate;
        private Integer occurrenceCount;
        private List<Date> occurrenceDate;

        public CodeableConcept getTimezone() {
            return timezone;
        }

        public void setTimezone(CodeableConcept timezone) {
            this.timezone = timezone;
        }

        public CodeableConcept getRecurrenceType() {
            return recurrenceType;
        }

        public void setRecurrenceType(CodeableConcept recurrenceType) {
            this.recurrenceType = recurrenceType;
        }

        public Date getLastOccurrenceDate() {
            return lastOccurrenceDate;
        }

        public void setLastOccurrenceDate(Date lastOccurrenceDate) {
            this.lastOccurrenceDate = lastOccurrenceDate;
        }

        public Integer getOccurrenceCount() {
            return occurrenceCount;
        }

        public void setOccurrenceCount(Integer occurrenceCount) {
            this.occurrenceCount = occurrenceCount;
        }

        public List<Date> getOccurrenceDate() {
            return occurrenceDate;
        }

        public void setOccurrenceDate(List<Date> occurrenceDate) {
            this.occurrenceDate = occurrenceDate;
        }
    }
}
