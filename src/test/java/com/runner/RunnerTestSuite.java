package com.runner;

import com.tests.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestSuite.class
})

public class RunnerTestSuite {

}
