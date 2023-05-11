package com.runner.api;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\com\\feature\\api",
glue ="com\\stepdef\\api",plugin = {"html:Report/HtmlReport.html"}
,monochrome = true )

public class runner_api {

}
