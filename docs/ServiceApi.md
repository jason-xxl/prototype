# ServiceApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**serviceRefGroupRefGroupCodeRefEntriesGet**](ServiceApi.md#serviceRefGroupRefGroupCodeRefEntriesGet) | **GET** /service/ref-group/{ref_group_code}/ref_entries/ | Retrieve a set of Ref Entries under a Ref Group 
[**serviceRefGroupRefGroupCodeRefEntryRefEntryCodeGet**](ServiceApi.md#serviceRefGroupRefGroupCodeRefEntryRefEntryCodeGet) | **GET** /service/ref-group/{ref_group_code}/ref-entry/{ref_entry_code} | Retrieve one item from a Ref Group using its code 
[**serviceRefGroupsFastBanksRefEntriesGet**](ServiceApi.md#serviceRefGroupsFastBanksRefEntriesGet) | **GET** /service/ref-groups/fast-banks/ref-entries/ | Retrieve a set of Ref Entries under a Ref Group &#x60;Fast Bank&#x60; 

<a name="serviceRefGroupRefGroupCodeRefEntriesGet"></a>
# **serviceRefGroupRefGroupCodeRefEntriesGet**
> InlineResponse2001 serviceRefGroupRefGroupCodeRefEntriesGet(refGroupCode, filter, page, pageSize)

Retrieve a set of Ref Entries under a Ref Group 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceApi;


ServiceApi apiInstance = new ServiceApi();
String refGroupCode = "refGroupCode_example"; // String | 
String filter = "filter_example"; // String | 
Integer page = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    InlineResponse2001 result = apiInstance.serviceRefGroupRefGroupCodeRefEntriesGet(refGroupCode, filter, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceApi#serviceRefGroupRefGroupCodeRefEntriesGet");
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

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="serviceRefGroupRefGroupCodeRefEntryRefEntryCodeGet"></a>
# **serviceRefGroupRefGroupCodeRefEntryRefEntryCodeGet**
> RefEntry serviceRefGroupRefGroupCodeRefEntryRefEntryCodeGet(refGroupCode, refEntryCode)

Retrieve one item from a Ref Group using its code 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceApi;


ServiceApi apiInstance = new ServiceApi();
String refGroupCode = "refGroupCode_example"; // String | 
String refEntryCode = "refEntryCode_example"; // String | 
try {
    RefEntry result = apiInstance.serviceRefGroupRefGroupCodeRefEntryRefEntryCodeGet(refGroupCode, refEntryCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceApi#serviceRefGroupRefGroupCodeRefEntryRefEntryCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refGroupCode** | **String**|  |
 **refEntryCode** | **String**|  |

### Return type

[**RefEntry**](RefEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="serviceRefGroupsFastBanksRefEntriesGet"></a>
# **serviceRefGroupsFastBanksRefEntriesGet**
> InlineResponse2003 serviceRefGroupsFastBanksRefEntriesGet(filter, page, pageSize)

Retrieve a set of Ref Entries under a Ref Group &#x60;Fast Bank&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceApi;


ServiceApi apiInstance = new ServiceApi();
String filter = "filter_example"; // String | 
Integer page = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    InlineResponse2003 result = apiInstance.serviceRefGroupsFastBanksRefEntriesGet(filter, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceApi#serviceRefGroupsFastBanksRefEntriesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

