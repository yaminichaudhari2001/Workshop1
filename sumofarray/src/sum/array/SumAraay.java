package sum.array;

public class SumAraay {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int sum=0;
        System.out.println("The given array is ");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0; i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println();
        System.out.println(" Sum of array is "+sum);
    }
}
