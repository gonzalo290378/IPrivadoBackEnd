package com.ms_users.security;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class SimpleGrantedAuthorityJsonCreator {

    @JsonCreator
    SimpleGrantedAuthorityJsonCreator(@JsonProperty("authority") String role){

    }
}
