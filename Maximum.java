import java.util.Arrays;

public class Maximum
{
    public static int maxima(int [] array)
    {
        int m = 0;
        int i=1;
        while ( i < array.length)
        {
            if (array[i] > array[m])
            {
                m = i;
            }
            i++;
        }
        return m;
    }
    public static int maximum(int [] array)
    {
        int temmaximum = array[0];
        int i=1;
        while ( i < array.length)
        {
            if (array[i] > temmaximum)
                temmaximum = array[i];
            i++;
        }

        return temmaximum;
    }
    public static int minimum(int [] array){
        int temminimum = array[0];
        int i=1;
        while ( i < array.length)
        {
            if (array[i] < temminimum)
                temminimum = array[i];
            i++;
        }

        return temminimum;
    }
    public static int minima(int [] array){
        int m = 0;
        int i=1;
        while ( i < array.length)
        {
            if (array[i] < array[m])
            {
                m = i;
            }
            i++;
        }
        return m;
    }
    public static int [] extremal(int [] array){
        int [] ans= {array[0],array[0]};
        for(int i=1;i<array.length;i++){
            if(ans[1]<array[i])
                ans[1]=array[i];
            else if (ans[0]>array[i])
                ans[0]=array[i];
        }
        return ans;
    }
    static int count = 0;
    static boolean compare(int x, int y)
    {
        count++;
        return x > y;
    }
    public static int [] extremal1(int [] array){
        int [] ans= {array[0],array[0]};
        for(int i=1;i<array.length;i++){
            if(compare(array[i],ans[1]))
                ans[1]=array[i];
            else if (compare(ans[0],array[i]))
                ans[0]=array[i];
        }
        return ans;
    }
    static int stringcompre(String x, String y)
    {
        count++;
        return x.compareTo(y);
    }
    static String [] extremal(String []  names){
        String [] ans= {names[0],names[0]};
        for(int i=1;i<names.length;i++){
            if(stringcompre(names[i],ans[1])>0)
                ans[1]=names[i];
            else if (stringcompre(ans[0],names[i])>0)
                ans[0]=names[i];
        }
        return ans;
    }
    public static int  maximum(int [][] x){
        int tmp=maximum(x[0]);
        for (int i=1 ;i<x.length;i++){
            int t_max=maximum(x[i]);
            if (tmp<t_max)
                tmp=t_max;
        }
        return tmp;
    }
    // test driver
    public static void main(String[] args)
    {

        int [] arr = new int[]{342,34,233,456};
        System.out.println(maximum(arr));
        System.out.println(maxima(arr));
        System.out.println(minimum(arr));
        System.out.println(minima(arr));
        System.out.println(Arrays.toString(extremal(arr)));
        System.out.println(Arrays.toString(extremal1(arr)));
        System.out.println(count);
        String [] twoends = extremal(new String[]{"Zhang", "Li", "Chao","1",
                "%", "*", "@"});
        System.out.println("min=" + twoends[0] + ", and max=" + twoends[1]
                + ", #comparisons=" + count);
        int [][]x={{1,2,3,4,5},{5,6,7,2,10}};
        System.out.println(maximum(x));


    }
}
