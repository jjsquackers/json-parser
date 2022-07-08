package com.demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.Iterator;
import java.util.Iterator;

/**
 *9. move referenceId, actionType, path and taskType to wingsFormComponent
 */
public class Exercise9 {

    public static void execute(ObjectMapper mapper, JsonNode jsonNode) {

        System.out.println(jsonNode); // Main JSON
        System.out.println(jsonNode.get("wingsFormComponent"));

        JsonNode fields = jsonNode.get("dataComponent").get(0).get("CessationOfROorLR_CORP").get(0).get("fields");
        JsonNode tableRecords1 = jsonNode.get("dataComponent").get(0).get("CessationOfROorLR_CORP").get(0).get("tableRecords").get(0);
        JsonNode tableRecords2 = jsonNode.get("dataComponent").get(0).get("CessationOfROorLR_CORP").get(0).get("tableRecords").get(1);
//            ((ArrayNode) jsonData.get("wingsFormComponent")).add(); //adding key, value pair
        System.out.println(fields.size());
        System.out.println(tableRecords1.size());
        System.out.println(tableRecords2.size());

        for (int i = 0; i < fields.size(); i++) {
            ObjectNode tempNode = mapper.createObjectNode();

            tempNode.put("referenceId", fields.get(i).get("referenceId"));
            tempNode.put("actionType", fields.get(i).get("actionType"));
            tempNode.put("path", fields.get(i).get("path"));
            tempNode.put("taskType", fields.get(i).get("taskType"));

            ((ArrayNode) jsonNode.get("wingsFormComponent")).add(tempNode); // add to main JSON
            //remove added fields
            ((ObjectNode) jsonNode.get("dataComponent").get(0).get("CessationOfROorLR_CORP").get(0).get("fields").get(i)).remove("referenceId");
            ((ObjectNode) jsonNode.get("dataComponent").get(0).get("CessationOfROorLR_CORP").get(0).get("fields").get(i)).remove("actionType");
            ((ObjectNode) jsonNode.get("dataComponent").get(0).get("CessationOfROorLR_CORP").get(0).get("fields").get(i)).remove("path");
            ((ObjectNode) jsonNode.get("dataComponent").get(0).get("CessationOfROorLR_CORP").get(0).get("fields").get(i)).remove("taskType");

        }

        for (int i = 0; i < tableRecords1.size(); i++) {
            ObjectNode tempNode = mapper.createObjectNode();

            tempNode.put("referenceId", tableRecords1.get(i).get("referenceId"));
            tempNode.put("actionType", tableRecords1.get(i).get("actionType"));
            tempNode.put("path", tableRecords1.get(i).get("path"));
            tempNode.put("taskType", tableRecords1.get(i).get("taskType"));

            ((ArrayNode) jsonNode.get("wingsFormComponent")).add(tempNode); // add to main JSON

            ((ObjectNode) jsonNode.get("dataComponent").get(0).get("CessationOfROorLR_CORP").get(0).get("tableRecords").get(0).get(i)).remove("referenceId");
            ((ObjectNode) jsonNode.get("dataComponent").get(0).get("CessationOfROorLR_CORP").get(0).get("tableRecords").get(0).get(i)).remove("actionType");
            ((ObjectNode) jsonNode.get("dataComponent").get(0).get("CessationOfROorLR_CORP").get(0).get("tableRecords").get(0).get(i)).remove("path");
            ((ObjectNode) jsonNode.get("dataComponent").get(0).get("CessationOfROorLR_CORP").get(0).get("tableRecords").get(0).get(i)).remove("taskType");

        }
        // Loop using Iterator
        Iterator<JsonNode> iteratorJN = tableRecords2.iterator();
        int counter = 0;
        while (iteratorJN.hasNext()) {

            ObjectNode tempNode = mapper.createObjectNode();

            JsonNode tempJN = iteratorJN.next();
            tempNode.put("referenceId", tempJN.get("referenceId"));
            tempNode.put("actionType", tempJN.get("actionType"));
            tempNode.put("path", tempJN.get("path"));
            tempNode.put("taskType", tempJN.get("taskType"));

            ((ArrayNode) jsonNode.get("wingsFormComponent")).add(tempNode); // add to main JSON

            ((ObjectNode) jsonNode.get("dataComponent").get(0).get("CessationOfROorLR_CORP").get(0).get("tableRecords").get(1).get(counter)).remove("referenceId");
            ((ObjectNode) jsonNode.get("dataComponent").get(0).get("CessationOfROorLR_CORP").get(0).get("tableRecords").get(1).get(counter)).remove("actionType");
            ((ObjectNode) jsonNode.get("dataComponent").get(0).get("CessationOfROorLR_CORP").get(0).get("tableRecords").get(1).get(counter)).remove("path");
            ((ObjectNode) jsonNode.get("dataComponent").get(0).get("CessationOfROorLR_CORP").get(0).get("tableRecords").get(1).get(counter)).remove("taskType");

            counter++;
        }
        System.out.println(jsonNode);
        // Loop using For Loop
//            for (int i = 0; i <dataCompsTR2.size(); i++) {
//                ObjectNode tempNode = mapper.createObjectNode();
//
//                tempNode.put("referenceId",dataCompsTR2.get(i).get("referenceId"));
//                tempNode.put("actionType",dataCompsTR2.get(i).get("actionType") );
//                tempNode.put("path",dataCompsTR2.get(i).get("path") );
//                tempNode.put("taskType",dataCompsTR2.get(i).get("taskType") );
//
//                ((ArrayNode) jsonData.get("wingsFormComponent")).add(tempNode);
//                ((ObjectNode ) jsonData.get("dataComponent").get(0).get("CessationOfROorLR_CORP").get(0).get("tableRecords").get(1).get(i)).remove("referenceId");
//                ((ObjectNode ) jsonData.get("dataComponent").get(0).get("CessationOfROorLR_CORP").get(0).get("tableRecords").get(1).get(i)).remove("actionType");
//                ((ObjectNode ) jsonData.get("dataComponent").get(0).get("CessationOfROorLR_CORP").get(0).get("tableRecords").get(1).get(i)).remove("path");
//                ((ObjectNode ) jsonData.get("dataComponent").get(0).get("CessationOfROorLR_CORP").get(0).get("tableRecords").get(1).get(i)).remove("taskType");
//
//            }
    }
}
