package com.rs.phonebook;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.constraints.NotEmpty;

public class PhonebookConfiguration extends Configuration {
    @JsonProperty
    @NotEmpty
    private String message;
    @JsonProperty
    @Max(10)
    private int messageRepeatitions;
    @JsonProperty
    private String additionalMessage="This is optional message";

    public String getMessage() {
        return message;
    }

    public int getMessageRepeatitions() {
        return messageRepeatitions;
    }

    public String getAdditionalMessage() {
        return additionalMessage;
    }
}
