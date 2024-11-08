
# Bot Score Response

## Structure

`BotScoreResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LastEvaluatedKey` | `String` | Optional | Used if response has more than one page - the first response has a lastEvaluatedKey that is used as the startKey in request for the next page | String getLastEvaluatedKey() | setLastEvaluatedKey(String lastEvaluatedKey) |
| `QueryExecutionTime` | `int` | Required | Query execution time in milliseconds | int getQueryExecutionTime() | setQueryExecutionTime(int queryExecutionTime) |
| `RequestId` | `String` | Required | ID of the request | String getRequestId() | setRequestId(String requestId) |
| `ResponseItem` | [`BotScoreResponseResponseItem`](../../doc/models/bot-score-response-response-item.md) | Required | - | BotScoreResponseResponseItem getResponseItem() | setResponseItem(BotScoreResponseResponseItem responseItem) |
| `ResponseMessage` | `String` | Required | Number of items found based on search criteria | String getResponseMessage() | setResponseMessage(String responseMessage) |
| `ResponseStatus` | [`ResponseStatusEnum`](../../doc/models/response-status-enum.md) | Required | - | ResponseStatusEnum getResponseStatus() | setResponseStatus(ResponseStatusEnum responseStatus) |

## Example (as JSON)

```json
{
  "lastEvaluatedKey": "lastEvaluatedKey8",
  "queryExecutionTime": 36,
  "requestId": "requestId4",
  "responseItem": {
    "customers": [
      {
        "C": {
          "bscore": "bscore0",
          "id": "id0",
          "srcId": "srcId8"
        }
      },
      {
        "C": {
          "bscore": "bscore0",
          "id": "id0",
          "srcId": "srcId8"
        }
      },
      {
        "C": {
          "bscore": "bscore0",
          "id": "id0",
          "srcId": "srcId8"
        }
      }
    ]
  },
  "responseMessage": "responseMessage4",
  "responseStatus": "SUCCESSFUL"
}
```

