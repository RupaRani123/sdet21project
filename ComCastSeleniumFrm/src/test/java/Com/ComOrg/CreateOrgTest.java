package Com.ComOrg;

import org.testng.annotations.Test;

public class CreateOrgTest {
@Test
public void CreateOrgTest() {
	System.out.println("execute createOrg Test");
	String BROWSER=System.getProperty("browser");
	String URL=System.getProperty("url");
	System.out.println("BROWSER======+"+BROWSER+ "URL======"+URL);
}

}