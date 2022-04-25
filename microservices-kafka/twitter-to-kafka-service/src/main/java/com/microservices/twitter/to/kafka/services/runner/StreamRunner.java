package com.microservices.twitter.to.kafka.services.runner;

import twitter4j.TwitterException;

public interface StreamRunner {
    void start() throws TwitterException;

}
