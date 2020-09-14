package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SchemaTest {
    @Test
    public void hello_world_test() {
        //given
        gitSchemaRule schemaRule = new SchemaRule();
        int expect = 8080;
        Character input = 'p';

        //when
        int result = schemaRule.getFormatDate(input);

        //then
        assertEquals(result,expect);
    }
}
