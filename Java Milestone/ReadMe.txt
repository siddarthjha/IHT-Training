There are total three classes and files:

1. Main: This is the startpoint of program (Main method)
	-> It consists of UI and CLI operations and Exception handling as well.
	-> The functions in here are:
		   startPageUI()- The Application starts from here and takes inputs and calls other functions.of Loan class.
		   displayLoanMenu()- This takes the details and gives the menu for loan and sets the variables 
		   displayEMICalculatorMenu()- This is being called to calulate the EMI which sets the variables from EMICalculator class.
	   
2. Loan: It consists of getter and setter methods which intializes variables -> name, age, incomeGroup, loanAmount.
2. EMICalculator: It consists of getter and setter methods which initializes variables -> loanType, income, expenses, amountEMI, existingEMI.

javac Main.java
java Main

