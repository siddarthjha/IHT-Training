class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int a[]={0,0,0,1,3,3,2,1,3,5,6,0};
        int n=a.length;
        int Freq[] = new int[n];
        int Count;
        for (int i = 0; i < n; i++)
    	{
    		Count = 1;
    		for(int j = i + 1; j < n; j++)
    		{
        		if(a[i] == a[j])    //Check for duplicate elements
        		{
        			Count++;
        			Freq[j] = 0;    /* Make sure not to count frequency of same element again */
        		}
        	}
        	if(Freq[i] != 0)        /* If frequency of current element is not counted */
        	{
        		Freq[i] = Count;
    		}
    	}
        /* Print frequency of each element*/
     	System.out.println("\n The Frequency of the elements in this Array is : \n");
     	for (int i = 0; i < n; i++)
      	{
      		if(Freq[i] != 0)        
      		{
      		    System.out.println("Hi");
      			System.out.println(a[i]+"Occurs %d Times \n"+ Freq[i]);
    		}		
      	}	    
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<i;j++) {
                int temp;
                if( a[j]>a[i]) {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i = 0; i < n; i++)
            System.out.print(Freq[i] +" ");
        System.out.println();
        for(int r=0;r<a.length;r++) {
            System.out.print(a[r]+ " ");
        }
	}
}
