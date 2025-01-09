package com.implants.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "practitioners")
public class Practitioner {

    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Field("resourceType")
    private String resourceType = "Practitioner";

    @Field("identifier")
    private List<Identifier> identifier;

    @Field("active")
    private Boolean active;

    @Field("name")
    private List<HumanName> name;

    @Field("telecom")
    private List<ContactPoint> telecom;

    @Field("gender")
    private String gender;

    @Field("birthDate")
    private String birthDate;

    @Field("deceasedBoolean")
    private Boolean deceasedBoolean;

    @Field("deceasedDateTime")
    private String deceasedDateTime;

    @Field("address")
    private List<Address> address;

    @Field("photo")
    private List<Attachment> photo;

    @Field("qualification")
    private List<Qualification> qualification;

    @Field("communication")
    private List<Communication> communication;

    // Getters and Setters...


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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<HumanName> getName() {
        return name;
    }

    public void setName(List<HumanName> name) {
        this.name = name;
    }

    public List<ContactPoint> getTelecom() {
        return telecom;
    }

    public void setTelecom(List<ContactPoint> telecom) {
        this.telecom = telecom;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Boolean getDeceasedBoolean() {
        return deceasedBoolean;
    }

    public void setDeceasedBoolean(Boolean deceasedBoolean) {
        this.deceasedBoolean = deceasedBoolean;
    }

    public String getDeceasedDateTime() {
        return deceasedDateTime;
    }

    public void setDeceasedDateTime(String deceasedDateTime) {
        this.deceasedDateTime = deceasedDateTime;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<Attachment> getPhoto() {
        return photo;
    }

    public void setPhoto(List<Attachment> photo) {
        this.photo = photo;
    }

    public List<Qualification> getQualification() {
        return qualification;
    }

    public void setQualification(List<Qualification> qualification) {
        this.qualification = qualification;
    }

    public List<Communication> getCommunication() {
        return communication;
    }

    public void setCommunication(List<Communication> communication) {
        this.communication = communication;
    }

    //
    public static class Identifier {
        private String system;
        private String value;
        // Getters and Setters...

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

    public static class HumanName {
        private String use;
        private String text;
        private String family;
        private List<String> given;
        // Getters and Setters...

        public String getUse() {
            return use;
        }

        public void setUse(String use) {
            this.use = use;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getFamily() {
            return family;
        }

        public void setFamily(String family) {
            this.family = family;
        }

        public List<String> getGiven() {
            return given;
        }

        public void setGiven(List<String> given) {
            this.given = given;
        }
    }

    public static class Address {
        private String use;
        private String type;
        private String text;
        private List<String> line;
        private String city;
        private String district;
        private String state;
        private String postalCode;
        private String country;
        // Getters and Setters...

        public String getUse() {
            return use;
        }

        public void setUse(String use) {
            this.use = use;
        }
    }

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

    public static class Communication {
        private CodeableConcept language; // The language code used to communicate
        private Boolean preferred;        // Language preference indicator

        // Getters and Setters...

        public CodeableConcept getLanguage() {
            return language;
        }

        public void setLanguage(CodeableConcept language) {
            this.language = language;
        }
    }

    public static class Period {
        private String start; // Starting time with inclusive boundary
        private String end;   // End time with inclusive boundary, if not ongoing

        // Getters and Setters...

        public String getStart() {
            return start;
        }

        public void setStart(String start) {
            this.start = start;
        }

        public String getEnd() {
            return end;
        }

        public void setEnd(String end) {
            this.end = end;
        }
    }

    public static class ContactPoint {
        private String system; // phone | fax | email | pager | url | sms | other
        private String value;  // The actual contact point details
        private String use;    // home | work | temp | old | mobile
        private Integer rank;  // Specify preferred order of use (1 = highest)
        private Period period; // Time period when the contact point was/is in use

        // Getters and Setters...

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

        public String getUse() {
            return use;
        }

        public void setUse(String use) {
            this.use = use;
        }

        public Integer getRank() {
            return rank;
        }

        public void setRank(Integer rank) {
            this.rank = rank;
        }

        public Period getPeriod() {
            return period;
        }

        public void setPeriod(Period period) {
            this.period = period;
        }
    }

    public static class Qualification {
        private List<Identifier> identifier; // An identifier for this qualification for the practitioner
        private CodeableConcept code;        // Coded representation of the qualification
        private Period period;               // Period during which the qualification is valid
//        private Reference issuer;            // Organization that regulates and issues the qualification

        // Getters and Setters...

        public List<Identifier> getIdentifier() {
            return identifier;
        }

        public void setIdentifier(List<Identifier> identifier) {
            this.identifier = identifier;
        }

        public CodeableConcept getCode() {
            return code;
        }

        public void setCode(CodeableConcept code) {
            this.code = code;
        }

        public Period getPeriod() {
            return period;
        }

        public void setPeriod(Period period) {
            this.period = period;
        }
    }


    private static class Attachment {
    }
}



