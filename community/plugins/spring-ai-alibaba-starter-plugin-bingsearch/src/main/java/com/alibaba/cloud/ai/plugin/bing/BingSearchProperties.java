package com.alibaba.cloud.ai.plugin.bing;
/*
 * Copyright 1999-2023 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * .
 *
 * @date: 2024-11-20
 * @version: 1.0
 * @author: KrakenZJC
 **/

@ConfigurationProperties(prefix = "spring.ai.alibaba.plugin.bing")
public class BingSearchProperties {
    
    public static final String OCP_APIM_SUBSCRIPTION_KEY = "Ocp-Apim-Subscription-Key";
    
    // bing api key for Ocp-Apim-Subscription-Key
    // https://learn.microsoft.com/en-us/bing/search-apis/bing-web-search/quickstarts/rest/java
    private String token;
    
    public String getToken() {
        return token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }
}
