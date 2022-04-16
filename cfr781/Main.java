class Main
{
    // Function to calculate the frequency of all elements in the array
    public static void findFrequency(int[] A)
    {
        // create a count array of size `n` to store the count of all array elements
        int[] freq = new int[A.length];
 
        // update frequency of each element
        for (int e: A) {
            freq[e]++;
        }
 
        // iterate through the array to print frequencies
    }
 
    public static void main(String[] args)
    {
        int[] A = { 2, 3, 3, 2, 1 };
        findFrequency(A);
    }
}