package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.jar.Attributes;

public class SchemaFilter {
    public SchemaRule filterSchema(List<SchemaRule> schemaRules,String flag) {

            for (SchemaRule schemaRule : schemaRules) {
                if (flag.equals(schemaRule.getFlag())) {
                    schemaRule.setValue(schemaRule.getValue());
                    return schemaRule;
                }

            }
        return null;
    }
    private Boolean judgeValidSchemas(List<SchemaRule> schemaRules){
        List<String> vaildFlags = Arrays.asList("l","p","d");
        int countL = 0;
        int countP = 0;
        int countD = 0;
        for (SchemaRule schemaRule : schemaRules){
            if (!vaildFlags.contains(schemaRule.getFlag())){
                return false;
            }else if("l".equals(schemaRule.getFlag())){countL ++;}
            else if("p".equals(schemaRule.getFlag())){countP ++;}
            else if("d".equals(schemaRule.getFlag())){countD ++;}
        }
        if (countL > 1 || countP > 1|| countD > 1){return  false;}
        return true;
    }
}
