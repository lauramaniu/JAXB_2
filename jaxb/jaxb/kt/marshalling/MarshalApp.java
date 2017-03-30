package jaxb.kt.marshalling;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshalApp {
    public static void main(String[] args) {

        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreetName("roses street");
        address.setStreetNumber("29");
        address.setPersonName("Anakin Walker");

        try {

            File file = new File("resource/file.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Address.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(address, file);
            jaxbMarshaller.marshal(address, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
