// Encapsulation
// Access Modifiers
// Constants
// Static

// Encapsulation - concept of hiding and limiting access to data inside a class - CODE REUSE
//  -modularity
//  -loose coupling

// Class - "BANK"
// name of bank
// customer
// -methods
//    -getCustomer(key)
//
// Class - "Customer"
// account
//  -balance
//  -methods
//    -deposit()
//    -withdrawal()
//    -transfer()

/*
Think of your project as a list of objects - not one giant method that runs a bunch of code

Deck
 -Card
   -Suit
     -Color
   -Rank

Deck
 -Shuffle
 -Draw
   -Returns Card

Card
  -Flip

Dealer

Player
  -Hand

*/

//Create objects first that dont contain other objects. Start it from the bottom. Do bank last.
//Class names are capitalized and are nouns.
//Methods are typically verbs.

//CONTANT_NAME

//Delegation method - set up a method in your class that calls the method of another object that you have under your control

//Constructor guarantees you have an object you can do something with
