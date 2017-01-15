// Two red beads are placed between every two blue beads. There are N blue beads.

// Implement count_red_beads(N_blue) in Javascript countRedBeads(n)) so that it returns the number of red beads.

// If there are less than 2 blue beads return 0.

function countRedBeads(n) {
  if (n < 2) {
    return 0;
  } 
  return n === 2 ? 1 : (n - 2) * 2 + 2;
}
