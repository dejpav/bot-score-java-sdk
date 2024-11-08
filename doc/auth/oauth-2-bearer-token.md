
# OAuth 2 Bearer token



Documentation for accessing and setting credentials for mts-insight-tech-bot-score-authorizer.

## Auth Credentials

| Name | Type | Description | Setter | Getter |
|  --- | --- | --- | --- | --- |
| AccessToken | `String` | The OAuth 2.0 Access Token to use for API requests. | `accessToken` | `getAccessToken()` |



**Note:** Auth credentials can be set using `bearerAuthCredentials` in the client builder and accessed through `getBearerAuthCredentials` method in the client instance.

## Usage Example

### Client Initialization

You must provide credentials in the client as shown in the following code snippet.

```java
BotScoreClient client = new BotScoreClient.Builder()
    .bearerAuthCredentials(new BearerAuthModel.Builder(
            "AccessToken"
        )
        .build())
    .build();
```


