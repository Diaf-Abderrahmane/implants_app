package com.implants.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "adverseevents")
public class AdverseEvent {

    @Id
    private String id;

    @Field("identifier")
    private List<Identifier> identifier;  // Changed to List

    @Field("resourceType")
    private String resourceType = "AdverseEvent";

    @Field("status")
    private String status;

    @Field("actuality")
    private String actuality;

    @Field("category")
    private List<CodeableConcept> category;  // Changed to List

    @Field("code")
    private CodeableConcept code;

    @Field("subject")
    private Reference subject;

    @Field("encounter")
    private Reference encounter;

    @Field("occurrenceDateTime")
    private String occurrenceDateTime;

    @Field("resultingEffect")
    private List<Reference> resultingEffect;  // Changed to List

    @Field("location")
    private Reference location;

    @Field("seriousness")
    private CodeableConcept seriousness;

    @Field("outcome")
    private List<CodeableConcept> outcome;  // Changed to List

    @Field("recorder")
    private Reference recorder;

    @Field("participant")
    private List<Participant> participant;  // Changed to List

    @Field("study")
    private List<Reference> study;  // Changed to List

    @Field("suspectEntity")
    private List<SuspectEntity> suspectEntity;  // Changed to List

    @Field("contributingFactor")
    private List<ContributingFactor> contributingFactor;  // Changed to List

    @Field("preventiveAction")
    private List<PreventiveAction> preventiveAction;  // Changed to List

    @Field("mitigatingAction")
    private List<MitigatingAction> mitigatingAction;  // Changed to List

    @Field("supportingInfo")
    private List<SupportingInfo> supportingInfo;  // Changed to List

    @Field("note")
    private List<Annotation> note;  // Changed to List

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getActuality() {
        return actuality;
    }

    public void setActuality(String actuality) {
        this.actuality = actuality;
    }

    public List<CodeableConcept> getCategory() {
        return category;
    }

    public void setCategory(List<CodeableConcept> category) {
        this.category = category;
    }

    public CodeableConcept getCode() {
        return code;
    }

    public void setCode(CodeableConcept code) {
        this.code = code;
    }

    public Reference getSubject() {
        return subject;
    }

    public void setSubject(Reference subject) {
        this.subject = subject;
    }

    public Reference getEncounter() {
        return encounter;
    }

    public void setEncounter(Reference encounter) {
        this.encounter = encounter;
    }

    public String getOccurrenceDateTime() {
        return occurrenceDateTime;
    }

    public void setOccurrenceDateTime(String occurrenceDateTime) {
        this.occurrenceDateTime = occurrenceDateTime;
    }

    public List<Reference> getResultingEffect() {
        return resultingEffect;
    }

    public void setResultingEffect(List<Reference> resultingEffect) {
        this.resultingEffect = resultingEffect;
    }

    public Reference getLocation() {
        return location;
    }

    public void setLocation(Reference location) {
        this.location = location;
    }

    public CodeableConcept getSeriousness() {
        return seriousness;
    }

    public void setSeriousness(CodeableConcept seriousness) {
        this.seriousness = seriousness;
    }

    public List<CodeableConcept> getOutcome() {
        return outcome;
    }

    public void setOutcome(List<CodeableConcept> outcome) {
        this.outcome = outcome;
    }

    public Reference getRecorder() {
        return recorder;
    }

    public void setRecorder(Reference recorder) {
        this.recorder = recorder;
    }

    public List<Participant> getParticipant() {
        return participant;
    }

    public void setParticipant(List<Participant> participant) {
        this.participant = participant;
    }

    public List<Reference> getStudy() {
        return study;
    }

    public void setStudy(List<Reference> study) {
        this.study = study;
    }

    public List<SuspectEntity> getSuspectEntity() {
        return suspectEntity;
    }

    public void setSuspectEntity(List<SuspectEntity> suspectEntity) {
        this.suspectEntity = suspectEntity;
    }

    public List<ContributingFactor> getContributingFactor() {
        return contributingFactor;
    }

    public void setContributingFactor(List<ContributingFactor> contributingFactor) {
        this.contributingFactor = contributingFactor;
    }

    public List<PreventiveAction> getPreventiveAction() {
        return preventiveAction;
    }

    public void setPreventiveAction(List<PreventiveAction> preventiveAction) {
        this.preventiveAction = preventiveAction;
    }

    public List<MitigatingAction> getMitigatingAction() {
        return mitigatingAction;
    }

