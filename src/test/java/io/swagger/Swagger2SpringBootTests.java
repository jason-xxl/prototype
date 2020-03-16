package io.swagger;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.AdminApi;
import io.swagger.client.api.CustomerApi;
import io.swagger.client.model.JSONForms;
import io.swagger.client.model.JSONScheme;
import io.swagger.client.model.RefGroup;
import lombok.SneakyThrows;
import lombok.var;
import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Ref;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@TestPropertySource(properties = {"server.port=8080"})
@SpringBootTest(classes = Swagger2SpringBoot.class,
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@Component
public class Swagger2SpringBootTests {
    static final Logger logger = LoggerFactory.getLogger(Swagger2SpringBootTests.class);

    @SneakyThrows
    private ApiClient getApiClient() {
        var client = new ApiClient();
        URL newUrl = new URL("http", "127.0.0.1", 8080, "");
        client.setBasePath(newUrl.toString());
        return client;
    }

    private AdminApi getAdminApi() {
        return new AdminApi(getApiClient());
    }

    @Test
    public void testAll() {

        try {
            var adminApi = this.getAdminApi();

            var result = adminApi.adminRefGroupsGet();
            logger.info("result {}", result.toString());

            //assertTrue(result.isEmpty());

            var refGroup = new RefGroup();
            refGroup.setName("ANameNameName");
            refGroup.setDesc("ADescDescDesc");
            refGroup.setCustomForms(new JSONForms("{}"));
            refGroup.setCustomSchema(new JSONScheme("{}"));
            var extraInfo = adminApi.adminRefGroupRefGroupCodeSetPost(refGroup, "AAA");

            var refGroup2 = new RefGroup();
            refGroup2.setName("NameNameName");
            refGroup2.setDesc("DescDescDesc");
            refGroup2.setCustomForms(new JSONForms("{}"));
            refGroup2.setCustomSchema(new JSONScheme("{}"));
            var extraInfo2 = adminApi.adminRefGroupRefGroupCodeSetPost(refGroup2, "BBB");

            logger.info("extraInfo {}", result.toString());

            var result2 = adminApi.adminRefGroupsGet();
            logger.info("result2 {}", result2.toString());

            assertEquals(2, result2.size());


            var extraInfo3 = adminApi.adminRefGroupRefGroupCodeUnsetPost("AAA");
            var extraInfo4 = adminApi.adminRefGroupRefGroupCodeUnsetPost("BBB");

            var result3 = adminApi.adminRefGroupsGet();
            logger.info("result3 {}", result3.toString());

            assertTrue(result.isEmpty());

        } catch (ApiException e) {
            e.printStackTrace();
            logger.info("{}", e.getResponseBody());
        } catch (Exception e){
            logger.info("Exception {}", e.toString());

        }
    }
}
