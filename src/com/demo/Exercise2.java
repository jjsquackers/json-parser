package com.demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;

/**
 * 2. get all the field with date and convert it to ddmmyyyy. e.g 03182022
 */
public class Exercise2 {

    public static void execute(ObjectMapper mapper, JsonNode jsonNode) {

        modifyDateToddmmyyy("20221803");

        System.out.println(jsonNode.findValue("modifiedDate"));

    }

    public static String modifyDateToddmmyyy(String date) {

        String yyyy = StringUtils.substring(date, 0, 4);
        String mm = StringUtils.substring(date, 4, 6);
        String dd = StringUtils.substring(date, 6, 8);
        date = dd + mm + yyyy;

        System.out.println(date);
        return date;
    }
}
