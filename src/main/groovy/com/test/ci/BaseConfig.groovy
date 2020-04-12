package com.test.ci

class BaseConfig {
    private static instance = null

    private BaseConfig() {}

    public static BaseConfig GetInstance() {
        if (instance == null) {
            instance = new BaseConfig()
        }
        return instance
    }

    String jobFolderName = "Test"
    String jobFolderPrefix = "${jobFolderName}"
    
    String jenkinsSlaveNode = "node1"
}
