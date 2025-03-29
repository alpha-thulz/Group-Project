package com.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        dryRun = false,
        glue = {"com.example.hooks", "com.example.steps"},
        features = "src/test/resources/features"
)

public class TestRunner extends AbstractTestNGCucumberTests {}