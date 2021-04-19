# ENSE 370 Winter 2020 Final Exam – Question 3

**PROMPT**: Consider an online used car sales application where a human user, the Customer, can perform any of the following **two** actions: (i) browse a catalog of used cars on sale, and (ii) make an appointment to view the car (and test drives it). Another human user, the Seller, can perform **one** action of updating the catalog (e.g. a used car becomes available for sale, or a used car is sold). However, prior to making an appointment to view the car, the Customer must perform **another** action of signing-in with his registered userID and password. The Seller, too, must perform the same action of signing-in before he can update the catalog.

After signing-in, the Customer is only allowed to make appointments. The Customer account cannot update the catalog. Similarly, the seller is only allowed to update the catalog but not make appointments. Anybody can browse the catalog of used cars and signin is not required for that action. 

When the application is launched, a menu is provided to the human user. If browse catalog is selected, the system will retrieve information from the database and display it to the user. If make appointment or update catalog is selected, a sign-in page is loaded and the human user is prompted to enter his userID and password. After the userID and password are verified, the system will then prompt the user to provide the necessary information (e.g. date and time of appointment, or the information of the used car whose information needs to be updated) to continue with the action. The human user may make multiple appointments or multiple updates. After all the actions are completed, or at any time during the session, the human user can select to sign-out of the system. 

If the password is not valid, the human user is prompted to enter the password again. After three failed attempts at the password, the user is re-directed to another screen to reset his password.

PART A: Draw the use case diagram.

PART B: Write the use case description for the “Sign-in” use case. This use case is started when the human user selects the make appointment action or the update catalog action. A sign-in screen will be loaded and the human user is prompted to enter his userID and password. After the userID and password are verified, the system will prompt the user to enter the required information for the actions to continue. If the user failed to enter the correct password after three tries, the system will display a screen to the user to prompt him to reset his password.

PART C: Now write the use case description for the “Make Appointment” use case. This use case starts from the human user selecting the make appointment action and includes the “Sign-in” use case. After the signing-in is validated, the system will display a list of available dates and times for the human user to select. After a date and time is selected, the system will update the appointments database and display a confirmation number to the human user. The list of available dates and times are displayed again to the human user for him to book another appointment. This is repeated until the human user selects sign-out, and the system will return to the main menu.

PART D: Draw the software system context class diagram.

PART E: Draw the object structuring diagram, including all external objects, boundary objects, entity objects, control objects and service objects. You may assume that there are two "service" objects, one for the Catalog Service, and the other for the Account Validation Service. Hint: Notice that you will need both a stateless "coordinator" object and a stateful "state dependent control" object. If the action selected is the “browse catalog” action, the "user interaction objection" will ask the "coordinator" object to contact the CatalogService. Otherwise, the "user interaction objection" will contact the "state dependent control" for signing-in. You may declare as many entity objects as you wish to store the used car information, appointment information, etc. Include stereotypes for all your objects.

PART F: The message sequence for the “Sign in” use case, which starts with input from the primary actor, the human user, is as follows:

- S1: The Human User selects the “make appointment” action or the “update catalog” action.
- S1.1: The Human User Interaction object displays a sign-in screen and prompts the Human User to enter his userID and password.
- S2: The Human User enters his userID and password.
- S2.1: The Human User Interaction object reads the user input and sends a Sign-in Input Received message to the State Dependent Control object. The equivalent Sign-in Input Received event causes the State Dependent Control statechart to transition from the Idle state (initial state) to the Validating UserID and Password state. The output event associated with this transition is Validate Account and Password.
- S2.2: The State Dependent Control object sends a Validate Account and Password request to the Account Validation Service.
- S2.3: The Account Validation Service validates the userID and password and sends a Valid UserID and Password response to the State Dependent Control object. As a result of this event, the State Dependent Control object will transition to the Waiting For Human User Input state. The output event for this transition is Display Input Screen, which corresponds to the output message sent by the State Dependent Control object.
- S2.3a1: If the validation fails, the Account Validation Service will send a NotValid response to the State Dependent Control object.
- S2.3a2: The State Dependent Control object will sends a NotValid response to the to the Human User Interaction object.
- S2.3a3: The Human User Interaction object will prompt the user to enter the password again.
- S2.3b: If the sign-in fails after three attempts, the Human User Interaction object will display a Reset Password screen and prompt the Human User to reset his password.
- S2.4: The State Dependent Control object sends the Display Input Screen message to the Human User Interaction object.
- 2.5: The Human User Interaction object displays a screen for the Human User to enter the required information.

Draw the communication diagram (or sequence diagram) for the “Sign-in” use case. Include all the alternative message communications.

PART G: Using the message sequence in Q3(f), draw the statechart for the State Dependent Control object for the “Sign-in” use case.
