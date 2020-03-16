# InfraApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**healthGet**](InfraApi.md#healthGet) | **GET** /health | Server heartbeats

<a name="healthGet"></a>
# **healthGet**
> ExtraInfo healthGet()

Server heartbeats

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InfraApi;


InfraApi apiInstance = new InfraApi();
try {
    ExtraInfo result = apiInstance.healthGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfraApi#healthGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ExtraInfo**](ExtraInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

