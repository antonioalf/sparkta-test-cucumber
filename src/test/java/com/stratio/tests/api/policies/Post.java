package com.stratio.tests.api.policies;

import org.testng.annotations.Test;

import com.stratio.cucumber.testng.CucumberRunner;
import com.stratio.tests.utils.BaseTest;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features/api/postPolicies.feature" })
public class Post extends BaseTest {

    public Post() {
    }

    @Test(enabled = true)
    public void policiesTest() throws Exception {
        new CucumberRunner(this.getClass()).runCukes();
    }
}