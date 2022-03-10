

Hotel reservations have been made under the following scenarios:  
## | - - - - - -  **Escenario 1** - - - - - - |
### 1. **Make a hotel reservation by searching from Home without login and with Login.**

The main purpose of the functionality is to make hotel reservations. An attempt is made to make a reservation from a search by entering data in the search engine without login and with login.

**Expected result:** make a search by entering the data: city, dates and number of travelers and make a reservation by selecting one of the search results.

**We have the following results:**

1. When clicking on the chosen hotel, regardless of dates, cities or price, it shows a message that indicates "No rooms available please try different dates".
1. On failing the booking attempt, it suggests other options in “You might also like”, which fails on click, shows 404 error.
1. In the results list, clicking on Details redirects to another booking website.
1. The search for cities may be wrong, for example, before the election of Barcelona in Venezuela, results have been listed for Barcelona Spain.
1. The list of search results is inaccurate, after repeating the same query for a city in a range of dates, it can show results in one search and not show them in the other, with a message “Oops no matches”.

The reservation behavior after a search is not correct, since the search results don’t allow the website to consult the selected hotel or make a reservation, so it is not possible to fully verify the functionalityI.

**Possible bugs:**

- It is not possible to indicate the dates of a reservation or the number of people.
- It is not possible to access other options suggested in “You might also like”. Show 404 error.
- The search for hotels doesn’t correctly choose the city in all cases.
- Doing the same search returns different results.

**Possible improvements:**

- Consider a suggestive link for access to the execution of a reservation from the list of results, currently accessed from the image.
- If a user does a search without login, it should preserve the search results when logged in.
- The calendar shows the dates in different colors, some blue and some black. There may be a single indicative color for availability
- The calendar could show all past dates disabled.  



## | - - - - - -  **Escenario 2** - - -- -  -- |
### 2. **Make a hotel reservation from Feature Hotels, without searching with login**

` `**We have the following results:**

1. When clicking on the chosen hotel, it is possible to consult the hotel information and available rooms.
1. When selecting a room, it is not possible to indicate the dates of the reservation or the number of people.
1. Before making the reservation, the user's data is requested because they are not logged in.
1. When accessing the data form, it shows by default 2 adults and 2 children.
1. The number of people in the reservation summary does not match the number of people on the form.
1. It is possible to finalize the reservation and/or receive it by email

It is possible to make a reservation, but the behavior is not correct, since it is not possible to indicate or modify the reservation data, so it is not possible to check the functionality correctly. 

**Possible bugs:**

- It is not possible to indicate the dates of a reservation or the number of people.
- The system takes a date and number of nights that the user has not indicated.
- The number of people in the reservation summary "booking details" does not match the number of travelers to complete information on the form.

**Possible improvements:**

- The information provided in Personal information may be reused, for one of the travelers, it can be the main traveler.
- The system should suggest the user to register with the data provided, to create an account.
- The reservation invoice will be able to show the name of all travelers
- When canceling a reservation request, the user should receive an email with the cancellation request.


**Risks to mitigate:**

- Use encryption for the site, especially for the payment section.
- Validate user data, since he didn’t login.
- Validate field formats in the form, to improve usability and avoid external attacks.
- Validate user data without login, email, phone, etc. to avoid false reservations.
- Include a way to confirm the reservation  

## | - - - - - -  **Escenario 3** - - -- - -- |

### 3. **Make a hotel reservation from Feature Hotels, without performing a search after having logged in**

We have the following results:

1. When clicking on the chosen hotel, it is possible to consult the hotel information and available rooms. 
1. When selecting a room, it is not possible to indicate the dates of the reservation or the number of people.
1. When accessing the traveler data form, it shows by default 2 adults and 2 children.
1. If a number of travelers has been previously entered in the search engine, consider that number of travelers in the reservation form.
1. The number of people in the reservation summary does not match the number of people on the form.
1. It does not respect the maximum number of guests in a room, since the form can show more than the capacity.
1. It is possible to finalize the reservation and view it in My Bookings. 


It is possible to make a reservation, but the behavior is not correct, since it is not possible to indicate or modify the reservation data and the data requested within a reservation may be inconsistent with the search parameters, so it is not possible to it is possible to check the functionality correctly.

**Possible bugs:**

- It is not possible to indicate the dates of a reservation or the number of people. 
- The system takes a date and number of nights that the user has not indicated.
- The number of people in the reservation summary "booking details" does not match the number of travelers to complete information on the form. 
- If a number of travelers has been previously entered in the search engine, consider that number of travelers in the reservation form.
- Does not respect the maximum limit of guests in a room.



**Possible improvements:**

- It will be possible to reuse the information of the logged in user, for one of the travelers, it can be the main traveler.
- The reservation invoice will be able to show the name of all travelers.
- When canceling a reservation request, the user will be able to view it in My Bookings / Status.
  
   
## Prioritized use case: 

A user makes a reservation after having made a search. 

I would explore the reservation area after having done a search. (currently not possible) 

This would be the first option to try, since it would be the most intuitive way to try to make a reservation, a user to be able to reserve will want to enter the place, date and number of people of his preference and not what the system chooses 



