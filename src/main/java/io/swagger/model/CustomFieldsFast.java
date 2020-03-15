package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomFieldsFast
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-15T11:43:31.530+08:00[Asia/Singapore]")
public class CustomFieldsFast {
    @JsonProperty("bank_name")
    private String bankName = null;

    @JsonProperty("bic_code")
    private String bicCode = null;

    @JsonProperty("extra_payer_account_types")
    @Valid
    private List<String> extraPayerAccountTypes = null;

    @JsonProperty("extra_recipient_account_types")
    @Valid
    private List<String> extraRecipientAccountTypes = null;

    public CustomFieldsFast bankName(String bankName) {
        this.bankName = bankName;
        return this;
    }

    /**
     * Get bankName
     *
     * @return bankName
     **/
    @ApiModelProperty(value = "")

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public CustomFieldsFast bicCode(String bicCode) {
        this.bicCode = bicCode;
        return this;
    }

    /**
     * Get bicCode
     *
     * @return bicCode
     **/
    @ApiModelProperty(value = "")

    public String getBicCode() {
        return bicCode;
    }

    public void setBicCode(String bicCode) {
        this.bicCode = bicCode;
    }

    public CustomFieldsFast extraPayerAccountTypes(List<String> extraPayerAccountTypes) {
        this.extraPayerAccountTypes = extraPayerAccountTypes;
        return this;
    }

    public CustomFieldsFast addExtraPayerAccountTypesItem(String extraPayerAccountTypesItem) {
        if (this.extraPayerAccountTypes == null) {
            this.extraPayerAccountTypes = new ArrayList<String>();
        }
        this.extraPayerAccountTypes.add(extraPayerAccountTypesItem);
        return this;
    }

    /**
     * Get extraPayerAccountTypes
     *
     * @return extraPayerAccountTypes
     **/
    @ApiModelProperty(value = "")

    public List<String> getExtraPayerAccountTypes() {
        return extraPayerAccountTypes;
    }

    public void setExtraPayerAccountTypes(List<String> extraPayerAccountTypes) {
        this.extraPayerAccountTypes = extraPayerAccountTypes;
    }

    public CustomFieldsFast extraRecipientAccountTypes(List<String> extraRecipientAccountTypes) {
        this.extraRecipientAccountTypes = extraRecipientAccountTypes;
        return this;
    }

    public CustomFieldsFast addExtraRecipientAccountTypesItem(String extraRecipientAccountTypesItem) {
        if (this.extraRecipientAccountTypes == null) {
            this.extraRecipientAccountTypes = new ArrayList<String>();
        }
        this.extraRecipientAccountTypes.add(extraRecipientAccountTypesItem);
        return this;
    }

    /**
     * Get extraRecipientAccountTypes
     *
     * @return extraRecipientAccountTypes
     **/
    @ApiModelProperty(value = "")

    public List<String> getExtraRecipientAccountTypes() {
        return extraRecipientAccountTypes;
    }

    public void setExtraRecipientAccountTypes(List<String> extraRecipientAccountTypes) {
        this.extraRecipientAccountTypes = extraRecipientAccountTypes;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomFieldsFast customFieldsFast = (CustomFieldsFast) o;
        return Objects.equals(this.bankName, customFieldsFast.bankName) &&
                Objects.equals(this.bicCode, customFieldsFast.bicCode) &&
                Objects.equals(this.extraPayerAccountTypes, customFieldsFast.extraPayerAccountTypes) &&
                Objects.equals(this.extraRecipientAccountTypes, customFieldsFast.extraRecipientAccountTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankName, bicCode, extraPayerAccountTypes, extraRecipientAccountTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomFieldsFast {\n");

        sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
        sb.append("    bicCode: ").append(toIndentedString(bicCode)).append("\n");
        sb.append("    extraPayerAccountTypes: ").append(toIndentedString(extraPayerAccountTypes)).append("\n");
        sb.append("    extraRecipientAccountTypes: ").append(toIndentedString(extraRecipientAccountTypes)).append("\n");
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
