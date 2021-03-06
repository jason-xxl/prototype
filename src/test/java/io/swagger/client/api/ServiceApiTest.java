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
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.RefEntry;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ServiceApi
 */
@Ignore
public class ServiceApiTest {

    private final ServiceApi api = new ServiceApi();

    /**
     * Retrieve a set of Ref Entries under a Ref Group
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void serviceRefGroupRefGroupCodeRefEntriesGetTest() throws ApiException {
        String refGroupCode = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        InlineResponse2001 response = api.serviceRefGroupRefGroupCodeRefEntriesGet(refGroupCode, filter, page, pageSize);

        // TODO: test validations
    }

    /**
     * Retrieve one item from a Ref Group using its code
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void serviceRefGroupRefGroupCodeRefEntryRefEntryCodeGetTest() throws ApiException {
        String refGroupCode = null;
        String refEntryCode = null;
        RefEntry response = api.serviceRefGroupRefGroupCodeRefEntryRefEntryCodeGet(refGroupCode, refEntryCode);

        // TODO: test validations
    }

    /**
     * Retrieve a set of Ref Entries under a Ref Group &#x60;Fast Bank&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void serviceRefGroupsFastBanksRefEntriesGetTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        InlineResponse2003 response = api.serviceRefGroupsFastBanksRefEntriesGet(filter, page, pageSize);

        // TODO: test validations
    }
}