    public void setMitigatingAction(List<MitigatingAction> mitigatingAction) {
        this.mitigatingAction = mitigatingAction;
    }

    public List<SupportingInfo> getSupportingInfo() {
        return supportingInfo;
    }

    public void setSupportingInfo(List<SupportingInfo> supportingInfo) {
        this.supportingInfo = supportingInfo;
    }

    public List<Annotation> getNote() {
        return note;
    }

    public void setNote(List<Annotation> note) {
        this.note = note;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    // Nested static classes for CodeableConcept, Reference, Identifier, etc.

    public static class CodeableConcept {
        private String code;
        private String text;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getDisplay() {
            return text;
        }

        public void setText(String display) {
            this.text = display;
        }
    }

    public static class Identifier {
        private String use;
        private String system;
        private String value;

        public String getUse() {
            return use;
        }

        public void setUse(String use) {
            this.use = use;
        }

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

    // Inner class Reference
    public static class Reference {

        @Field("reference")
        private String reference; // The reference to the resource (e.g., Practitioner ID)

        @Field("type")
        private String type; // Type of resource (e.g., Practitioner)

        @Field("identifier")
        private Identifier identifier; // Logical reference

        @Field("display")
        private String display; // Textual representation of the resource

        // Getters and Setters
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

        // Inner class Identifier
        public static class Identifier {

            private String system;
            private String value;

            // Getters and Setters
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
    }

    public static class Participant {
        private CodeableConcept function;
        private Reference actor;

        public CodeableConcept getFunction() {
            return function;
        }

        public void setFunction(CodeableConcept function) {
            this.function = function;
        }

        public Reference getActor() {
            return actor;
        }

        public void setActor(Reference actor) {
            this.actor = actor;
        }
    }

    public static class SuspectEntity {
        private CodeableConcept instanceCodeableConcept;
        private Reference instanceReference;

        public CodeableConcept getInstanceCodeableConcept() {
            return instanceCodeableConcept;
        }

        public void setInstanceCodeableConcept(CodeableConcept instanceCodeableConcept) {
            this.instanceCodeableConcept = instanceCodeableConcept;
        }

        public Reference getInstanceReference() {
            return instanceReference;
        }

        public void setInstanceReference(Reference instanceReference) {
            this.instanceReference = instanceReference;
        }
    }

    public static class ContributingFactor {
        private Reference itemReference;
        private CodeableConcept itemCodeableConcept;

        public Reference getItemReference() {
            return itemReference;
        }

        public void setItemReference(Reference itemReference) {
            this.itemReference = itemReference;
        }

        public CodeableConcept getItemCodeableConcept() {
            return itemCodeableConcept;
        }

        public void setItemCodeableConcept(CodeableConcept itemCodeableConcept) {
            this.itemCodeableConcept = itemCodeableConcept;
        }
    }

    public static class PreventiveAction {
        private Reference itemReference;
        private CodeableConcept itemCodeableConcept;

        public Reference getItemReference() {
            return itemReference;
        }

        public void setItemReference(Reference itemReference) {
            this.itemReference = itemReference;
        }

        public CodeableConcept getItemCodeableConcept() {
            return itemCodeableConcept;
        }

        public void setItemCodeableConcept(CodeableConcept itemCodeableConcept) {
            this.itemCodeableConcept = itemCodeableConcept;
        }
    }

    public static class MitigatingAction {
        private Reference itemReference;
        private CodeableConcept itemCodeableConcept;

        public Reference getItemReference() {
            return itemReference;
        }

        public void setItemReference(Reference itemReference) {
            this.itemReference = itemReference;
        }

        public CodeableConcept getItemCodeableConcept() {
            return itemCodeableConcept;
        }

        public void setItemCodeableConcept(CodeableConcept itemCodeableConcept) {
            this.itemCodeableConcept = itemCodeableConcept;
        }
    }

    public static class SupportingInfo {
        private Reference itemReference;
        private CodeableConcept itemCodeableConcept;

        public Reference getItemReference() {
            return itemReference;
        }

        public void setItemReference(Reference itemReference) {
            this.itemReference = itemReference;
        }

        public CodeableConcept getItemCodeableConcept() {
            return itemCodeableConcept;
        }

        public void setItemCodeableConcept(CodeableConcept itemCodeableConcept) {
            this.itemCodeableConcept = itemCodeableConcept;
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
}

