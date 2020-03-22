package io.swagger.api;

import io.swagger.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import lombok.var;
import org.jooq.DSLContext;
import org.jooq.JSONB;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.dsl.tables.Entry;
import org.jooq.dsl.tables.Group;
import org.jooq.dsl.tables.records.EntryRecord;
import org.jooq.dsl.tables.records.GroupRecord;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
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
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-15T11:43:31.530+08:00[Asia/Singapore]")
@Controller
public class AdminApiController implements AdminApi {

    private static final Logger log = LoggerFactory.getLogger(AdminApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    @org.springframework.beans.factory.annotation.Qualifier("dslMvp")
    private DSLContext dsl;

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
        try {

            var e = Entry.ENTRY;
            Result<EntryRecord> resultSet = this.dsl.selectFrom(e.ENTRY)
                    .where(e.GROUP_CODE.equal(refGroupCode))
                    .orderBy(e.SEQ_ID.desc(), e.CODE.asc())
                    .fetch();

            // log.info("adminRefGroupsGet resultSet {}", resultSet);

            var result = new LinkedList<RefEntry>();
            for (var r : resultSet) {
                var refEntry = new RefEntry();
                refEntry.setCode(r.getCode());
                refEntry.setDesc(r.getDesc());
                refEntry.setSecId(r.getSeqId());
                refEntry.setCustomFields(new CustomFields(r.getCustomFields().toString()));
                result.add(refEntry);
            }

            var response = new InlineResponse2001();
            response.setResult(result);

            // log.info("adminRefGroupsGet result {}", result);
            return new ResponseEntity<InlineResponse2001>(response, HttpStatus.OK);

        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<InlineResponse2001>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<RefEntry> adminRefGroupRefGroupCodeRefEntryRefEntryCodeGet(@ApiParam(value = "", required = true) @PathVariable("ref_group_code") String refGroupCode
            , @ApiParam(value = "", required = true) @PathVariable("ref_entry_code") String refEntryCode
    ) {
        try {
            var e = Entry.ENTRY;
            EntryRecord result = this.dsl.selectFrom(e.ENTRY)
                    .where(e.GROUP_CODE.equal(refGroupCode))
                    .and(e.CODE.equal(refGroupCode))
                    .fetchOne();

            // log.info("adminRefGroupsGet resultSet {}", resultSet);

            var refEntry = new RefEntry();
            refEntry.setRefGroupCode(result.getGroupCode());
            refEntry.setCode(result.getCode());
            refEntry.setDesc(result.getDesc());
            refEntry.setSecId(result.getSeqId());
            refEntry.setCustomFields(new CustomFields(result.getCustomFields().toString()));

            // log.info("adminRefGroupsGet result {}", result);
            return new ResponseEntity<RefEntry>(refEntry, HttpStatus.OK);
        } catch (Exception e) {
            log.error("error", e);
            return new ResponseEntity<RefEntry>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<ExtraInfo> adminRefGroupRefGroupCodeRefEntryRefEntryCodeSetPost(@ApiParam(value = "", required = true) @Valid @RequestBody RefEntry body
            , @ApiParam(value = "", required = true) @PathVariable("ref_group_code") String refGroupCode
            , @ApiParam(value = "", required = true) @PathVariable("ref_entry_code") String refEntryCode
    ) {

        try {

            Entry e = Entry.ENTRY;
            Integer id = this.dsl.insertInto(e)
                    .set(e.GROUP_CODE, refGroupCode)
                    .set(e.CODE, refEntryCode)
                    .set(e.DESC, body.getDesc())
                    .set(e.SEQ_ID, body.getSecId())
                    .set(e.CUSTOM_FIELDS, JSONB.valueOf(body.getCustomFields().toString()))
                    .set(e.CREATED_AT, LocalDateTime.now())
                    .set(e.UPDATED_AT, LocalDateTime.now())
                    .onConflict(e.GROUP_CODE, e.CODE)
                    .doUpdate()
                    .set(e.DESC, body.getDesc())
                    .set(e.SEQ_ID, body.getSecId())
                    .set(e.CUSTOM_FIELDS, JSONB.valueOf(body.getCustomFields().toString()))
                    .set(e.UPDATED_AT, LocalDateTime.now())
                    .returning(e.ID)
                    .fetchOne().getValue(e.ID);

            return new ResponseEntity<ExtraInfo>(objectMapper.readValue("{\n  \"code\" : \"200\",\n  \"message\" : \"ok\"\n}", ExtraInfo.class), HttpStatus.OK);
        } catch (IOException e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<ExtraInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<ExtraInfo> adminRefGroupRefGroupCodeRefEntryRefEntryCodeUnsetPost(@ApiParam(value = "", required = true) @PathVariable("ref_group_code") String refGroupCode
            , @ApiParam(value = "", required = true) @PathVariable("ref_entry_code") String refEntryCode
    ) {
        try {
            var e = Entry.ENTRY;
            int affected = this.dsl.deleteFrom(e.ENTRY)
                    .where(e.CODE.equal(refEntryCode))
                    .and(e.GROUP_CODE.equal(refGroupCode))
                    .execute();
            log.info("affected {}", affected);
            return new ResponseEntity<ExtraInfo>(objectMapper.readValue("{\n  \"code\" : \"200\",\n  \"message\" : \"\"\n}", ExtraInfo.class), HttpStatus.OK);
        } catch (IOException e) {
            log.error("error", e);
            return new ResponseEntity<ExtraInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<ExtraInfo> adminRefGroupRefGroupCodeSetPost(@ApiParam(value = "", required = true) @Valid @RequestBody RefGroup body
            , @ApiParam(value = "", required = true) @PathVariable("ref_group_code") String refGroupCode
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                Group g = Group.GROUP;
                Integer id = this.dsl.insertInto(g)
                        .set(g.CODE, refGroupCode)
                        .set(g.NAME, body.getName())
                        .set(g.DESC, body.getDesc())
                        .set(g.CUSTOM_SCHEMA, JSONB.valueOf(body.getCustomSchema().toString()))
                        .set(g.CUSTOM_FORMS, JSONB.valueOf(body.getCustomForms().toString()))
                        .set(g.CREATED_AT, LocalDateTime.now())
                        .set(g.UPDATED_AT, LocalDateTime.now())
                        .onConflict(g.CODE)
                        .doUpdate()
                        .set(g.NAME, body.getName())
                        .set(g.DESC, body.getDesc())
                        .set(g.CUSTOM_SCHEMA, JSONB.valueOf(body.getCustomSchema().toString()))
                        .set(g.CUSTOM_FORMS, JSONB.valueOf(body.getCustomForms().toString()))
                        .set(g.UPDATED_AT, LocalDateTime.now())
                        .returning(g.ID)
                        .fetchOne().getValue(g.ID);

                return new ResponseEntity<ExtraInfo>(objectMapper.readValue("{\n  \"code\" : \"200\",\n  \"message\" : \"ok\"\n}", ExtraInfo.class), HttpStatus.OK);
            } catch (Exception e) {
                log.error("error", e);
                return new ResponseEntity<ExtraInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ExtraInfo>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ExtraInfo> adminRefGroupRefGroupCodeUnsetPost(@ApiParam(value = "", required = true) @PathVariable("ref_group_code") String refGroupCode
    ) {
        try {
            var g = Group.GROUP;
            int affected = this.dsl.deleteFrom(g.GROUP)
                    .where(g.CODE.equal(refGroupCode))
                    .execute();
            log.info("affected {}", affected);
            return new ResponseEntity<ExtraInfo>(objectMapper.readValue("{\n  \"code\" : \"200\",\n  \"message\" : \"\"\n}", ExtraInfo.class), HttpStatus.OK);
        } catch (IOException e) {
            log.error("error", e);
            return new ResponseEntity<ExtraInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<List<RefGroup>> adminRefGroupsGet() {
        try {
            var g = Group.GROUP;
            Result<GroupRecord> resultSet = this.dsl.selectFrom(g.GROUP)
                    .orderBy(g.CODE)
                    .fetch();

            // log.info("adminRefGroupsGet resultSet {}", resultSet);

            var result = new LinkedList<RefGroup>();
            for (var e : resultSet) {
                var refGroup = new RefGroup();
                refGroup.setCode(e.getCode());
                refGroup.setDesc(e.getDesc());
                refGroup.setName(e.getName());
                refGroup.setCustomForms(new JSONForms(e.getCustomForms().toString()));
                result.add(refGroup);
            }

            // log.info("adminRefGroupsGet result {}", result);
            return new ResponseEntity<List<RefGroup>>(result, HttpStatus.OK);
        } catch (Exception e) {
            log.error("adminRefGroupsGet error", e);
            return new ResponseEntity<List<RefGroup>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
