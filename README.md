
cmp 202.docx


Algorithm Explanation
Step1:Input Parameters:

The function rotLeft takes two parameters:
Int[] a: The array to be rotated.
Int d: The number of left rotations to be performed

Step2: Initialize Variables:

Int n = a.length;: Get the length of the array.
Int[] rotatedArray = new int[n];: Create a new array rotatedArray to store the result after rotation.

Step 3:Rotate Elements:
Loop through each element of the original array a using a for-loop:
For each element at index i, calculate its new position newIndex after d left rotations.
The new index is calculated as (i + (n – d)) % n:
N – d converts the left rotation to a right rotation.
Adding i and taking modulo n ensures that the index wraps around if it exceeds the array length.

Step4:Return Rotated Array:

After the loop completes, the rotatedArray contains the elements in their new rotated positions.
Return rotatedArray; returns the rotated array.

Step5: Main Method for Testing:
The main method demonstrates how to use the rotLeft function:
It defines an array {1, 2, 3, 4, 5}.
Specifies d = 2 to perform 2 left rotations.
Calls the rotLeft function and prints the rotated array
2 / 2

Group members name;
Adeniji boluwatife Joan bhu/22/04/05/0031.
Victor ayomide
Bhu/22/04/10/0010.
Angelo okiotorhoro
Bhu/22/04/10/0016.
Effiong Samuel
Bhu/22/04/05/0099.



