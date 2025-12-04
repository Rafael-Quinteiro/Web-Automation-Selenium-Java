package br.com.webautomationselenium.runners;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import br.com.webautomationselenium.suits.AllSmokeTests;
import br.com.webautomationselenium.tests.OrderTest;

@RunWith(Categories.class)

@Suite.SuiteClasses({
        OrderTest.class,
})
@Categories.IncludeCategory(AllSmokeTests.class)
public class AllSmokeTestsRunner {

}
