/*
 * BotScoreLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package ai.insighttech.nonprod.euc1.api;

import ai.insighttech.nonprod.euc1.api.authentication.BearerAuthManager;
import ai.insighttech.nonprod.euc1.api.authentication.BearerAuthModel;
import ai.insighttech.nonprod.euc1.api.controllers.EndpointsController;
import ai.insighttech.nonprod.euc1.api.http.client.HttpCallback;
import ai.insighttech.nonprod.euc1.api.http.client.HttpClientConfiguration;
import ai.insighttech.nonprod.euc1.api.http.client.ReadonlyHttpClientConfiguration;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.authentication.Authentication;
import io.apimatic.coreinterfaces.compatibility.CompatibilityFactory;
import io.apimatic.coreinterfaces.http.HttpClient;
import io.apimatic.okhttpclient.adapter.OkClient;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Gateway class for the library.
 * This class acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public final class BotScoreClient implements Configuration {

    /**
     * Private store for controllers.
     */
    private EndpointsController endpoints;

    private static final CompatibilityFactory compatibilityFactory = new CompatibilityFactoryImpl();

    private static String userAgent = "APIMATIC 3.0";

    /**
     * Current API environment.
     */
    private final Environment environment;

    /**
     * basePath value.
     */
    private final String basePath;

    /**
     * The HTTP Client instance to use for making HTTP requests.
     */
    private final HttpClient httpClient;

    /**
     * Http Client Configuration instance.
     */
    private final ReadonlyHttpClientConfiguration httpClientConfig;

    /**
     * BearerAuthManager.
     */
    private BearerAuthManager bearerAuthManager;

    /**
     * The instance of BearerAuthModel.
     */
    private BearerAuthModel bearerAuthModel;

    /**
     * Map of authentication Managers.
     */
    private Map<String, Authentication> authentications = new HashMap<String, Authentication>();

    /**
     * Callback to be called before and after the HTTP call for an endpoint is made.
     */
    private final HttpCallback httpCallback;

    private BotScoreClient(Environment environment, String basePath, HttpClient httpClient,
            ReadonlyHttpClientConfiguration httpClientConfig, BearerAuthModel bearerAuthModel,
            HttpCallback httpCallback) {
        this.environment = environment;
        this.basePath = basePath;
        this.httpClient = httpClient;
        this.httpClientConfig = httpClientConfig;
        this.httpCallback = httpCallback;

        this.bearerAuthModel = bearerAuthModel;

        this.bearerAuthManager = new BearerAuthManager(bearerAuthModel);
        this.authentications.put("mts-insight-tech-bot-score-authorizer", bearerAuthManager);

        GlobalConfiguration globalConfig = new GlobalConfiguration.Builder()
                .httpClient(httpClient).baseUri(server -> getBaseUri(server))
                .compatibilityFactory(compatibilityFactory)
                .authentication(this.authentications)
                .callback(httpCallback)
                .userAgent(userAgent)
                .build();
        endpoints = new EndpointsController(globalConfig);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Get the instance of EndpointsController.
     * @return endpoints
     */
    public EndpointsController getEndpointsController() {
        return endpoints;
    }

    /**
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * basePath value.
     * @return basePath
     */
    public String getBasePath() {
        return basePath;
    }

    /**
     * The HTTP Client instance to use for making HTTP requests.
     * @return httpClient
     */
    private HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Http Client Configuration instance.
     * @return httpClientConfig
     */
    public ReadonlyHttpClientConfiguration getHttpClientConfig() {
        return httpClientConfig;
    }

    /**
     * The credentials to use with BearerAuth.
     * @return bearerAuthCredentials
     */
    public BearerAuthCredentials getBearerAuthCredentials() {
        return bearerAuthManager;
    }

    /**
     * The auth credential model for BearerAuth.
     * @return the instance of BearerAuthModel
     */
    public BearerAuthModel getBearerAuthModel() {
        return bearerAuthModel;
    }

    /**
     * OAuth 2.0 Access Token.
     * @return accessToken
     */
    public String getAccessToken() {
        return getBearerAuthCredentials().getAccessToken();
    }
    /**
     * The timeout to use for making HTTP requests.
     * @deprecated This method will be removed in a future version. Use
     *             {@link #getHttpClientConfig()} instead.
     *
     * @return timeout
     */
    @Deprecated
    public long timeout() {
        return httpClientConfig.getTimeout();
    }

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(Server server) {
        Map<String, SimpleEntry<Object, Boolean>> parameters = new HashMap<>();
        parameters.put("basePath",
                new SimpleEntry<Object, Boolean>(this.basePath, false));
        StringBuilder baseUrl = new StringBuilder(environmentMapper(environment, server));
        ApiHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    public String getBaseUri() {
        return getBaseUri(Server.ENUM_DEFAULT);
    }


    /**
     * Get base URI by current environment.
     * 
     * @param server string for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(String server) {
        return getBaseUri(Server.fromString(server));
    }


    /**
     * Base URLs by environment and server aliases.
     * @param environment Environment for which to get the base URI
     * @param server Server for which to get the base URI
     * @return base URL
     */
    private static String environmentMapper(Environment environment, Server server) {
        if (environment.equals(Environment.PRODUCTION)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "https://api.euc1.nonprod.insighttech.ai/{basePath}";
            }
        }
        return "https://api.euc1.nonprod.insighttech.ai/{basePath}";
    }

    /**
     * Converts this BotScoreClient into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BotScoreClient [" + "environment=" + environment + ", basePath=" + basePath
                + ", httpClientConfig=" + httpClientConfig + ", authentications=" + authentications
                + "]";
    }

    /**
     * Builds a new {@link BotScoreClient.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link BotScoreClient.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.basePath = getBasePath();
        builder.httpClient = getHttpClient();
        builder.bearerAuthCredentials(getBearerAuthModel()
                .toBuilder().build());
        builder.httpCallback = httpCallback;
        builder.httpClientConfig(() -> ((HttpClientConfiguration) httpClientConfig).newBuilder());
        return builder;
    }

    /**
     * Class to build instances of {@link BotScoreClient}.
     */
    public static class Builder {

        private Environment environment = Environment.PRODUCTION;
        private String basePath = "develop/bscore";
        private HttpClient httpClient;
        private BearerAuthModel bearerAuthModel = new BearerAuthModel.Builder("").build();
        private HttpCallback httpCallback = null;
        private HttpClientConfiguration.Builder httpClientConfigBuilder =
                new HttpClientConfiguration.Builder();


        /**
         * Credentials setter for BearerAuth.
         * @param accessToken String value for accessToken.
         * @deprecated This builder method is deprecated.
         * Use {@link #bearerAuthCredentials(BearerAuthModel) bearerAuthCredentials} instead.
         * @return The current instance of builder.
         */
        @Deprecated
        public Builder accessToken(String accessToken) {
            bearerAuthModel = bearerAuthModel.toBuilder()
                .accessToken(accessToken)
                .build();
            return this;
        }

        /**
         * Credentials setter for BearerAuthCredentials.
         * @param bearerAuthModel The instance of BearerAuthModel.
         * @return The current instance of builder.
         */
        public Builder bearerAuthCredentials(BearerAuthModel bearerAuthModel) {
            this.bearerAuthModel = bearerAuthModel;
            return this;
        }

        /**
         * Current API environment.
         * @param environment The environment for client.
         * @return Builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * basePath value.
         * @param basePath The basePath for client.
         * @return Builder
         */
        public Builder basePath(String basePath) {
            this.basePath = basePath;
            return this;
        }

        /**
         * The timeout to use for making HTTP requests.
         * @deprecated This method will be removed in a future version. Use
         *             {@link #httpClientConfig(Consumer) httpClientConfig} instead.
         * @param timeout must be greater then 0.
         * @return Builder
         */
        @Deprecated
        public Builder timeout(long timeout) {
            this.httpClientConfigBuilder.timeout(timeout);
            return this;
        }

        /**
         * HttpCallback.
         * @param httpCallback Callback to be called before and after the HTTP call.
         * @return Builder
         */
        public Builder httpCallback(HttpCallback httpCallback) {
            this.httpCallback = httpCallback;
            return this;
        }

        /**
         * Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param action Consumer for the builder of httpClientConfiguration.
         * @return Builder
         */
        public Builder httpClientConfig(Consumer<HttpClientConfiguration.Builder> action) {
            action.accept(httpClientConfigBuilder);
            return this;
        }

        /**
         * Private Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param supplier Supplier for the builder of httpClientConfiguration.
         * @return Builder
         */
        private Builder httpClientConfig(Supplier<HttpClientConfiguration.Builder> supplier) {
            httpClientConfigBuilder = supplier.get();
            return this;
        }

        /**
         * Builds a new BotScoreClient object using the set fields.
         * @return BotScoreClient
         */
        public BotScoreClient build() {
            HttpClientConfiguration httpClientConfig = httpClientConfigBuilder.build();
            httpClient = new OkClient(httpClientConfig.getConfiguration(), compatibilityFactory);

            return new BotScoreClient(environment, basePath, httpClient, httpClientConfig,
                    bearerAuthModel, httpCallback);
        }
    }
}