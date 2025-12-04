package br.com.webautomationselenium.runners;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import br.com.webautomationselenium.suits.AllSmokeTests;
import br.com.webautomationselenium.tests.OrderTest;

/**
 * Test runner responsible for executing all tests
 * classified as Smoke Tests.
 * 
 * It uses the JUnit Categories mechanism to filter
 * and run only the test classes annotated with
 * the {@link AllSmokeTests} category.
 */
@RunWith(Categories.class)
@Suite.SuiteClasses({
        OrderTest.class
})
@Categories.IncludeCategory(AllSmokeTests.class)
public class AllSmokeTestsRunner {
    // This class is used only as an orchestrator for Smoke test execution
}