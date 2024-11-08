/*
 * BotScoreLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package ai.insighttech.nonprod.euc1.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for BotScoreResponse type.
 */
public class BotScoreResponse {
    private String lastEvaluatedKey;
    private int queryExecutionTime;
    private String requestId;
    private BotScoreResponseResponseItem responseItem;
    private String responseMessage;
    private ResponseStatusEnum responseStatus;

    /**
     * Default constructor.
     */
    public BotScoreResponse() {
    }

    /**
     * Initialization constructor.
     * @param  queryExecutionTime  int value for queryExecutionTime.
     * @param  requestId  String value for requestId.
     * @param  responseItem  BotScoreResponseResponseItem value for responseItem.
     * @param  responseMessage  String value for responseMessage.
     * @param  responseStatus  ResponseStatusEnum value for responseStatus.
     * @param  lastEvaluatedKey  String value for lastEvaluatedKey.
     */
    public BotScoreResponse(
            int queryExecutionTime,
            String requestId,
            BotScoreResponseResponseItem responseItem,
            String responseMessage,
            ResponseStatusEnum responseStatus,
            String lastEvaluatedKey) {
        this.lastEvaluatedKey = lastEvaluatedKey;
        this.queryExecutionTime = queryExecutionTime;
        this.requestId = requestId;
        this.responseItem = responseItem;
        this.responseMessage = responseMessage;
        this.responseStatus = responseStatus;
    }

    /**
     * Getter for LastEvaluatedKey.
     * Used if response has more than one page - the first response has a lastEvaluatedKey that is
     * used as the startKey in request for the next page
     * @return Returns the String
     */
    @JsonGetter("lastEvaluatedKey")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastEvaluatedKey() {
        return lastEvaluatedKey;
    }

    /**
     * Setter for LastEvaluatedKey.
     * Used if response has more than one page - the first response has a lastEvaluatedKey that is
     * used as the startKey in request for the next page
     * @param lastEvaluatedKey Value for String
     */
    @JsonSetter("lastEvaluatedKey")
    public void setLastEvaluatedKey(String lastEvaluatedKey) {
        this.lastEvaluatedKey = lastEvaluatedKey;
    }

    /**
     * Getter for QueryExecutionTime.
     * Query execution time in milliseconds
     * @return Returns the int
     */
    @JsonGetter("queryExecutionTime")
    public int getQueryExecutionTime() {
        return queryExecutionTime;
    }

    /**
     * Setter for QueryExecutionTime.
     * Query execution time in milliseconds
     * @param queryExecutionTime Value for int
     */
    @JsonSetter("queryExecutionTime")
    public void setQueryExecutionTime(int queryExecutionTime) {
        this.queryExecutionTime = queryExecutionTime;
    }

    /**
     * Getter for RequestId.
     * ID of the request
     * @return Returns the String
     */
    @JsonGetter("requestId")
    public String getRequestId() {
        return requestId;
    }

