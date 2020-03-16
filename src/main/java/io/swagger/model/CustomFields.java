package io.swagger.model;

import java.util.Objects;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomFields
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-15T11:43:31.530+08:00[Asia/Singapore]")
public class CustomFields extends JSONObject {
    public CustomFields(String source) throws JSONException {
        super(source);
    }
}
