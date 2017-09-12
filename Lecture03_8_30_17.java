/*
Java ---> Javac(Compiler) ---> .class(bytecode) ---> Java(jvm) ---> CPU
-Created by and lives with the programmer
-Lives on the machine running the program

Book Store - Project
Genre Sections - Packages
Books - Classes(Source Code File)
Chapters - Methods
Sentences - Statements
Statements are made up of expressions
Expression - Unit of code that does something

int numberOfStudents = 16; - full statement
int numberOfStudents - expression
numberOfStudents = 16 - expression
16 - expression

Method - named block of code (like a function in javascript)
*/

				public int getNumOfStudents (int studentDrops) {
					int numberOfStudents = 16;
					numberOfStudents -= studentDrops;
					return numberOfStudents;
				}

/*
In above example:
public - access modifier
int - return data type
getNumOfStudents - method name
() - parameter list
return - what method will return when it is called

Method Signature = data type + method name + parameter list

Write an if statement that returns "Fizz" if the parameter is 3 and returns an empty String for anything else.
*/

				public String returnFizzIfThree(int number) {
				  if (number == 3) {
				    return "Fizz";
				  } else {
				    return "";
				  }
				}

/*
Ternary Operator:
Write an if statement that returns "Fizz" if the parameter is 3 and returns an empty String for anything else.

public String returnFizzIfThreeUsingTernary(int number) {
  return (condition) ? (if true) : (if false);
}
*/

				public String returnFizzIfThreeUsingTernary(int number) {
				  return (number == 3) ? "Fizz" : " ";
				}

/*
Comparison Operators
== - equal to
!= - not equal to
> - greater than
< - less than
>= - greater than or equal to
<= - less than or equal to

Logic Operators
|| - or
&& - and
