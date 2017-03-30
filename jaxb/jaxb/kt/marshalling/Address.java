package jaxb.kt.marshalling;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {

    private String streetName;
    private String streetNumber;
    private String houseNumber;
    private String personName;

    public String getStreetName() {
        return streetName;
    }

    @XmlElement
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    @XmlElement
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    @XmlElement
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPersonName() {
        return personName;
    }

    @XmlAttribute
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(personName)
                .append(", ")
                .append(streetName)
                .append(", ")
                .append(houseNumber)
                .append(", ")
                .append(streetNumber).toString();
    }
}