    /**
     * Setter for RequestId.
     * ID of the request
     * @param requestId Value for String
     */
    @JsonSetter("requestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Getter for ResponseItem.
     * @return Returns the BotScoreResponseResponseItem
     */
    @JsonGetter("responseItem")
    public BotScoreResponseResponseItem getResponseItem() {
        return responseItem;
    }

    /**
     * Setter for ResponseItem.
     * @param responseItem Value for BotScoreResponseResponseItem
     */
    @JsonSetter("responseItem")
    public void setResponseItem(BotScoreResponseResponseItem responseItem) {
        this.responseItem = responseItem;
    }

    /**
     * Getter for ResponseMessage.
     * Number of items found based on search criteria
     * @return Returns the String
     */
    @JsonGetter("responseMessage")
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * Setter for ResponseMessage.
     * Number of items found based on search criteria
     * @param responseMessage Value for String
     */
    @JsonSetter("responseMessage")
    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    /**
     * Getter for ResponseStatus.
     * @return Returns the ResponseStatusEnum
     */
    @JsonGetter("responseStatus")
    public ResponseStatusEnum getResponseStatus() {
        return responseStatus;
    }

    /**
     * Setter for ResponseStatus.
     * @param responseStatus Value for ResponseStatusEnum
     */
    @JsonSetter("responseStatus")
    public void setResponseStatus(ResponseStatusEnum responseStatus) {
        this.responseStatus = responseStatus;
    }

    /**
     * Converts this BotScoreResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BotScoreResponse [" + "queryExecutionTime=" + queryExecutionTime + ", requestId="
                + requestId + ", responseItem=" + responseItem + ", responseMessage="
                + responseMessage + ", responseStatus=" + responseStatus + ", lastEvaluatedKey="
                + lastEvaluatedKey + "]";
    }

    /**
     * Builds a new {@link BotScoreResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BotScoreResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(queryExecutionTime, requestId, responseItem, responseMessage,
                responseStatus)
                .lastEvaluatedKey(getLastEvaluatedKey());
        return builder;
    }

    /**
     * Class to build instances of {@link BotScoreResponse}.
     */
    public static class Builder {
        private int queryExecutionTime;
        private String requestId;
        private BotScoreResponseResponseItem responseItem;
        private String responseMessage;
        private ResponseStatusEnum responseStatus;
        private String lastEvaluatedKey;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  queryExecutionTime  int value for queryExecutionTime.
         * @param  requestId  String value for requestId.
         * @param  responseItem  BotScoreResponseResponseItem value for responseItem.
         * @param  responseMessage  String value for responseMessage.
         * @param  responseStatus  ResponseStatusEnum value for responseStatus.
         */
        public Builder(int queryExecutionTime, String requestId,
                BotScoreResponseResponseItem responseItem, String responseMessage,
                ResponseStatusEnum responseStatus) {
            this.queryExecutionTime = queryExecutionTime;
            this.requestId = requestId;
            this.responseItem = responseItem;
            this.responseMessage = responseMessage;
            this.responseStatus = responseStatus;
        }

        /**
         * Setter for queryExecutionTime.
         * @param  queryExecutionTime  int value for queryExecutionTime.
         * @return Builder
         */
        public Builder queryExecutionTime(int queryExecutionTime) {
            this.queryExecutionTime = queryExecutionTime;
            return this;
        }

        /**
         * Setter for requestId.
         * @param  requestId  String value for requestId.
         * @return Builder
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Setter for responseItem.
         * @param  responseItem  BotScoreResponseResponseItem value for responseItem.
         * @return Builder
         */
        public Builder responseItem(BotScoreResponseResponseItem responseItem) {
            this.responseItem = responseItem;
            return this;
        }

        /**
         * Setter for responseMessage.
         * @param  responseMessage  String value for responseMessage.
         * @return Builder
         */
        public Builder responseMessage(String responseMessage) {
            this.responseMessage = responseMessage;
            return this;
        }

        /**
         * Setter for responseStatus.
         * @param  responseStatus  ResponseStatusEnum value for responseStatus.
         * @return Builder
         */
        public Builder responseStatus(ResponseStatusEnum responseStatus) {
            this.responseStatus = responseStatus;
            return this;
        }

        /**
         * Setter for lastEvaluatedKey.
         * @param  lastEvaluatedKey  String value for lastEvaluatedKey.
         * @return Builder
         */
        public Builder lastEvaluatedKey(String lastEvaluatedKey) {
            this.lastEvaluatedKey = lastEvaluatedKey;
            return this;
        }

        /**
         * Builds a new {@link BotScoreResponse} object using the set fields.
         * @return {@link BotScoreResponse}
         */
        public BotScoreResponse build() {
            return new BotScoreResponse(queryExecutionTime, requestId, responseItem,
                    responseMessage, responseStatus, lastEvaluatedKey);
        }
    }
}
