package com.demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.lang3.StringUtils;

// 3. add a new object in pid field = "ADD_ID" and value = "001"

public class Exercise3 {

    public static void execute(ObjectMapper mapper, JsonNode jsonNode){
        JsonNode fields_pid = jsonNode.get("dataComponent").get(0).get("CessationOfROorLR_CORP")
                .get(0).get("fields").get(0).get("pid"); // location field > pid > field & value

        ObjectNode tempNode = mapper.createObjectNode(); // creating temporary json
        tempNode.put("field", "ADD_ID");
        tempNode.put("value", "001");

        ((ArrayNode) jsonNode.get("dataComponent").get(0).get("CessationOfROorLR_CORP")
                .get(0).get("fields").get(0).get("pid")).add(tempNode); // add to main JSON

        System.out.println(jsonNode);
    }

}
