package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomFields;
import io.swagger.model.Permissions;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RefEntry
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-23T05:23:46.663+08:00[Asia/Singapore]")
public class RefEntry   {
  @JsonProperty("ref_group_code")
  private String refGroupCode = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("desc")
  private String desc = null;

  @JsonProperty("sec_id")
  private Integer secId = null;

  @JsonProperty("custom_fields")
  private CustomFields customFields = null;

  @JsonProperty("allow")
  private Permissions allow = null;

  public RefEntry refGroupCode(String refGroupCode) {
    this.refGroupCode = refGroupCode;
    return this;
  }

  /**
   * Get refGroupCode
   * @return refGroupCode
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=2,max=32)   public String getRefGroupCode() {
    return refGroupCode;
  }

  public void setRefGroupCode(String refGroupCode) {
    this.refGroupCode = refGroupCode;
  }

  public RefEntry code(String code) {
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

  public RefEntry desc(String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * Get desc
   * @return desc
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=1000)   public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public RefEntry secId(Integer secId) {
    this.secId = secId;
    return this;
  }

  /**
   * Get secId
   * @return secId
  **/
  @ApiModelProperty(value = "")
  
    public Integer getSecId() {
    return secId;
  }

  public void setSecId(Integer secId) {
    this.secId = secId;
  }

  public RefEntry customFields(CustomFields customFields) {
    this.customFields = customFields;
    return this;
  }

  /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomFields getCustomFields() {
    return customFields;
  }

  public void setCustomFields(CustomFields customFields) {
    this.customFields = customFields;
  }

  public RefEntry allow(Permissions allow) {
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
    RefEntry refEntry = (RefEntry) o;
    return Objects.equals(this.refGroupCode, refEntry.refGroupCode) &&
        Objects.equals(this.code, refEntry.code) &&
        Objects.equals(this.desc, refEntry.desc) &&
        Objects.equals(this.secId, refEntry.secId) &&
        Objects.equals(this.customFields, refEntry.customFields) &&
        Objects.equals(this.allow, refEntry.allow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refGroupCode, code, desc, secId, customFields, allow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefEntry {\n");
    
    sb.append("    refGroupCode: ").append(toIndentedString(refGroupCode)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    secId: ").append(toIndentedString(secId)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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
