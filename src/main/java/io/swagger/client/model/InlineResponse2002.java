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
import io.swagger.client.model.Translation;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2002
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-16T20:17:39.272+08:00[Asia/Singapore]")
public class InlineResponse2002 {
    @SerializedName("Page")
    private Integer page = null;

    @SerializedName("PageSize")
    private Integer pageSize = null;

    @SerializedName("Total")
    private Integer total = null;

    @SerializedName("Result")
    private List<Translation> result = null;

    public InlineResponse2002 page(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * Get page
     *
     * @return page
     **/
    @Schema(description = "")
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public InlineResponse2002 pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Get pageSize
     *
     * @return pageSize
     **/
    @Schema(description = "")
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public InlineResponse2002 total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     *
     * @return total
     **/
    @Schema(description = "")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public InlineResponse2002 result(List<Translation> result) {
        this.result = result;
        return this;
    }

    public InlineResponse2002 addResultItem(Translation resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<Translation>();
        }
        this.result.add(resultItem);
        return this;
    }

    /**
     * Get result
     *
     * @return result
     **/
    @Schema(description = "")
    public List<Translation> getResult() {
        return result;
    }

    public void setResult(List<Translation> result) {
        this.result = result;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
        return Objects.equals(this.page, inlineResponse2002.page) &&
                Objects.equals(this.pageSize, inlineResponse2002.pageSize) &&
                Objects.equals(this.total, inlineResponse2002.total) &&
                Objects.equals(this.result, inlineResponse2002.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, pageSize, total, result);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse2002 {\n");

        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
