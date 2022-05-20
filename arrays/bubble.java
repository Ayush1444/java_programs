import java.util.*;
class bubble
{
    public static void main()
    {
        int array[]={9,8,7,6,5,4,3,2,1};//actual length 8  array length 9
        int a;
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length-1;j++)
            {
                if(array[j]>array[j+1]){
                 a=array[j];
                 array[j]=array[j+1];
                 array[j+1]=a;
                }
            }
        }
        for(int b=0;b<array.length;b++)
        {
            System.out.println(array[b]);
            }
            }
        }