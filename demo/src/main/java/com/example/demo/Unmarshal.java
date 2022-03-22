/*package com.example.demo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Unmarshalling {
    public static Customer unmarshal(File importFile) throws JAXBException {
        Customer customer = null;
        JAXBContext context;

        context = JAXBContext.newInstance(Customer.class);
        Unmarshaller um = context.createUnmarshaller();
        customer = (Customer) um.unmarshal(importFile);

        return customer;
    }
}
*/