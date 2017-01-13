// Create 2 functions:

// 1) hypotenuse(), which takes 2 integer arguments, the length of two regular sides of a right triangle, and returns
// the length of the missing side, the hypotenuse, as a number.

// 2) leg(), which takes 2 integer arguments, the first being the length of the hypotenuse, and the second being the
// length of a regular side of a right triangle. This function should return the length of the missing regular side, as a number.

// hypotenuse(3,4) // => 5
// leg(5,3) // => 4

// Note: Do NOT round the ouput number
// You do not have to verify if the input values are "proper", assume them to be non-zero integers

function hypotenuse(a, b){
  return Math.sqrt(a*a + b*b) 
}

function leg(c, a){
  return Math.sqrt(c*c - a*a);
}
