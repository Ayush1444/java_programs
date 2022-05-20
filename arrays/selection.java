class selection
{
    public static void main()
    {
        int arr[]={99,76,45,2,31,23};
        int min;int a=arr.length;int b;
        for(int i=0;i<a;i++)
        {
            min=i;
            for(int j=i+1;j<a;j++)
            {
                if(arr[min]>arr[j])
                 min=j;
                 
            }
            b=arr[min];
            arr[min]=arr[i];
            arr[i]=b;
        }
        for(int z=0;z<a;z++)
        {
            System.out.println(arr[z]);
        }
    }
}