
# Bscore Range 400 Error Exception

## Structure

`BscoreRange400ErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ResponseStatus` | `String` | Required | Status of the response | String getResponseStatus() | setResponseStatus(String responseStatus) |
| `ResponseMessage` | `String` | Required | Message describing the response status | String getResponseMessage() | setResponseMessage(String responseMessage) |
| `QueryExecutionTime` | `int` | Required | Query execution time in milliseconds | int getQueryExecutionTime() | setQueryExecutionTime(int queryExecutionTime) |

## Example (as JSON)

```json
{
  "responseStatus": "responseStatus8",
  "responseMessage": "responseMessage8",
  "queryExecutionTime": 34
}
```

