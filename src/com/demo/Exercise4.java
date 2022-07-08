package com.demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.lang3.StringUtils;


/**
 * 4. change the value of referenceId,
 * - remove 1st and last block of characters,
 * - and remove the dash.
 * */
 
public class Exercise4 {

    public static void execute(ObjectMapper mapper, JsonNode jsonNode){

        String referenceId = "5b85d2fb-15b0-4259-bfb9-29c667d92eeb";
        referenceId = referenceId.substring(referenceId.indexOf("-") + 1);
        referenceId = StringUtils.reverse(referenceId);
        referenceId = referenceId.substring(referenceId.indexOf("-") + 1);
        referenceId = StringUtils.reverse(referenceId);

        System.out.println(referenceId);
    }
}
