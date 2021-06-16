package model

import com.fasterxml.jackson.annotation.JsonProperty
import io.micronaut.core.annotation.Introspected

class Response {

    long offset;

    long max;

    long count;

    List<Location> locations;

    public Response(){

    }

}
