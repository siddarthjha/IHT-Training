public class A
{
    public static void main(String[] args)
    {
        int temp;  
        int a[]={12,5,56,-2,32,2,-26,9,43,94,-78};  
        for (int i = 0; i < a.length; i++)   
        {  
            for (int j = i + 1; j < a.length; j++)   
            {  
                if (a[i] < a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }     
        }  
        System.out.println("Array elements in descending order:");  
        //accessing element of the array  
        for (int i = 0; i <=a.length - 1; i++)   
        {  
            System.out.println(a[i]);  
        }
        System.out.println("Array elements in ascending order:");  
        //accessing element of the array  
        for (int i = a.length - 1; i >=0; i--)   
        {  
            System.out.println(a[i]);  
        }
    }
}
