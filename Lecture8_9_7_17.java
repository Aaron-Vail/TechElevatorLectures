//Collections
//Big O Notation
//Map
//Problem Solving
//Debugging

//Big O - How much time does it take and how many elements. Order of magnitude.

  //Very simple algorithm - O(1) Big O Notation of 1
  //Problem is linear and doesn't scale.
        String[] cities = new String[] {"Cleveland", "Akron", "Dayton"};

        String here = cities[0];

  //More complex algorithm - O(n) Big O Notation of n - how many elements does it have to loop through?
        boolean hasColombus = false;

        String[] cities = new String[] {
          "Cleveland", "Akron", "Dayton"
        };

        for(int i = 0; i < cities.length(); i++) {
          if(cities[i].equal("Colombus")) {
            hasColombus = true;
          }
        }

        String here = cities[0];

  //Even more complex algorithm - O(n2) Big O Notation of n squared. City * State
        String[] states = states[] {"Ohio", "Virginia", "Iowa"};

        for(String city : cities) {
          for(String stat : states) {
            System.out.println(city + ", " + state);
          }
        }

//break = stop nearest loop if condition is met
//cache = storage of something you can get in to quickly. Pull a bunch of data and do a bunch of calculations and store in cache so same calculations don't need to be repeated.

//2D Array or associative arrays
        String[][] rooms = newString[3][2];
        rooms[0][0] = "101";
        rooms[0][1] = "102";
        rooms[0][2] = "103";
        rooms[0][3] = "104";
        rooms[0][4] = "105";
        rooms[1][0] = "Joe";
        rooms[1][1] = "Anna";
        rooms[1][2] = "Bobby";
        rooms[1][3] = "Jared";
        rooms[1][4] = "Sam";

        int roomIndex = -1;

        for(int i = 0; i < rooms[0].length; i++) {
          if(rooms[0][i].equal("102")) {
            roomIndex = i;
          }

          String name = rooms[1][roomIndex];
        }

  /*
          0       1
      0 "101"   "Joe"
      1 "102"   "Anna"
      3 "103"   "Bobby"
      4 "104"   "Jared"
      5 "105"   "Same"
  */

//Use a MAP instead of a 2D array

//Map is a data structure that relates a key/value pair

        Map<Integer, String> rooms = HashMap<Integer, String>();

  //in above example
  //Map = interface
  //Integer = key
  //String = value
  //HashMap = most commonly used object in maps. 99.99% of the time.
  //Big O Notation of 0(1)

        rooms.put(102, "Anna");
        rooms.put(103, "Bobby");

  //Keys are unique
  //Values can be duplicated
  //Entry is an object that holds key and value together

//For loop - when you care about index or how many times you want to loop
//For each loop - when you want to loop through all elements. Break to stop if you get what you want.
//While loop - when not dealing with collections, and just want to look at conditions
