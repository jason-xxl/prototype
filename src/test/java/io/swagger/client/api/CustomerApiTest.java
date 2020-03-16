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

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ExtraInfo;
import io.swagger.client.model.InlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomerApi
 */
@Ignore
public class CustomerApiTest {

    private final CustomerApi api = new CustomerApi();

    /**
     * Retrieve a set of Ref Entries under a Ref Group
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void refGroupRefGroupCodeRefEntriesGetTest() throws ApiException {
        String refGroupCode = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        InlineResponse200 response = api.refGroupRefGroupCodeRefEntriesGet(refGroupCode, filter, page, pageSize);

        // TODO: test validations
    }
}