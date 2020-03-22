# AdminApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminRefGroupRefGroupCodeGet**](AdminApi.md#adminRefGroupRefGroupCodeGet) | **GET** /admin/ref-group/{ref_group_code} | Retrieve only one RefGroup by its code with configuration details
[**adminRefGroupRefGroupCodeRefEntriesGet**](AdminApi.md#adminRefGroupRefGroupCodeRefEntriesGet) | **GET** /admin/ref-group/{ref_group_code}/ref-entries/ | Retrieve all the RefEntries of a RefGroup
[**adminRefGroupRefGroupCodeRefEntryRefEntryCodeGet**](AdminApi.md#adminRefGroupRefGroupCodeRefEntryRefEntryCodeGet) | **GET** /admin/ref-group/{ref_group_code}/ref-entry/{ref_entry_code} | Retrieve only one RefEntry with all its detail
[**adminRefGroupRefGroupCodeRefEntryRefEntryCodeSetPost**](AdminApi.md#adminRefGroupRefGroupCodeRefEntryRefEntryCodeSetPost) | **POST** /admin/ref-group/{ref_group_code}/ref-entry/{ref_entry_code}/set | Create
[**adminRefGroupRefGroupCodeRefEntryRefEntryCodeUnsetPost**](AdminApi.md#adminRefGroupRefGroupCodeRefEntryRefEntryCodeUnsetPost) | **POST** /admin/ref-group/{ref_group_code}/ref-entry/{ref_entry_code}/unset | Remove an RefEntry identified by its &#x60;code&#x60;
[**adminRefGroupRefGroupCodeSetPost**](AdminApi.md#adminRefGroupRefGroupCodeSetPost) | **POST** /admin/ref-group/{ref_group_code}/set | Change the configuration detail of a RefGroup, or create a RefGroup if the &#x60;code&#x60; doesn&#x27;t exists.
[**adminRefGroupRefGroupCodeUnsetPost**](AdminApi.md#adminRefGroupRefGroupCodeUnsetPost) | **POST** /admin/ref-group/{ref_group_code}/unset | Remove a RefGroup permenantly.
[**adminRefGroupsGet**](AdminApi.md#adminRefGroupsGet) | **GET** /admin/ref-groups | Retrieve all the existing groups.
[**adminTranslationTranslationKeyGet**](AdminApi.md#adminTranslationTranslationKeyGet) | **GET** /admin/translation/{translation_key}/ | Server heartbeat operation
[**adminTranslationTranslationKeyLocaleSetPost**](AdminApi.md#adminTranslationTranslationKeyLocaleSetPost) | **POST** /admin/translation/{translation_key}/{locale}/set | Server heartbeat operation
[**adminTranslationTranslationKeyLocaleUnsetPost**](AdminApi.md#adminTranslationTranslationKeyLocaleUnsetPost) | **POST** /admin/translation/{translation_key}/{locale}/unset | Server heartbeat operation
[**adminTranslationsGet**](AdminApi.md#adminTranslationsGet) | **GET** /admin/translations/ | Retrieve all existing translation keys

<a name="adminRefGroupRefGroupCodeGet"></a>
# **adminRefGroupRefGroupCodeGet**
> RefGroup adminRefGroupRefGroupCodeGet(refGroupCode)

Retrieve only one RefGroup by its code with configuration details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
String refGroupCode = "refGroupCode_example"; // String | 
try {
    RefGroup result = apiInstance.adminRefGroupRefGroupCodeGet(refGroupCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminRefGroupRefGroupCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refGroupCode** | **String**|  |

### Return type

[**RefGroup**](RefGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminRefGroupRefGroupCodeRefEntriesGet"></a>
# **adminRefGroupRefGroupCodeRefEntriesGet**
> InlineResponse2001 adminRefGroupRefGroupCodeRefEntriesGet(refGroupCode, filter, page, pageSize)

Retrieve all the RefEntries of a RefGroup

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
String refGroupCode = "refGroupCode_example"; // String | 
String filter = "filter_example"; // String | 
Integer page = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    InlineResponse2001 result = apiInstance.adminRefGroupRefGroupCodeRefEntriesGet(refGroupCode, filter, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminRefGroupRefGroupCodeRefEntriesGet");
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

<a name="adminRefGroupRefGroupCodeRefEntryRefEntryCodeGet"></a>
# **adminRefGroupRefGroupCodeRefEntryRefEntryCodeGet**
> RefEntryEditView adminRefGroupRefGroupCodeRefEntryRefEntryCodeGet(refGroupCode, refEntryCode)

Retrieve only one RefEntry with all its detail

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
String refGroupCode = "refGroupCode_example"; // String | 
String refEntryCode = "refEntryCode_example"; // String | 
try {
    RefEntryEditView result = apiInstance.adminRefGroupRefGroupCodeRefEntryRefEntryCodeGet(refGroupCode, refEntryCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminRefGroupRefGroupCodeRefEntryRefEntryCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refGroupCode** | **String**|  |
 **refEntryCode** | **String**|  |

### Return type

[**RefEntryEditView**](RefEntryEditView.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminRefGroupRefGroupCodeRefEntryRefEntryCodeSetPost"></a>
# **adminRefGroupRefGroupCodeRefEntryRefEntryCodeSetPost**
> ExtraInfo adminRefGroupRefGroupCodeRefEntryRefEntryCodeSetPost(body, refGroupCode, refEntryCode)

Create

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
RefEntryEditViewSave body = new RefEntryEditViewSave(); // RefEntryEditViewSave | 
String refGroupCode = "refGroupCode_example"; // String | 
String refEntryCode = "refEntryCode_example"; // String | 
try {
    ExtraInfo result = apiInstance.adminRefGroupRefGroupCodeRefEntryRefEntryCodeSetPost(body, refGroupCode, refEntryCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminRefGroupRefGroupCodeRefEntryRefEntryCodeSetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RefEntryEditViewSave**](RefEntryEditViewSave.md)|  |
 **refGroupCode** | **String**|  |
 **refEntryCode** | **String**|  |

### Return type

[**ExtraInfo**](ExtraInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adminRefGroupRefGroupCodeRefEntryRefEntryCodeUnsetPost"></a>
# **adminRefGroupRefGroupCodeRefEntryRefEntryCodeUnsetPost**
> ExtraInfo adminRefGroupRefGroupCodeRefEntryRefEntryCodeUnsetPost(refGroupCode, refEntryCode)

Remove an RefEntry identified by its &#x60;code&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
String refGroupCode = "refGroupCode_example"; // String | 
String refEntryCode = "refEntryCode_example"; // String | 
try {
    ExtraInfo result = apiInstance.adminRefGroupRefGroupCodeRefEntryRefEntryCodeUnsetPost(refGroupCode, refEntryCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminRefGroupRefGroupCodeRefEntryRefEntryCodeUnsetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refGroupCode** | **String**|  |
 **refEntryCode** | **String**|  |

### Return type

[**ExtraInfo**](ExtraInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminRefGroupRefGroupCodeSetPost"></a>
# **adminRefGroupRefGroupCodeSetPost**
> ExtraInfo adminRefGroupRefGroupCodeSetPost(body, refGroupCode)

Change the configuration detail of a RefGroup, or create a RefGroup if the &#x60;code&#x60; doesn&#x27;t exists.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
RefGroup body = new RefGroup(); // RefGroup | 
String refGroupCode = "refGroupCode_example"; // String | 
try {
    ExtraInfo result = apiInstance.adminRefGroupRefGroupCodeSetPost(body, refGroupCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminRefGroupRefGroupCodeSetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RefGroup**](RefGroup.md)|  |
 **refGroupCode** | **String**|  |

### Return type

[**ExtraInfo**](ExtraInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adminRefGroupRefGroupCodeUnsetPost"></a>
# **adminRefGroupRefGroupCodeUnsetPost**
> ExtraInfo adminRefGroupRefGroupCodeUnsetPost(refGroupCode)

Remove a RefGroup permenantly.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
String refGroupCode = "refGroupCode_example"; // String | 
try {
    ExtraInfo result = apiInstance.adminRefGroupRefGroupCodeUnsetPost(refGroupCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminRefGroupRefGroupCodeUnsetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refGroupCode** | **String**|  |

### Return type

[**ExtraInfo**](ExtraInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminRefGroupsGet"></a>
# **adminRefGroupsGet**
> List&lt;RefGroup&gt; adminRefGroupsGet()

Retrieve all the existing groups.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
try {
    List<RefGroup> result = apiInstance.adminRefGroupsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminRefGroupsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;RefGroup&gt;**](RefGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminTranslationTranslationKeyGet"></a>
# **adminTranslationTranslationKeyGet**
> List&lt;TranslationEntry&gt; adminTranslationTranslationKeyGet(translationKey)

Server heartbeat operation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
String translationKey = "translationKey_example"; // String | 
try {
    List<TranslationEntry> result = apiInstance.adminTranslationTranslationKeyGet(translationKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminTranslationTranslationKeyGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **translationKey** | **String**|  |

### Return type

[**List&lt;TranslationEntry&gt;**](TranslationEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminTranslationTranslationKeyLocaleSetPost"></a>
# **adminTranslationTranslationKeyLocaleSetPost**
> ExtraInfo adminTranslationTranslationKeyLocaleSetPost(body, translationKey, locale)

Server heartbeat operation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
TranslationEntry body = new TranslationEntry(); // TranslationEntry | 
String translationKey = "translationKey_example"; // String | 
String locale = "locale_example"; // String | 
try {
    ExtraInfo result = apiInstance.adminTranslationTranslationKeyLocaleSetPost(body, translationKey, locale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminTranslationTranslationKeyLocaleSetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TranslationEntry**](TranslationEntry.md)|  |
 **translationKey** | **String**|  |
 **locale** | **String**|  |

### Return type

[**ExtraInfo**](ExtraInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adminTranslationTranslationKeyLocaleUnsetPost"></a>
# **adminTranslationTranslationKeyLocaleUnsetPost**
> ExtraInfo adminTranslationTranslationKeyLocaleUnsetPost(translationKey, locale)

Server heartbeat operation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
String translationKey = "translationKey_example"; // String | 
String locale = "locale_example"; // String | 
try {
    ExtraInfo result = apiInstance.adminTranslationTranslationKeyLocaleUnsetPost(translationKey, locale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminTranslationTranslationKeyLocaleUnsetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **translationKey** | **String**|  |
 **locale** | **String**|  |

### Return type

[**ExtraInfo**](ExtraInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminTranslationsGet"></a>
# **adminTranslationsGet**
> InlineResponse2002 adminTranslationsGet(page, pageSize)

Retrieve all existing translation keys

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
Integer page = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    InlineResponse2002 result = apiInstance.adminTranslationsGet(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminTranslationsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

