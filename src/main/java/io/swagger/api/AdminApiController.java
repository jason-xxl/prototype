package io.swagger.api;

import io.swagger.model.ExtraInfo;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse2002;
import io.swagger.model.RefEntry;
import io.swagger.model.RefGroup;
import io.swagger.model.TranslationEntry;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-15T11:43:31.530+08:00[Asia/Singapore]")
@Controller
public class AdminApiController implements AdminApi {

    private static final Logger log = LoggerFactory.getLogger(AdminApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AdminApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<RefGroup> adminRefGroupRefGroupCodeGet(@ApiParam(value = "", required = true) @PathVariable("ref_group_code") String refGroupCode
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RefGroup>(objectMapper.readValue("{\n  \"allow\" : [ \"EDIT\", \"EDIT\" ],\n  \"custom_forms\" : { },\n  \"custom_schema\" : { },\n  \"code\" : \"code\",\n  \"name\" : \"name\",\n  \"desc\" : \"desc\"\n}", RefGroup.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RefGroup>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RefGroup>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2001> adminRefGroupRefGroupCodeRefEntriesGet(@ApiParam(value = "", required = true) @PathVariable("ref_group_code") String refGroupCode
            , @ApiParam(value = "") @Valid @RequestParam(value = "filter", required = false) String filter
            , @ApiParam(value = "") @Valid @RequestParam(value = "page", required = false) Integer page
            , @ApiParam(value = "") @Valid @RequestParam(value = "page_size", required = false) Integer pageSize
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

    public ResponseEntity<RefEntry> adminRefGroupRefGroupCodeRefEntryRefEntryCodeGet(@ApiParam(value = "", required = true) @PathVariable("ref_group_code") String refGroupCode
            , @ApiParam(value = "", required = true) @PathVariable("ref_entry_code") String refEntryCode
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

    public ResponseEntity<ExtraInfo> adminRefGroupRefGroupCodeRefEntryRefEntryCodeSetPost(@ApiParam(value = "", required = true) @Valid @RequestBody RefEntry body
            , @ApiParam(value = "", required = true) @PathVariable("ref_group_code") String refGroupCode
            , @ApiParam(value = "", required = true) @PathVariable("ref_entry_code") String refEntryCode
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ExtraInfo>(objectMapper.readValue("{\n  \"code\" : \"code\",\n  \"message\" : \"message\"\n}", ExtraInfo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ExtraInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ExtraInfo>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ExtraInfo> adminRefGroupRefGroupCodeRefEntryRefEntryCodeUnsetPost(@ApiParam(value = "", required = true) @PathVariable("ref_group_code") String refGroupCode
            , @ApiParam(value = "", required = true) @PathVariable("ref_entry_code") String refEntryCode
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ExtraInfo>(objectMapper.readValue("{\n  \"code\" : \"code\",\n  \"message\" : \"message\"\n}", ExtraInfo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ExtraInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ExtraInfo>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ExtraInfo> adminRefGroupRefGroupCodeSetPost(@ApiParam(value = "", required = true) @Valid @RequestBody RefGroup body
            , @ApiParam(value = "", required = true) @PathVariable("ref_group_code") String refGroupCode
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ExtraInfo>(objectMapper.readValue("{\n  \"code\" : \"code\",\n  \"message\" : \"message\"\n}", ExtraInfo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ExtraInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ExtraInfo>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ExtraInfo> adminRefGroupRefGroupCodeUnsetPost(@ApiParam(value = "", required = true) @PathVariable("ref_group_code") String refGroupCode
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ExtraInfo>(objectMapper.readValue("{\n  \"code\" : \"code\",\n  \"message\" : \"message\"\n}", ExtraInfo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ExtraInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ExtraInfo>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<RefGroup>> adminRefGroupsGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<RefGroup>>(objectMapper.readValue("[ {\n  \"allow\" : [ \"EDIT\", \"EDIT\" ],\n  \"custom_forms\" : { },\n  \"custom_schema\" : { },\n  \"code\" : \"code\",\n  \"name\" : \"name\",\n  \"desc\" : \"desc\"\n}, {\n  \"allow\" : [ \"EDIT\", \"EDIT\" ],\n  \"custom_forms\" : { },\n  \"custom_schema\" : { },\n  \"code\" : \"code\",\n  \"name\" : \"name\",\n  \"desc\" : \"desc\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<RefGroup>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<RefGroup>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<TranslationEntry>> adminTranslationTranslationKeyGet(@Size(min = 1, max = 200) @ApiParam(value = "", required = true) @PathVariable("translation_key") String translationKey
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<TranslationEntry>>(objectMapper.readValue("[ {\n  \"locale\" : \"locale\",\n  \"value\" : \"value\"\n}, {\n  \"locale\" : \"locale\",\n  \"value\" : \"value\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<TranslationEntry>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<TranslationEntry>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ExtraInfo> adminTranslationTranslationKeyLocaleSetPost(@ApiParam(value = "", required = true) @Valid @RequestBody TranslationEntry body
            , @Size(min = 1, max = 200) @ApiParam(value = "", required = true) @PathVariable("translation_key") String translationKey
            , @ApiParam(value = "", required = true) @PathVariable("locale") String locale
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ExtraInfo>(objectMapper.readValue("{\n  \"code\" : \"code\",\n  \"message\" : \"message\"\n}", ExtraInfo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ExtraInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ExtraInfo>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ExtraInfo> adminTranslationTranslationKeyLocaleUnsetPost(@Size(min = 1, max = 200) @ApiParam(value = "", required = true) @PathVariable("translation_key") String translationKey
            , @ApiParam(value = "", required = true) @PathVariable("locale") String locale
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ExtraInfo>(objectMapper.readValue("{\n  \"code\" : \"code\",\n  \"message\" : \"message\"\n}", ExtraInfo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ExtraInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ExtraInfo>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2002> adminTranslationsGet(@ApiParam(value = "") @Valid @RequestParam(value = "page", required = false) Integer page
            , @ApiParam(value = "") @Valid @RequestParam(value = "page_size", required = false) Integer pageSize
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2002>(objectMapper.readValue("{\n  \"PageSize\" : 6,\n  \"Total\" : 1,\n  \"Page\" : 0,\n  \"Result\" : [ {\n    \"entries\" : [ {\n      \"locale\" : \"locale\",\n      \"value\" : \"value\"\n    }, {\n      \"locale\" : \"locale\",\n      \"value\" : \"value\"\n    } ],\n    \"key\" : \"key\"\n  }, {\n    \"entries\" : [ {\n      \"locale\" : \"locale\",\n      \"value\" : \"value\"\n    }, {\n      \"locale\" : \"locale\",\n      \"value\" : \"value\"\n    } ],\n    \"key\" : \"key\"\n  } ]\n}", InlineResponse2002.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2002>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2002>(HttpStatus.NOT_IMPLEMENTED);
    }

}
