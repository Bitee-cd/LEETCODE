class Solution {

    public void rotate(int[][] matrix) {
        //[1, 2, 3]         //[7, 4, 1]
        //[4, 5, 6]     ->  //[8, 5, 2]
        //[7, 8, 9]         //[9 ,6 , 3]

        //Basic Operations of a matrix
        //TRANSPOSE 
        //[1, 2, 3]         //[1, 4, 7]
        //[4, 5, 6]     ->  //[2, 5, 8]
        //[7, 8, 9]         //[3, 6, 9]
       // Transpose relationship: (a,b) ->  (b,a)
       //3.  (0,2)        ->  (2,0)

        //HORIZONTAL FLIP 
        //[1, 2, 3]         //[3, 2, 1]
        //[4, 5, 6]     ->  //[6, 5, 4]
        //[7, 8, 9]         //[9, 8, 7]
        //Relationship: (a,b) ->(a,m-b-1) where m is the length of the matrix.
        //6. (1,2) ->(1,0)

        //VERTICAL FLIP 
        //[1, 2, 3]         //[7, 8, 9] 
        //[4, 5, 6]     ->  //[4, 5, 6]
        //[7, 8, 9]         //[1, 2, 3]
        //Relationship: (a,b)->(m-a-1,b) where m is the length of the matrix.
        //8. (2,1) -> (0,1)

        //Solved matrix
        //[1, 2, 3]         //[7, 4, 1]
        //[4, 5, 6]     ->  //[8, 5, 2]
        //[7, 8, 9]         //[9 ,6 , 3]

        //1 (0,0) -> (0,2)
        //2. (0,1) -> (1,2)
        //3. (0,2) -> (2,2)

        //7. (2,0)  -> (0,0)
        //8. (2,1) -> (1,0)
        //9. (2,2) -> (2,0)

        //Deduced relationship 
        // (a,b) -> (b, m-a-1)

        //Example
        //7. (2,3) -> (3,1). good. 

        //1 transpose -> horizrontal flip 
        // (a,b) -> (b,a) -> (b, m-a-1)

        //Pseudocode
        // - Loop through the array 
        //     -perform a transpose on the elements
        // - Loop through the resulting array 
        //     - perform a horizontal flip 
   
  
        //SWAP 
        // // a, b
        // int temp = a;
        // a = b;
        // b = temp;

        // Execution time O(n)^2
        //TRANSPOSE 
        for (int i=0; i< matrix.length; i++ ){
            for ( int j=i; j<matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }


        //HORIZONTAL FLIP
        for (int[] row: matrix ){
            for (int i =0; i <matrix.length/2; i++){
                int temp = row[i];
                row[i] = row[matrix.length-1-i];
                row[matrix.length-1-i] = temp;
            }
        }

    }
}

// Challenges 
// 1. 180 degrees clockwise 
// 2. 90  degrees anticlockwise
// 3. try solving it without using the inplace method 
// 4. create a function that takes in an image and rotates