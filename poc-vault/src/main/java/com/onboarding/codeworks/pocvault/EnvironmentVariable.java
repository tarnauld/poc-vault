package com.onboarding.codeworks.pocvault;

import java.io.Serializable;

public class EnvironmentVariable implements Serializable {
    private final String value;

    public EnvironmentVariable(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
