package com.tmo.ordertranslator.modal;

import java.util.ArrayList;

public class Fields {
    private String[] Field;

    public String[] getField ()
    {
        return Field;
    }

    public void setField (String[] Field)
    {
        this.Field = Field;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Field = "+Field+"]";
    }

   }
