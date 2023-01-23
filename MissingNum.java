package Review;

public class MissingNum {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        for(int j=5;j<=1;j--)
        {
            if(arr[(j-1)]==arr[j])
            {

            }
            else
            {
                System.out.println(arr[j-1]);
            }
        }




    }
}
