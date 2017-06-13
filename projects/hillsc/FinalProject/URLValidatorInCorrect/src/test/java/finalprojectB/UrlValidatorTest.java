/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package finalprojectB;

import junit.framework.TestCase;





/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {

   private boolean printStatus = false;
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   System.out.println(urlVal.isValid("http://www.amazon.com"));

	   
	    //try testing invidivual parts of urls that should pass or fail (according to valid code) with valid/invalid part
/*	

	   //test for valid and invalid scheme 

	   //should pass
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("ftp://www.amazon.com"));
	   System.out.println(urlVal.isValid("h3t://www.amazon.com"));
	   System.out.println(urlVal.isValid("www.amazon.com"));
	   
	   //should fail
	   System.out.println(urlVal.isValid("http:/www.amazon.com"));
	   System.out.println(urlVal.isValid("http/www.amazon.com"));
	   System.out.println(urlVal.isValid("h:www.amazon.com"));
	   System.out.println(urlVal.isValid(":/www.amazon.com"));

	   //test for valid and invalid authority
	   
	   //should pass
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   
	   //should fail
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("http://www.amazon.com"));


	   
	   //test for valid and invalid path

	   //should pass
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   
	   //should fail
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("http://www.amazon.com"));


	   //test for valid and invalid query

	   //should pass
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   
	   //should fail
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("http://www.amazon.com"));

*/
	   //test for valid and invalid fragment
	   
   }
   
   //first partition is URLs that should be valid
   //further partitioned into individual URL components
   //components are the URL scheme, authority, port, path, and query

   public void testYourFirstPartition()
   {
	UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	System.out.println("\n\nTesting for valid URLs partition\n");
       //test for valid scheme 

	System.out.println("\n\nTesting for valid URLs partition - scheme\n");
	//should pass
	System.out.println(urlVal.isValid("http://www.amazon.com"));
	System.out.println(urlVal.isValid("ftp://www.amazon.com"));
	System.out.println(urlVal.isValid("h3t://www.amazon.com"));
	System.out.println(urlVal.isValid("www.amazon.com"));
       
	//test for valid authority

	System.out.println("\n\nTesting for valid URLs partition - authority\n");
	//should pass
	System.out.println(urlVal.isValid("http://www.amazon.com"));
	System.out.println(urlVal.isValid("http://www.google.com"));
	System.out.println(urlVal.isValid("http://255.255.255.255"));
	System.out.println(urlVal.isValid("http://go.au"));
	
	
	//test for valid port

	System.out.println("\n\nTesting for valid URLs partition - port\n");
	//should pass
	System.out.println(urlVal.isValid("http://www.amazon.com:80"));
	System.out.println(urlVal.isValid("http://www.amazon.com:12345"));
	System.out.println(urlVal.isValid("http://www.amazon.com:"));
	System.out.println(urlVal.isValid("http://www.amazon.com"));

	//test for valid path

	System.out.println("\n\nTesting for valid URLs partition - path\n");
	//should pass
	System.out.println(urlVal.isValid("http://www.amazon.com"));
	System.out.println(urlVal.isValid("http://www.amazon.com"));
	System.out.println(urlVal.isValid("http://www.amazon.com"));
	System.out.println(urlVal.isValid("http://www.amazon.com"));
	
	
	//test for valid query

	System.out.println("\n\nTesting for valid URLs partition - query\n");
	//should pass
	System.out.println(urlVal.isValid("http://www.amazon.com?action=view"));
	System.out.println(urlVal.isValid("http://www.amazon.com"));
	System.out.println(urlVal.isValid("http://www.amazon.com"));
	System.out.println(urlVal.isValid("http://www.amazon.com"));



	   
   }
   
   //second partition is URLs that should be invalid
   //further partitioned into individual URL components
   //components are the URL scheme, authority, path, and query
   public void testYourSecondPartition(){
       
	UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	System.out.println("\n\nTesting for invalid URLs partition\n");

       //test for invalid scheme 

   
	System.out.println("\n\nTesting for invalid URLs partition - scheme\n");
	//should fail
	System.out.println(urlVal.isValid("http:/www.amazon.com"));
	System.out.println(urlVal.isValid("http/www.amazon.com"));
	System.out.println(urlVal.isValid("h:www.amazon.com"));
	System.out.println(urlVal.isValid(":/www.amazon.com"));
	
	
	//test for invalid authority

	System.out.println("\n\nTesting for invalid URLs partition - authority\n");
   
	//should fail
	System.out.println(urlVal.isValid("http:/www.amazon.com"));
	System.out.println(urlVal.isValid("http/www.amazon.com"));
	System.out.println(urlVal.isValid("h:www.amazon.com"));
	System.out.println(urlVal.isValid("http://256.1.1.1"));
	
	//test for invalid port
	System.out.println("\n\nTesting for invalid URLs partition - port\n");
   
	//should fail
	System.out.println(urlVal.isValid("http:/www.amazon.com"));
	System.out.println(urlVal.isValid("http/www.amazon.com"));
	System.out.println(urlVal.isValid("h:www.amazon.com"));
	System.out.println(urlVal.isValid(":/www.amazon.com"));

	//test for invalid path 
	System.out.println("\n\nTesting for invalid URLs partition - path\n");

   
	//should fail
	System.out.println(urlVal.isValid("http:/www.amazon.com"));
	System.out.println(urlVal.isValid("http/www.amazon.com"));
	System.out.println(urlVal.isValid("h:www.amazon.com"));
	System.out.println(urlVal.isValid(":/www.amazon.com"));

	//test for invalid query

	System.out.println("\n\nTesting for invalid URLs partition - query\n");
   
	//should fail
	System.out.println(urlVal.isValid("http:/www.amazon.com"));
	System.out.println(urlVal.isValid("http/www.amazon.com"));
	System.out.println(urlVal.isValid("h:www.amazon.com"));
	System.out.println(urlVal.isValid(":/www.amazon.com"));

   }
   
   
   public void testIsValid()
   {
	   for(int i = 0;i<10000;i++)
	   {
		   
	   }
   }
   
   public void testAnyOtherUnitTest()
   {
	   
   }
   /**
    * Create set of tests by taking the testUrlXXX arrays and
    * running through all possible permutations of their combinations.
    *
    * @param testObjects Used to create a url.
    */
   

}
