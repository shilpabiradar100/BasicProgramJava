package BasicProgramPractice.Array;

public class OneDimensinalArray {
    public static void main(String[] args) {
        int a[] =new int[5];  // declaration and instantiation
        //int a[]={10,20,30,40,50};
        a[0]=10; // initialization
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;

        // traversing array
        for(int i=0; i<a.length; i++ ){
            System.out.println(a[i]);
        }
    }
}
