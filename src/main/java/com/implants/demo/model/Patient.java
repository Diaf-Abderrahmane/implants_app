package com.implants.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "patients")
public class Patient {

    @Id
    private String id;

    @Field("resourceType")
    private String resourceType = "Patient";

    @Field("name")
    private List<Name> name;  // Changed from array to List

    @Field("gender")
    private String gender;

    @Field("birthDate")
    private String birthDate;

    @Field("telecom")
    private List<Telecom> telecom;  // Changed from array to List

    @Field("address")
    private List<Address> address;  // Changed from array to List

    @Field("text")
    private Text text;

    // Getters and setters
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

    public List<Name> getName() {
        return name;
    }

    public void setName(List<Name> name) {
        this.name = name;
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

    @Field("generalPractitioner")
    private List<Reference> generalPractitioner; // List of references to the general practitioner(s)

    public List<Reference> getGeneralPractitioner() {
        return generalPractitioner;
    }

    public void setGeneralPractitioner(List<Reference> generalPractitioner) {
        this.generalPractitioner = generalPractitioner;
    }

    public List<Telecom> getTelecom() {
        return telecom;
    }

    public void setTelecom(List<Telecom> telecom) {
        this.telecom = telecom;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    // Nested static classes for Name, Telecom, Address, Text

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
    public static class Name {
        private String use;
        private List<String> given;  // Changed from array to List
        private String family;

        public String getUse() {
            return use;
        }

        public void setUse(String use) {
            this.use = use;
        }

        public List<String> getGiven() {
            return given;
        }

        public void setGiven(List<String> given) {
            this.given = given;
        }

        public String getFamily() {
            return family;
        }

        public void setFamily(String family) {
            this.family = family;
        }
    }

    public static class Telecom {
        private String value;
        private String use;
        private String system;

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

        public String getSystem() {
            return system;
        }

        public void setSystem(String system) {
            this.system = system;
        }
    }

    public static class Address {
        private List<String> line;  // Changed from array to List
        private String city;
        private String state;
        private String postalCode;

        public List<String> getLine() {
            return line;
        }

        public void setLine(List<String> line) {
            this.line = line;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public void setPostalCode(String postalCode) {
            this.postalCode = postalCode;
        }
    }

    public static class Text {
        private String status;
        private String div;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getDiv() {
            return div;

        }
    }
}