/*
 * BotScoreLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package ai.insighttech.nonprod.euc1.api.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import ai.insighttech.nonprod.euc1.api.BotScoreClient;
import ai.insighttech.nonprod.euc1.api.exceptions.ApiException;
import ai.insighttech.nonprod.euc1.api.models.BotScoreResponse;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class EndpointsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static BotScoreClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static EndpointsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getEndpointsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Fetches Bot Scores for all accounts associated with a specific bookmaker and sub-bookmaker.
     * If there are multiple pages of results, the response may include a lastEvaluatedKey for
     * pagination.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestBotScoreList() throws Exception {
        // Parameters for the API call
        String bookmaker = 
                "21661";
        String subbookmaker = 
                "1011";
        String lastKey = null;

        // Set callback and perform API call
        BotScoreResponse result = null;
        try {
            result = controller.botScoreList(bookmaker, subbookmaker, lastKey);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"requestId\":\"\",\"responseStatus\":\"SUCCESSFUL\",\"responseMessage\":\"Number"
                + " of items found: 2\",\"queryExecutionTime\":9,\"lastEvaluatedKey\":\"{}\",\"resp"
                + "onseItem\":{\"customers\":[{\"C\":{\"srcId\":\"BK-24:BK-24-4::::C10024\",\"bscor"
                + "e\":\"0.24\",\"id\":\"C10024\"}},{\"C\":{\"srcId\":\"BK-24:BK-24-4::::C10074\","
                + "\"bscore\":\"0.74\",\"id\":\"C10074\"}}]}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Fetches Bot Scores for accounts under a bookmaker and sub-bookmaker whose scores fall within
     * a specified range. If there are multiple pages of results, the response may include a
     * lastEvaluatedKey for pagination.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestBotScoreRange() throws Exception {
        // Parameters for the API call
        String bookmaker = 
                "21661";
        String subbookmaker = 
                "1011";
        String lower = null;
        String higher = null;
        String startKey = null;

        // Set callback and perform API call
        BotScoreResponse result = null;
        try {
            result = controller.botScoreRange(bookmaker, subbookmaker, lower, higher, startKey);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"requestId\":\"\",\"responseStatus\":\"SUCCESSFUL\",\"responseMessage\":\"Number"
                + " of items found: 2\",\"queryExecutionTime\":9,\"lastEvaluatedKey\":\"{}\",\"resp"
                + "onseItem\":{\"customers\":[{\"C\":{\"srcId\":\"BK-24:BK-24-4::::C10024\",\"bscor"
                + "e\":\"0.24\",\"id\":\"C10024\"}},{\"C\":{\"srcId\":\"BK-24:BK-24-4::::C10074\","
                + "\"bscore\":\"0.74\",\"id\":\"C10074\"}}]}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}
