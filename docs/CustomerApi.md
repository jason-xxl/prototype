# CustomerApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**refGroupRefGroupCodeRefEntriesGet**](CustomerApi.md#refGroupRefGroupCodeRefEntriesGet) | **GET** /ref-group/{ref_group_code}/ref_entries/ | Retrieve a set of Ref Entries under a Ref Group 

<a name="refGroupRefGroupCodeRefEntriesGet"></a>
# **refGroupRefGroupCodeRefEntriesGet**
> InlineResponse200 refGroupRefGroupCodeRefEntriesGet(refGroupCode, filter, page, pageSize)

Retrieve a set of Ref Entries under a Ref Group 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
String refGroupCode = "refGroupCode_example"; // String | 
String filter = "filter_example"; // String | 
Integer page = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    InlineResponse200 result = apiInstance.refGroupRefGroupCodeRefEntriesGet(refGroupCode, filter, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#refGroupRefGroupCodeRefEntriesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refGroupCode** | **String**|  |
 **filter** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

