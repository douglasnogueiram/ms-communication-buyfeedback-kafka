package com.br.ms.communication.buyfeedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

import co.elastic.apm.attach.ElasticApmAttacher;

@SpringBootApplication
@EnableRedisRepositories
public class ApplicationBuyFeedback {

    public static void main(String[] args) throws InterruptedException {
    	ElasticApmAttacher.attach();
        SpringApplication.run(ApplicationBuyFeedback.class, args);
    }

}
