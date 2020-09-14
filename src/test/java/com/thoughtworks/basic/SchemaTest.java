package com.thoughtworks.basic;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SchemaTest {
    @Test
    public void should_return_int_8080_when_given_String_p_8080() {
        //given
        SchemaAnalisy schemaAnalisy = new SchemaAnalisy();
        SchemaFilter schemaFilter = new SchemaFilter();
        String input = " -p 8080 ";
        int expectP = 8080;
        Boolean expectL = false;
        String expectD = "";
        //when
        List<SchemaRule> schemaRules = schemaAnalisy.formatInputSchema(input);
        //then
        //assertEquals(schemaRules.get(1).getValue(),1);
        assertEquals(schemaFilter.filterSchema(schemaRules,"l").getValue(),expectL);
        assertEquals(schemaFilter.filterSchema(schemaRules,"p").getValue(),expectP);
        assertEquals(schemaFilter.filterSchema(schemaRules,"d").getValue(),expectD);
    }
}
