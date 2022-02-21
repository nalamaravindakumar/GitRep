import java.util.*;
public class Assignment3 {
    public static int[] getSorted(int[] arr){
        for(int i=0;i<arr.length;i++)
        {
            char ch[]= String.valueOf(arr[i]).toCharArray();  
            String rev="";  
            for(int j=ch.length-1;j>=0;j--){  
                rev+=ch[j];  
            }  
            arr[i]=Integer.parseInt(rev);
        }
        int temp;  
        for (int i = 0; i < arr.length; i++)  
        {  
            for (int j = i + 1; j < arr.length; j++)  
            {  
                if (arr[i] > arr[j])
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }  
        return arr;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int res[] = getSorted(a);
        for(int j=0;j<res.length; j++)
            System.out.println(res[j]+" ");
    }
}
