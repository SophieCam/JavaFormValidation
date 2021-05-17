package com.tts.Validating.Form.Input.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {

    @NotNull //does not allow a null value
    @Size(min=2, max=30) //allows names btwn 2 and 30 characters long
    private String name;

    @NotNull
    @Min(18) //does not allow the age to be less than 18
    private Integer age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }
}


