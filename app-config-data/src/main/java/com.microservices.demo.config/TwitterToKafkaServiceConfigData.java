package com.microservices.demo.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;
import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "twitter-to-kafka-service")
public class TwitterToKafkaServiceConfigData {

    private List<String> twitterKeywords;
    private String welcomeMessage;
    private Boolean enableMockTweets;
    private Long mockSleepMs;
    private Integer mockMinTweetLength;
    private Integer mockMaxTweetLength;

    public List<String> getTwitterKeywords() {
        return twitterKeywords;
    }
    public String getWelcomeMessage() {
        return welcomeMessage;
    }
    public Boolean getEnableMockTweets() { return enableMockTweets; }
    public Long getMockSleepMs() { return mockSleepMs; }
    public Integer getMockMinTweetLength() { return mockMinTweetLength; }
    public Integer getMockMaxTweetLength() { return mockMaxTweetLength; }
}
