package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RefEntryUser;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-15T11:43:31.530+08:00[Asia/Singapore]")
public class InlineResponse200 {
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
    private List<RefEntryUser> result = null;

    public InlineResponse200 filter(String filter) {
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

    public InlineResponse200 page(Integer page) {
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

    public InlineResponse200 pageSize(Integer pageSize) {
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

    public InlineResponse200 total(Integer total) {
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

    public InlineResponse200 result(List<RefEntryUser> result) {
        this.result = result;
        return this;
    }

    public InlineResponse200 addResultItem(RefEntryUser resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<RefEntryUser>();
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
    public List<RefEntryUser> getResult() {
        return result;
    }

    public void setResult(List<RefEntryUser> result) {
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
        InlineResponse200 inlineResponse200 = (InlineResponse200) o;
        return Objects.equals(this.filter, inlineResponse200.filter) &&
                Objects.equals(this.page, inlineResponse200.page) &&
                Objects.equals(this.pageSize, inlineResponse200.pageSize) &&
                Objects.equals(this.total, inlineResponse200.total) &&
                Objects.equals(this.result, inlineResponse200.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filter, page, pageSize, total, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse200 {\n");

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
