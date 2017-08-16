
package com.azlan.weatherApp.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Estimated implements Serializable
{

    private final static long serialVersionUID = -8761081510637812091L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
