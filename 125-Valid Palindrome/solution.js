//Brute force Approach
function isPalindromeBruteForce(s) {
  s = s.replace(/[^a-zA-Z0-9]/g, "").toLowerCase();
  let reversed = s.split("").reverse().join("");
  return s === reversed;
}

// Two Pointer Approach
function isPalindromeTwoPointer(s) {
  let left = 0,
    right = s.length - 1;

  while (left < right) {
    while (left < right && !isAlphanumeric(s[left])) left++;
    while (left < right && !isAlphanumeric(s[right])) right--;

    if (s[left].toLowerCase() !== s[right].toLowerCase()) return false;
    left++;
    right--;
  }

  return true;
}

// function to check if a character is alphanumeric
function isAlphanumeric(char) {
  return /[a-zA-Z0-9]/.test(char);
}
