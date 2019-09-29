import java.util.Scanner;
public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr={1,2,3,4,5,4,6,3,7,8,9};
        System.out.println("Array:");
        for (int value:arr){
            System.out.print(value);
        }
        System.out.println("what element you want delete:");
        int number=scanner.nextInt();
        int[] arrCopy = new int[0];

        int index;
        for(int i=0;i<arr.length;i++){

            if (arr[i]==number){
                index=i;
                arrCopy=new int[arr.length-1];
                System.arraycopy(arr, 0, arrCopy, 0, index);

                if (arrCopy.length - index >= 0)
                    System.arraycopy(arr, index + 1, arrCopy, index, arrCopy.length - index);
                arr=new int[arrCopy.length];
                for(int j=0;j<arr.length;j++){
                    arr[j]=arrCopy[j];
                }
            }
        }

        for(int value: arrCopy){
            System.out.print(value);
        }
    }
}
