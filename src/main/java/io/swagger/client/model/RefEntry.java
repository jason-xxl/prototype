/*
 * Reference Data MS
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.4.6
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.CustomFields;
import io.swagger.client.model.Permissions;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;

/**
 * RefEntry
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-16T20:17:39.272+08:00[Asia/Singapore]")
public class RefEntry {
    @SerializedName("ref_group_code")
    private String refGroupCode = null;

    @SerializedName("code")
    private String code = null;

    @SerializedName("desc")
    private String desc = null;

    @SerializedName("sec_id")
    private Integer secId = null;

    @SerializedName("custom_fields")
    private CustomFields customFields = null;

    @SerializedName("allow")
    private Permissions allow = null;

    public RefEntry refGroupCode(String refGroupCode) {
        this.refGroupCode = refGroupCode;
        return this;
    }

    /**
     * Get refGroupCode
     *
     * @return refGroupCode
     **/
    @Schema(required = true, description = "")
    public String getRefGroupCode() {
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
     *
     * @return code
     **/
    @Schema(required = true, description = "")
    public String getCode() {
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
     *
     * @return desc
     **/
    @Schema(description = "")
    public String getDesc() {
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
     *
     * @return secId
     **/
    @Schema(description = "")
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
     *
     * @return customFields
     **/
    @Schema(required = true, description = "")
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
     *
     * @return allow
     **/
    @Schema(description = "")
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
