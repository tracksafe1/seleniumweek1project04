package testsuite;

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class E2ETesting extends BaseTest {
    String baseurl = "http://automationexercise.com";

    @Before
    public void setup() {
        openBrowser(baseurl);

    }

    @Test           //testcase 2
    public void userShouldLoginWithValidCredentials() {
//     Verify that home page is visible successfully
     boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();
     System.out.println(result);
//     Click on 'Signup / Login' button
     driver.findElement(By.xpath("//header[@id='header']/div/div/div/div[2]/div/ul/li[4]")).click();
//     Verify 'Login to your account' is visible
      String actualResult = driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']/div[1]/h2")).getText();
      System.out.println(actualResult);
      String expectedResult = "Login to your account";
       Assert.assertEquals(expectedResult, actualResult);
//     Enter correct email address and
     driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']/div[1]/form/input[2]")).sendKeys("shikha8883@gmail.com");
    // Enter correct password
    driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']/div[1]/form/input[3]")).sendKeys("123456");
    //Click 'login' button
      driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']/div/form/button")).click();
//        // Verify that 'Logged in as username' is visible
        String actual=driver.findElement(By.xpath("//div[@class='shop-menu pull-right']/ul/li[10]/a")).getText();
        System.out.println(actual);
        String expected="Logged in as Shikha Kapur";
      Assert.assertEquals(expected,actual);
    //Click 'Delete Account' button
        driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[5]/a")).click();
//    . Verify that 'ACCOUNT DELETED!' is visible
      String actual2=driver.findElement(By.xpath("//section[@id='form']/div/div/div/h2/b")).getText();
     System.out.println(actual2);
     String expected2 = "ACCOUNT DELETED!";
     Assert.assertEquals(actual2,expected2);
     }
    @Test
// test case 3
     public void userloginWithInvalidCredentials() {
        //. Verify that home page is visible successfully
        boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();
        System.out.println(result);
        // . Click on 'Signup / Login' button
        driver.findElement(By.xpath("//header[@id='header']/div/div/div/div[2]/div/ul/li[4]")).click();
        // Verify 'Login to your account' is visible
        String actualResult3 = driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']/div[1]/h2")).getText();
        System.out.println(actualResult3);
       // String expectedResult3 = "";
       // Assert.assertEquals(expectedResult3, actualResult3);
        //Enter incorrect email address
        driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']/div[1]/form/input[2]")).sendKeys("shik@gmail.com");
        //Enter incorrect Password
        driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']/div[1]/form/input[3]")).sendKeys("234567");
//        Click 'login' button
        driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']/div/form/button")).click();
//       Verify error 'Your email or password is incorrect!' is visible
        String actual03 = driver.findElement(By.xpath("//p[contains(text(),'Your email or password is incorrect!')]")).getText();
        System.out.println(actual03);
       // String expected03= "";
       // Assert.assertEquals(actual03, expected03);
        }


//Testcase 4
    @Test
        public void logoutUser() {
            //. Verify that home page is visible successfully
            boolean result04 = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();


//        Click on 'Signup / Login' button
            driver.findElement(By.xpath("//header[@id='header']/div/div/div/div[2]/div/ul/li[4]")).click();
//        Verify 'Login to your account' is visible
            String actualResult04 = driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']/div[1]/h2")).getText();
            System.out.println(actualResult04);
            String expectedResult04 = "Login to your account";
            Assert.assertEquals(expectedResult04, actualResult04);
//    Enter correct email address and password
            driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']/div[1]/form/input[2]")).sendKeys("shikha8883@gmail.com");
            driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']/div[1]/form/input[3]")).sendKeys("123456");
        }
        @Test
//    test case 05
        public void registerUserWithExistingEmail() {
//            Verify that home page is visible successfully
            boolean result5 = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();
            System.out.println(result5);
//            Click on 'Signup / Login' button
            driver.findElement(By.xpath("//div[@class='shop-menu pull-right']/ul/li[4]/a")).click();
//        Verify 'New User Signup!' is visible
            String actual05 = driver.findElement(By.xpath("//div[@class='signup-form']/h2")).getText();
            System.out.println(actual05);
            String expected05 = "New User Signup!";
            Assert.assertEquals(expected05, actual05);
//             Enter name and already registered email address
            driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shikha");
            driver.findElement(By.xpath("//div[@class=\"signup-form\"]/form/input[3]")).sendKeys("shikha8883@gmail.com");
            //          Click 'Signup' button
            driver.findElement(By.xpath("//div[@class=\"signup-form\"]/form/button")).click();
//         Verify error 'Email Address already exist!' is visible
            String actualresultofsignup = driver.findElement(By.xpath("//form[@action='/signup']/p")).getText();
            System.out.println(actualresultofsignup);
            String expectedresultofsignup = "Email Address already exist!";
            Assert.assertEquals(expectedresultofsignup, actualresultofsignup);
        }
        @Test
//        testcase06
//     Verify Test Cases Page
        public void verifyTestCasesPage(){
//         Verify that home page is visible successfully
            boolean result06 = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();
//        Click on 'Test Cases' button
            driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[5]")).click();

//        Verify user is navigated to test cases page successfully
           String actual6= driver.findElement(By.xpath("//h2[@class='title text-center']/b")).getText();
            System.out.println(actual6);
            String expected6="TEST CASES";
            Assert.assertEquals(expected6,actual6);

        }
        @Test
//        test case 8
        public void verifyAllProductsAndProductDetailPage(){
//        Verify that home page is visible successfully
            boolean result08 = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();
//            Click on 'Products' button
            driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[2]/a")).click();
//         Verify user is navigated to ALL PRODUCTS page successfully
            String actual8=driver.findElement(By.xpath("//h2[@class='title text-center']")).getText();
            System.out.println(actual8);
            String expected8="ALL PRODUCTS";
            Assert.assertEquals(expected8,actual8);
//              Click on 'View Product' of first product
           driver.findElement(By.xpath(" //a[@href=\"/product_details/1\"]")).click();
//        User is landed to product detail page
            driver.findElement(By.xpath("//div[@class=\"product-information\"]/h2")).getText();   // productname
            driver.findElement(By.xpath("//div[@class=\"product-information\"]/p")).getText();  //category name
        driver.findElement(By.xpath("//div[@class=\"product-information\"]/span/span[1]")).getText();   //price
            driver.findElement(By.xpath("//div[@class=\"product-information\"]/p[2]")).getText();//Availability
            driver.findElement(By.xpath("//div[@class=\"product-information\"]/p[4]")).getText();//brand
    }
     @Test
     //  test casr 9
     public void searchProduct(){
         boolean result08 = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();
         driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[2]/a")).click();
         String actual9=driver.findElement(By.xpath("//h2[@class='title text-center']")).getText();
         System.out.println(actual9);
         String expected9="ALL PRODUCTS";
         Assert.assertEquals(expected9,actual9);
//          Enter product name in search input and click search button
         driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("Men Tshirt");
         driver.findElement(By.xpath("//button[@id='submit_search']")).click();
       String actual09=driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']/div[1]/h2")).getText();
         System.out.println(actual09);
         String expected09="SEARCHED PRODUCTS";
         Assert.assertEquals(expected09,actual09);
        String result09=driver.findElement(By.xpath("//section[@style=\"height: auto !important;\"]")).getText();
         System.out.println(result09);
     }

        @After
        public void endTest() {
            // closebrowser();
        }
    }
