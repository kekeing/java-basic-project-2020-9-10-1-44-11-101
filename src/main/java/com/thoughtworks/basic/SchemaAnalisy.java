package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SchemaAnalisy {
    public List<SchemaRule> formatInputSchema(String input) {
        List<SchemaRule> schemaRules = new ArrayList<>();
        Boolean exitsL = false;
        Boolean exitsP = false;
        Boolean exitsD = false;
        if (validJudgeString(input)){
            String[] schemaStringArray = input.trim().split("-");
            for (int i =0;i<schemaStringArray.length;i++) {
                if (schemaStringArray[i] != null && schemaStringArray[i].length() >= 1 ){
                    schemaRules.add(new SchemaRule(schemaStringArray[i].substring(0, 0), schemaStringArray[i].substring(1).trim()));
                }
            }
        }
        for (SchemaRule schemaRule : schemaRules){
           if ("l".equals(schemaRule.getFlag())){
               exitsL = true;
            }
            if ("p".equals(schemaRule.getFlag())){
                exitsP = true;
            }
            if ("d".equals(schemaRule.getFlag())){
                exitsD = true;
            }
        }
        if (!exitsL){schemaRules.add(new SchemaRule("l",false));}
        if (!exitsP){schemaRules.add(new SchemaRule("p",0));}
        if (!exitsL){schemaRules.add(new SchemaRule("d",""));}
        return schemaRules;
    }
    private Boolean validJudgeString(String input){
        List<String> schemaStringList = Arrays.asList(input.split("-"));
        for (String schemaString : schemaStringList){
            if ( schemaString.charAt(0) == ' ' && !isAllSpace(schemaString)){
                return  false;
            }
        }
        return true;
    }
    private Boolean isAllSpace(String s){
        for (int i = 0;i < s.length();i++){
            if (s.charAt(i) != ' '){
                return false;
            }
        }
        return true;
    }
}
