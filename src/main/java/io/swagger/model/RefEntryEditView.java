package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomFields;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RefEntryEditView
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-23T05:23:46.663+08:00[Asia/Singapore]")
public class RefEntryEditView   {
  @JsonProperty("ui_schema")
  private Object uiSchema = null;

  @JsonProperty("custom_fields")
  private CustomFields customFields = null;

  public RefEntryEditView uiSchema(Object uiSchema) {
    this.uiSchema = uiSchema;
    return this;
  }

  /**
   * Get uiSchema
   * @return uiSchema
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Object getUiSchema() {
    return uiSchema;
  }

  public void setUiSchema(Object uiSchema) {
    this.uiSchema = uiSchema;
  }

  public RefEntryEditView customFields(CustomFields customFields) {
    this.customFields = customFields;
    return this;
  }

  /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public CustomFields getCustomFields() {
    return customFields;
  }

  public void setCustomFields(CustomFields customFields) {
    this.customFields = customFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefEntryEditView refEntryEditView = (RefEntryEditView) o;
    return Objects.equals(this.uiSchema, refEntryEditView.uiSchema) &&
        Objects.equals(this.customFields, refEntryEditView.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uiSchema, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefEntryEditView {\n");
    
    sb.append("    uiSchema: ").append(toIndentedString(uiSchema)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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
