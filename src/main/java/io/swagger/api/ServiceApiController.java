package io.swagger.api;

import io.swagger.model.ExtraInfo;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse2003;
import io.swagger.model.RefEntry;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-23T05:23:46.663+08:00[Asia/Singapore]")
@Controller
public class ServiceApiController implements ServiceApi {

    private static final Logger log = LoggerFactory.getLogger(ServiceApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ServiceApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse2001> serviceRefGroupRefGroupCodeRefEntriesGet(@ApiParam(value = "",required=true) @PathVariable("ref_group_code") String refGroupCode
,@ApiParam(value = "") @Valid @RequestParam(value = "filter", required = false) String filter
,@ApiParam(value = "") @Valid @RequestParam(value = "page", required = false) Integer page
,@ApiParam(value = "") @Valid @RequestParam(value = "page_size", required = false) Integer pageSize
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2001>(objectMapper.readValue("{\n  \"PageSize\" : 6,\n  \"Total\" : 1,\n  \"Page\" : 0,\n  \"Result\" : [ {\n    \"allow\" : [ \"EDIT\", \"EDIT\" ],\n    \"sec_id\" : 5,\n    \"code\" : \"code\",\n    \"custom_fields\" : { },\n    \"ref_group_code\" : \"ref_group_code\",\n    \"desc\" : \"desc\"\n  }, {\n    \"allow\" : [ \"EDIT\", \"EDIT\" ],\n    \"sec_id\" : 5,\n    \"code\" : \"code\",\n    \"custom_fields\" : { },\n    \"ref_group_code\" : \"ref_group_code\",\n    \"desc\" : \"desc\"\n  } ]\n}", InlineResponse2001.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2001>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2001>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RefEntry> serviceRefGroupRefGroupCodeRefEntryRefEntryCodeGet(@ApiParam(value = "",required=true) @PathVariable("ref_group_code") String refGroupCode
,@ApiParam(value = "",required=true) @PathVariable("ref_entry_code") String refEntryCode
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RefEntry>(objectMapper.readValue("{\n  \"allow\" : [ \"EDIT\", \"EDIT\" ],\n  \"sec_id\" : 5,\n  \"code\" : \"code\",\n  \"custom_fields\" : { },\n  \"ref_group_code\" : \"ref_group_code\",\n  \"desc\" : \"desc\"\n}", RefEntry.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RefEntry>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RefEntry>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2003> serviceRefGroupsFastBanksRefEntriesGet(@ApiParam(value = "") @Valid @RequestParam(value = "filter", required = false) String filter
,@ApiParam(value = "") @Valid @RequestParam(value = "page", required = false) Integer page
,@ApiParam(value = "") @Valid @RequestParam(value = "page_size", required = false) Integer pageSize
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2003>(objectMapper.readValue("{\n  \"PageSize\" : 6,\n  \"Filter\" : \"Filter\",\n  \"Total\" : 1,\n  \"Page\" : 0,\n  \"Result\" : [ {\n    \"code\" : \"code\",\n    \"data\" : {\n      \"extra_recipient_account_types\" : [ \"extra_recipient_account_types\", \"extra_recipient_account_types\" ],\n      \"bank_name\" : \"bank_name\",\n      \"bic_code\" : \"bic_code\",\n      \"extra_payer_account_types\" : [ \"extra_payer_account_types\", \"extra_payer_account_types\" ]\n    }\n  }, {\n    \"code\" : \"code\",\n    \"data\" : {\n      \"extra_recipient_account_types\" : [ \"extra_recipient_account_types\", \"extra_recipient_account_types\" ],\n      \"bank_name\" : \"bank_name\",\n      \"bic_code\" : \"bic_code\",\n      \"extra_payer_account_types\" : [ \"extra_payer_account_types\", \"extra_payer_account_types\" ]\n    }\n  } ]\n}", InlineResponse2003.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2003>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2003>(HttpStatus.NOT_IMPLEMENTED);
    }

}
