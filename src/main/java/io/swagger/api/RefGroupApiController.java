package io.swagger.api;

import io.swagger.model.ExtraInfo;
import io.swagger.model.InlineResponse200;
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
public class RefGroupApiController implements RefGroupApi {

    private static final Logger log = LoggerFactory.getLogger(RefGroupApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RefGroupApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse200> refGroupRefGroupCodeRefEntriesGet(@ApiParam(value = "",required=true) @PathVariable("ref_group_code") String refGroupCode
,@ApiParam(value = "") @Valid @RequestParam(value = "filter", required = false) String filter
,@ApiParam(value = "") @Valid @RequestParam(value = "page", required = false) Integer page
,@ApiParam(value = "") @Valid @RequestParam(value = "page_size", required = false) Integer pageSize
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{\n  \"PageSize\" : 6,\n  \"Filter\" : \"Filter\",\n  \"Total\" : 1,\n  \"Page\" : 0,\n  \"Result\" : [ {\n    \"code\" : \"code\",\n    \"data\" : { }\n  }, {\n    \"code\" : \"code\",\n    \"data\" : { }\n  } ]\n}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

}
