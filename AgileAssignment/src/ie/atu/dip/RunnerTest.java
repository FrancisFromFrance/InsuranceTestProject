package ie.atu.dip;


import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectClasses;

//This is the test suite which runs the other two test classes
@Suite
@SelectClasses({
	AgeTest.class,
	AccidentTest.class}
)
	

class RunnerTest {



}
