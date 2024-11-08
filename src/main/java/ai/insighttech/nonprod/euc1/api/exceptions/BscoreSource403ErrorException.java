/*
 * BotScoreLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package ai.insighttech.nonprod.euc1.api.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for BscoreSource403ErrorException type.
 */
public class BscoreSource403ErrorException extends ApiException {
    private static final long serialVersionUID = 92179754922270320L;
    private String message;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public BscoreSource403ErrorException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Message.
     * The client does not have access rights to the content.
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessageField() {
        return this.message;
    }

    /**
     * Setter for Message.
     * The client does not have access rights to the content.
     * @param messageField Value for String
     */
    @JsonSetter("message")
    private void setMessageField(String messageField) {
        this.message = messageField;
    }
}
