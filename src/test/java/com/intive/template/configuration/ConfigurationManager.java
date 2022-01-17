package com.intive.template.configuration;

import io.cucumber.messages.internal.com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;

public class ConfigurationManager {

    public final String MOBILE_CONFIG = System.getProperty("device");

    public Map<String, String> getMobileConfiguration() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String devicePath = String.format("src/test/resources/suite/%s.json", MOBILE_CONFIG);
            return objectMapper.readValue(Paths.get(devicePath).toFile(), Map.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}