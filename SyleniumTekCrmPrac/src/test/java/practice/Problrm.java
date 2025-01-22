package practice;


import org.testng.annotations.Test;



public class Problrm {
@Test
public void create1() {
	String Url=System.getProperty("url");
	System.out.println(Url+"====create 1====");
}
@Test
public void create2() {
	String Browser=System.getProperty("browser");
	System.out.println(Browser+"====create 2====");
}
}
