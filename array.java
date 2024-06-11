public class LeftRotation {

    public static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        int[] rotatedArray = new int[n];


        d = d % n;
        
        
        for (int i = 0; i < n; i++) {
            int newIndex = (i + n - d) % n;
            rotatedArray[newIndex] = a[i];
        }

        return rotatedArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int d = 4;
        
        int[] result = rotLeft(array, d);
        
        
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
