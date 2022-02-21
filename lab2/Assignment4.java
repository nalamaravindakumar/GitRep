import java.util.*;
public class Assignment4 {
    public static int[] modifyArray(int[] a){
        int length = a.length ,temp;
        for (int i = 0; i < length; i++) {    
            for (int j = i+1; j < length; j++) {    
                if(a[i] < a[j]) {    
                    temp = a[i];    
                    a[i] = a[j];    
                    a[j] = temp;    
                }
            }
        }
        int[] tempArr = new int[length];
        int j = 0;
        for (int i = 0; i < length - 1; i++) {
            if (a[i] != a[i + 1]) {
                tempArr[j++] = a[i];
            }
        }
        tempArr[j++] = a[length - 1];
       
        int[] res = new int[j];
        for (int i = 0; i < j; i++) {
            res[i] = tempArr[i];
        }
        return res;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[] = new int[n];
      for(int i = 0; i < n; i++)
      {
          a[i] = sc.nextInt();
      }
      int res[] = modifyArray(a);
      for(int j=0;j<res.length; j++)
            System.out.println(res[j]+" ");
    }
}