//ARRAYS and LOOPS

//Array - Variable that holds multiples of like data
//Example
        String[] studentNames; //Declares a new array of strings named studentNames
        studentNames = new String[7]; //Defines studentNames will hold 7 strings (fixed size) 0 - 6

        studentNames[0] = "Bobby";
        studentNames[1] = null; //Empty - hasn't been defined yet
        studentNames[2] = null; //Empty - hasn't been defined yet
        studentNames[3] = null; //Empty - hasn't been defined yet
        studentNames[4] = null; //Empty - hasn't been defined yet
        studentNames[5] = null; //Empty - hasn't been defined yet
        studentNames[6] = "Troy";

//Example of array declared and defined on one line
        int[] numbers = new int[3];
        numbers[0] = 13;
        numbers[1] = 0; //default to zero
        numbers[2] = 7;
        int firstNum = numbers[0];
        firstNum == 13;

//String array - elements default to Null = Empty
//Int array - elements default to 0
//ArrayIndexOutOfBoundsException - Error if request index above array length
//Element - What is in the array slot
//Index - Address of the slot
//arrayName.length - 1 = last element


//STACK - can only hold data types with defined sizes and pulls others from HEAP
        int x = 0;
        double y = 3.4
        long z = 104392
        int copy = x;

        x        | 0
        y        | 3.4
        z        | 104392
        copy     | 0    //reference x
        name     | 0110 //Name is and objects and objects can't go in stack. They pull from heap.
        nameCopy | 0110 //See below
        nums     | 1010 //See below
        numsCopy | 1010 //See below


//HEAP - holds data types with undefined sizes and passes address to stack
        int[] nums = new int[3]; // NEW keyword creates new object in heap
        int[] numsCopy = nums;
        String name = "Bobby";
        String namesCopy = name;

        "Bobby"   // 0110 - address assigned by HEAP for stack to reference
        [0][0][0] // 1010 - address assigned by HEAP for stack to reference

//Pass by value - giving you the value of this thing

----------

//for loop - loops through block of code a given amount of times
//Example:
        int timeToRun = 3;

        for(int i = 0; i < timesToRun; i++) {
          statements;
          statements;
          statements;
        }
//in above example:
// int i = 0;       - initialize the iterator  - only runs once
// i < timesToRun;  - condition                - runs as long as its true
// i++;             - incrementer              - increments i by 1 in this example

//Example:
        public int returnSumOfLoop() {

          int[] numbersToAddUp = {3, 2, 4, 9};
          int sum = 0;

          for (int i = 0; i < numbersToAddUp.length; i++) {
            sum += numbersToAddUp[i];
          }
          return sum;
          System.out.print(sum);
        }

// double check these

        String[] firstNames;
        firstNames = new String[3];
        firstNames[0] = "Bobby";
        firstNames[1] = "Joe";
        firstNames[2] = "Rich";



        String[] firstNames = new String[3];
        firstNames[0] = "Bobby";
        firstNames[1] = "Joe";
        firstNames[2] = "Rich";



        String[] firstNames;
        firstNames = new String[] {"Bobby", "Joe", "Rich"};



        String[] firstNames = {"Bobby", "Joe", "Rich"};
