package jaxb.kt.unmarshalling;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import jaxb.kt.marshalling.Address;

public class UnmarshalApp {

    public static void main(String[] args) {

        try {

            File file = new File("resource/file.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Address.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Address address = (Address) jaxbUnmarshaller.unmarshal(file);
            System.out.println(address);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
