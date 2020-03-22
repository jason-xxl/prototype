package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.JSONForms;
import io.swagger.model.JSONScheme;
import io.swagger.model.Permissions;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RefGroup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-23T05:23:46.663+08:00[Asia/Singapore]")
public class RefGroup   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("desc")
  private String desc = null;

  @JsonProperty("custom_schema")
  private JSONScheme customSchema = null;

  @JsonProperty("custom_forms")
  private JSONForms customForms = null;

  @JsonProperty("allow")
  private Permissions allow = null;

  public RefGroup code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=2,max=32)   public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public RefGroup name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Size(min=5,max=200)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RefGroup desc(String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * Get desc
   * @return desc
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Size(max=5000)   public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public RefGroup customSchema(JSONScheme customSchema) {
    this.customSchema = customSchema;
    return this;
  }

  /**
   * Get customSchema
   * @return customSchema
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public JSONScheme getCustomSchema() {
    return customSchema;
  }

  public void setCustomSchema(JSONScheme customSchema) {
    this.customSchema = customSchema;
  }

  public RefGroup customForms(JSONForms customForms) {
    this.customForms = customForms;
    return this;
  }

  /**
   * Get customForms
   * @return customForms
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public JSONForms getCustomForms() {
    return customForms;
  }

  public void setCustomForms(JSONForms customForms) {
    this.customForms = customForms;
  }

  public RefGroup allow(Permissions allow) {
    this.allow = allow;
    return this;
  }

  /**
   * Get allow
   * @return allow
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Permissions getAllow() {
    return allow;
  }

  public void setAllow(Permissions allow) {
    this.allow = allow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefGroup refGroup = (RefGroup) o;
    return Objects.equals(this.code, refGroup.code) &&
        Objects.equals(this.name, refGroup.name) &&
        Objects.equals(this.desc, refGroup.desc) &&
        Objects.equals(this.customSchema, refGroup.customSchema) &&
        Objects.equals(this.customForms, refGroup.customForms) &&
        Objects.equals(this.allow, refGroup.allow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, desc, customSchema, customForms, allow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefGroup {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    customSchema: ").append(toIndentedString(customSchema)).append("\n");
    sb.append("    customForms: ").append(toIndentedString(customForms)).append("\n");
    sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
