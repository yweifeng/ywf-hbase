package com.ywf.hbase.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * @Author:ywf
 */
@ConfigurationProperties(prefix = "hbase")
public class HbaseProperties {

    private Map<String, String> config;
    public Map<String, String> getConfig() {
        return config;
    }
    public void setConfig(Map<String, String> config) {
        this.config = config;
    }
}
