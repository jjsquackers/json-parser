package com.demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * 5. get all fieldName
 * - retain only the alphabets
 * - arrange from a to z e.g lastname = aaelmnst
 */

public class Exercise5 {

    public static void execute(ObjectMapper mapper, JsonNode jsonNode){

        String fieldName = "PCCWSOLUTIONSINC";
        char charArray[] = fieldName.toCharArray();
        Arrays.sort(charArray);
        System.out.println(charArray);
    }
}
