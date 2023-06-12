package TESTrun;



import org.junit.runner.RunWith;

import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"/Users/icoderz_06/eclipse-workspace/Nectarbits_cumber/feature/Log.feature"},
		glue={"STepsdefination"}, //the path of the step definition files
		//plugin= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		plugin= {"pretty","html:target/reportss"},
		//plugin= {"pretty", "html:target/Cucreport.jason"},
		//plugin = { "me.jvt.cucumber.report.PrettyReports:target/cucumber" },
		monochrome = true, //display the console output in a proper readable format
		stepNotifications = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step def file
		//tags = "@FlightReservation"
		//tags = {"@Smoke" , "@RegressionTest", "@End2End"}			
		)



public class Runn
{
	

}
