//Collections
//Generics
//List and Set
//Queues and Stacks

//Packages are like folders to organize your code
//java.util.Date = fully qualified name and path - places shortcut in package to date class

//java.util.Set
//java.util = package
//Set = interface
//interface = group of method signatures

//Collections Library
  //List - ordered, 0-indexed collection of objects - acts like an array but can grow and shrink
  //Set - unordered, non-duplicated collection of objects
  //Queue - First in first out or FIFO
  //Stack - Last in first out
  //Primitives can't go on a list unless you convert it to an object
  //AutoBoxing - Java does the conversion for us. Automatically converts going in and coming out
  //int - object = Integer
  //double - object = Double
  //boolean - object = Boolean

  //New Integer object
        Integer i = new Integer(47);
        int n = i;
        i = n;

  //above example
  /*
  STACK         HEAP
  i   1000      1000  47
  n   47        1001  47
  i   1001
  */

  //New List
        List<Interger> goodPorts = new ArrayList<Integer>(); //list of Integers named goodPorts
  //< > = Generics

  //List is the interface
  //Interface defines what the methods are that you can call in this object
  //ArrayList is the conrete class or the implementation of the methods that the List interface defines

//FOR EACH LOOPS
//for each port in goodPorts, run this block
      for(Integer port : goodPorts) {
        System.out.println("Foreach Port " + port)
      }

      //for(variable declaration : Collection) {

      }
