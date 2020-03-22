package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TranslationEntry;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Translation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-15T11:43:31.530+08:00[Asia/Singapore]")
public class Translation {
    @JsonProperty("key")
    private String key = null;

    @JsonProperty("entries")
    @Valid
    private List<TranslationEntry> entries = null;

    public Translation key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get key
     *
     * @return key
     **/
    @ApiModelProperty(value = "")

    @Size(min = 1, max = 200)
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Translation entries(List<TranslationEntry> entries) {
        this.entries = entries;
        return this;
    }

    public Translation addEntriesItem(TranslationEntry entriesItem) {
        if (this.entries == null) {
            this.entries = new ArrayList<TranslationEntry>();
        }
        this.entries.add(entriesItem);
        return this;
    }

    /**
     * Get entries
     *
     * @return entries
     **/
    @ApiModelProperty(value = "")
    @Valid
    public List<TranslationEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<TranslationEntry> entries) {
        this.entries = entries;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Translation translation = (Translation) o;
        return Objects.equals(this.key, translation.key) &&
                Objects.equals(this.entries, translation.entries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, entries);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Translation {\n");

        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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
