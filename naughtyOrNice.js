// In this kata, you will write a function that receives an array of string and returns a string that is either 'naughty' or 'nice'. Strings that start with the letters b, f, or k are naughty. Strings that start with the letters g, s, or n are nice. Other strings are neither naughty nor nice.

// If there is an equal amount of bad and good actions, return 'naughty'

// Examples:

// Python:

// bad_actions = ['broke someone\'s window', 'fought over a toaster', 'killed a bug']
// whatListAmIOn(bad_actions)
// #-> 'naughty'
// good_actions = ['got someone a new car', 'saved a man from drowning', 'never got into a fight']
// whatListAmIOn(good_actions)
// #-> 'nice'
// actions = ['broke a vending machine', 'never got into a fight', 'tied someone\'s shoes']
// whatListAmIOn(actions)
// #-> 'naughty'

function whatListAmIOn(actions) {
  var niceCounter = 0;
  for (var i = 0; i < actions.length; i++) {
    if (['g', 's', 'n'].indexOf(actions[i].charAt(0)) > -1) {
      niceCounter++;
    } else if (['b', 'f', 'k'].indexOf(actions[i].charAt(0)) > -1) {
      niceCounter--;
    } 
  }
  var outcome = niceCounter > 0 ? "nice" : "naughty";
  return outcome;
}