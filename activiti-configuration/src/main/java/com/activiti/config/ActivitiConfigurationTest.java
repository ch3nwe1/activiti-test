package com.activiti.config;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;

public class ActivitiConfigurationTest {

    public static void main(String[] args) {
        ProcessEngineConfiguration standaloneProcessEngineConfiguration =
                ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration()
                .setJdbcDriver("com.mysql.jdbc.Driver")
                .setJdbcUrl("jdbc:mysql://localhost:3306/activiti6")
                .setJdbcUsername("root")
                .setJdbcPassword("root")
                .setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
        ProcessEngine processEngine = standaloneProcessEngineConfiguration.buildProcessEngine();
        RepositoryService repositoryService = processEngine.getRepositoryService();
        System.out.println(repositoryService.createDeploymentQuery().count());
    }
}
