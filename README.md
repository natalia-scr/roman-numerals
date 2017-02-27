#Roman Numerals Converter
__________________________________________________________

The challenge is to write a class that implements the following interface:
public interface RomanNumeralGenerator {
   public String generate(int number);
}
For example, see the following sample inputs and outputs:
1 = “I”
5 = “V”
10 = “X”
20 = “XX”
3999 = “MMMCMXCIX”
Caveat: Only support numbers between 1 and 3999



#Approach:
__________________________________________________________
- First, I set up the project and a basic test returning just an empty string;

- Next, I solved the problem for the simplest cases: input numbers from 1 to 3 using a simple loop that concatenated strings;

- Then, I handled the caveat to make sure the method works for numbers between 1 and 3999;

- When it came to roman numerals like IV and V, I refactored the code to use a LinkedHasmap as it allows to use key-value pairs and when iterating
over it, the items are returned in the order they were initially inserted;

- At the end, I added a Main class to the project to use the command line for user input. Now, when running the project, it will ask the user to input
a number between 1 and 3999 and will print the conversion result to the terminal.



#How to run the project
__________________________________________________________

In the IDE:

 - To run the project you will need to have JDK installed and an IDE(IntelliJ Idea, NetBeans, Eclipse);

 - Open the IDE and install the project;

 - to run the project, right click on the Main class and click Run;

 - to run the tests, right click on the test directory and then click Run all tests


On the command line:

- go to the project root folder ( romanconverter ) from your terminal then do:

cd out/production/romanconverter

and then to run the project run the command: java com.bbc.romangenerator.Main

