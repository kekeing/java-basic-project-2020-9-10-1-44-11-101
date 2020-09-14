package com.thoughtworks.basic;

public class SchemaRule {
    private String flag;
    private Object value;

    public SchemaRule(String flag, Object value) {
        this.flag = flag;
        this.value = value;
    }

    public String getFlag() {
        return flag;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        if ("l".equals(this.flag)){
            return Boolean.parseBoolean(this.value.toString());
        }
        else if("p".equals(this.flag)){
            return Integer.parseInt(this.value.toString());
        }
        else if ("d".equals(this.flag)){
            return this.value.toString();
        }else{return "Invalid flag";}
    }
}
