//Using objects
//String
//project --> package --> class / object --> method --> statement --> expression

//Procedural programming - what we've done so far - bunch of lines of code you run through line by line
//Object-Oriented Programming - solving coding problems by thinking of them as objects

/* EXAMPLE:
  TV(object):
  state         behavior
  on and off  - boolean
  channels    - up and down / specific channel (int of allowed channels)
  volume      - up and down (int between 0 and 100)
  source      - hdmi1 / hdmi2 / input 3 (array)
*/

//Reference type = Object or Array = Held in the heap
//Value type = Primitives by themselves. Held in the stack
//Class - blueprint - Ex: Class defines what a String is
//Object - String = "Bobby" - Creates a new object using the String Class

//All classes must break down to primitives for the computer to be able to read
//String class contains an array of chars

//Layer of abstraction - We don't need to deal with indivdual chars and concatenation because the String class does it all for us.
//We dont care how our engine works or what its made of. We just drive our car.

//Constructor - method that initializes an object - constructor lives in class
//"new" = creates an instance of a class and becomes an object
//Example: new String(charArray);
//new String = instantiation --> (charArray) = initialization

//Class = source code that describes what an object does
//Object = In memory, used by programmer to interact with other code

// /** javadoc - creates documentation of method created

//Strings are immutable or can't be changed once you create them

        LocalDate today = LocalDate.now();

//Factory method - creates object for you and gives it back to you
//Static method - method that lives on the class
