package com.example.runner;

import io.cucumber.core.cli.Main;

public class MainRunner {
    public static void main(String[] args) {
        Main.main(new String[]{
            "--glue", "com.example.steps",
            "demo/src/test/resources/features/login.feature",
            "--plugin", "pretty",
            "--plugin", "html:target/cucumber-reports.html",
            "--monochrome"
        });
    }
}