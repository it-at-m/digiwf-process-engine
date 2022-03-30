package io.muenchendigital.digiwf.digiwf_process_engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import pro.taskana.adapter.camunda.parselistener.TaskanaParseListenerProcessEnginePlugin;

@SpringBootApplication
public class DigiWfProcessEngineApplication {

    public static void main(String[] args) {
        SpringApplication.run(DigiWfProcessEngineApplication.class, args);
    }

    @Bean
    @ConditionalOnMissingBean
    public TaskanaParseListenerProcessEnginePlugin taskanaParseListenerProcessEnginePlugin() {
        return new TaskanaParseListenerProcessEnginePlugin();
    }
}
