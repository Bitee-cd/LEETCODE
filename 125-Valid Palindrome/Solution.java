class Solution {
    //Example madam, racecar
    // 1 <= s <= 20,000

    //SIMPLE APPROACH
    //1. removing non alphanumeric characters from the string and converting to lowercase
    //2. reverse the string
    //3. compare the reversed string with the initial string and return

    public boolean isPalindromeBruteForce(String s){
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        String reverse = new StringBuilder(s).reverse().toString();

        return reverse.equals(s);

    }


    // TWO POINTER APPROACH

    //A. for(i=0;i<s.length();i++){} -> one pointer approach
    //B. for(i=s.length-1;i>0;i--){} -> one pointer approach
    //C. two pointer approach you will be joining A and B
    // left pointer --> 1,2,3
    // right pointer ---> 6,5,4

    // [1,2,3,4,5,6]

    // PSEUDOCODE
    //1. loop through the string -using left and right pointers
    //2. skip non alphanumberic characters
    //3. you compare the characters at the pointers
    //4. if they are non equal -> return false
    // return true;
    public boolean isPalindromeTwoPointer(String s){
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            while(left <right && !Character.isLetterOrDigit(s.charAt(left))){
                left ++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right --;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }



}

