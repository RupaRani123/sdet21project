package Com.ComOrg;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups ="SmokeTest")
	
 public void createOrgTest()
 {
	System.out.println("execute createContactTest");
	
			 
 }
@Test(groups ="RegressionTest")
public void createOrgWithLesdTest() {
	System.out.println("execute createContactWithOrgTest");
	
}
@Test(groups ="RegressionTest")

public void deleteOrgTest()
{
System.out.println("execute deleteContactTest");

}
@Test(groups ="RegressionTest")

public void SearchdeleteOrgTest()
{
System.out.println("execute SearchdeleteContactTest");

}
 
}
