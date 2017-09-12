//Classes
//Objects
//Instance Variables
//Access Modifiers
//Constructors

//Principles of Object-Oriented Programming

  //Code the most generic way possible

  //***Encapsulation*** - concept of hiding and limiting access to data inside a class
  //black box - buttons on outside but dont know whats going on inside

  //***Polymorphism*** - ability for code to take many forms
  //example below - change type of list without changing code
        List<String> students = new ArrayList<>();
        code asd
        code fgh
        code jkl

        List<String> students = new LinkedList<>();
        code asd
        code fgh
        code jkl

  //***Inheritance*** - concept of reusing code by creating a hierarchy of classes that relate to each other

//Class - blueprint or mold that everything is made of ( .java file )

//Implement an interface

//Inherit from a class

//Static - stays in class

        Math.round(9.6); // .round method is Static

        String name = "Bobby"; // creates new object in memory to be used in program

//Object has state(data) and behavior(methods)

//My First Class
/*
                Rectangle                        // class name - mold
          ____________________
              int length                         // instance variables - unique to object
              int height
          ____________________
              int getArea()                      // object methods
              boolean isLargerThan(Rectangle)
*/



//public - you can make objects out of

//all instance variable should only be avaiable to the object and nothing else
//object is the only thing that can touch its private parts

//Getters and Setters

//this - object I am in right now

        Rectangle square = new Rectangle();

  //new Rectable = instantiate
  //Rectangle(); = initializes constructor

//Contructor initializes values in newly created object
//Default Constructor - takes no arguments and doesn't do anything
