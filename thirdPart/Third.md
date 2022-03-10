# Part 3: Reflection on the automation exercise

  1.  In terms of the different testing categories that describe the scope of the test, how
	  would you describe the type of test you have just written? 
	 
	 ### Type of test: Automated GUI Testing
	 
	| **Test**                                         |  **Scope**									  |
	|----------------------------------------------|----------------------------------------------|
	| Access the site 							   | Verify the correct acceso to the site.  |
	| Look for a star wars BB-8 keychain 		   | Validate the search from the search bar |
	| Verify it appears in the “suggested results” | Check the functionality of search matching results list |
	| Check that you are redirected to the item    | Check the redirection to the item when clicking on it, in the list|	 
	| Add it to your cart 						   | Check add to cart action |	


  2. Outline the possibilities of automating these specific test cases in different scopes,
	 together with a short summary of the pros and cons of each of them.

	| **Type of test**                                |  **Pros**								   |  **Cons**		                              |    
	|---------------------------------------------- |----------------------------------------------|----------------------------------------------|
	| Browser Compatibility Testing 			   | Test the operation of navigation in different browsers  |Test creation time and difficulty.| 
	| Performance/Load Testing: Evaluate the application during the search and selection of a product, with an amount of 5000 requests in a set time of 1 hour. | Validate the availability of the site before a number of frequent purchases according to the demand for the product.|Low reliability as it is a controlled environment.| 
	| Stress Testing: to simulate massive accesses, increasing the number of searches every 10,000 accesses to evaluate the launch of a new product.| Know the maximum volume of transactions in the face of a number of unexpected purchases. |Those are often expensive tests if you want to increase reliability, as high hardware availability may be required| 

	

