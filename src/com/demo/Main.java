package com.demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.lang3.StringUtils;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        try {

//            ObjectMapper mapper = new ObjectMapper(); //creating an object mapper
//            JsonNode jsonData = mapper.readTree(Constants.JSON_STRING_DATA); //consuming the string json and converting to JSON object
            Stream.execute();
            //Exercise3.execute(mapper, jsonData);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}