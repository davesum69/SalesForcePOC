package com.tmo.ordertranslator.modal;

public class Options
{
    private String Option;

    public String getOption ()
    {
        return Option;
    }

    public void setOption (String Option)
    {
        this.Option = Option;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Option = "+Option+"]";
    }
}
