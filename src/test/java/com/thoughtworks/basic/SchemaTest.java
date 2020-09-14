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
        String input = "-p 8080";
        int expectP = 8080;
        Boolean expectL = false;
        String expectD = "";
        //when
        List<SchemaRule> schemaRules = schemaAnalisy.formatInputSchema(input);
        //then
        assertEquals(schemaFilter.filterSchema("l").getValue(),expectL);
        assertEquals(schemaFilter.filterSchema("p").getValue(),expectP);
        assertEquals(schemaFilter.filterSchema("d").getValue(),expectD);
    }
}
