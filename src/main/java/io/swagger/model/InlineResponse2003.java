package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RefEntryFast;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2003
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-15T11:43:31.530+08:00[Asia/Singapore]")
public class InlineResponse2003 {
    @JsonProperty("Filter")
    private String filter = null;

    @JsonProperty("Page")
    private Integer page = null;

    @JsonProperty("PageSize")
    private Integer pageSize = null;

    @JsonProperty("Total")
    private Integer total = null;

    @JsonProperty("Result")
    @Valid
    private List<RefEntryFast> result = null;

    public InlineResponse2003 filter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get filter
     *
     * @return filter
     **/
    @ApiModelProperty(value = "")

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public InlineResponse2003 page(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * Get page
     *
     * @return page
     **/
    @ApiModelProperty(value = "")

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public InlineResponse2003 pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Get pageSize
     *
     * @return pageSize
     **/
    @ApiModelProperty(value = "")

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public InlineResponse2003 total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     *
     * @return total
     **/
    @ApiModelProperty(value = "")

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public InlineResponse2003 result(List<RefEntryFast> result) {
        this.result = result;
        return this;
    }

    public InlineResponse2003 addResultItem(RefEntryFast resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<RefEntryFast>();
        }
        this.result.add(resultItem);
        return this;
    }

    /**
     * Get result
     *
     * @return result
     **/
    @ApiModelProperty(value = "")
    @Valid
    public List<RefEntryFast> getResult() {
        return result;
    }

    public void setResult(List<RefEntryFast> result) {
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
        InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
        return Objects.equals(this.filter, inlineResponse2003.filter) &&
                Objects.equals(this.page, inlineResponse2003.page) &&
                Objects.equals(this.pageSize, inlineResponse2003.pageSize) &&
                Objects.equals(this.total, inlineResponse2003.total) &&
                Objects.equals(this.result, inlineResponse2003.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filter, page, pageSize, total, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse2003 {\n");

        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
