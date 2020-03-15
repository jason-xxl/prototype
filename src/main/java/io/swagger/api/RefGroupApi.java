/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ExtraInfo;
import io.swagger.model.InlineResponse200;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-15T11:43:31.530+08:00[Asia/Singapore]")
@Api(value = "ref-group", description = "the ref-group API")
public interface RefGroupApi {

    @ApiOperation(value = "Retrieve a set of Ref Entries under a Ref Group ", nickname = "refGroupRefGroupCodeRefEntriesGet", notes = "", response = InlineResponse200.class, tags = {"Customer",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = InlineResponse200.class),
            @ApiResponse(code = 400, message = "", response = ExtraInfo.class),
            @ApiResponse(code = 500, message = "", response = ExtraInfo.class)})
    @RequestMapping(value = "/ref-group/{ref_group_code}/ref_entries/",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> refGroupRefGroupCodeRefEntriesGet(@ApiParam(value = "", required = true) @PathVariable("ref_group_code") String refGroupCode
            , @ApiParam(value = "") @Valid @RequestParam(value = "filter", required = false) String filter
            , @ApiParam(value = "") @Valid @RequestParam(value = "page", required = false) Integer page
            , @ApiParam(value = "") @Valid @RequestParam(value = "page_size", required = false) Integer pageSize
    );

}