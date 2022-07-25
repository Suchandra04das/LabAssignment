package arrayexample;

public class TestArray {
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static int[] getArray()
    {
        return new int[]{20,30,50};
    }
    public static void main(String[] args) {
        int arr[]={4,5,2,1};

        //getting class name
        Class c=arr.getClass();
        String name=c.getName();
        //print the class name of java array
        System.out.println(c);
        System.out.println(name);
        //Anonymous array in java
        TestArray.printArray(new int[]{12,20,30,40});
        //hold array returning from method
        int[] obj=getArray();
    }
}
