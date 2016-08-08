import java.util.Scanner;

public class DuplicateEliminate {
 
 
    public static void main(String args[])
     
    {
     
            int []a = new int[5]; 
            int size = 5;
            int i,j,k,l=0;
            System.out.println("Enter the numbers in the array:"); 
            for(i=0;i<5;i++)
            {
            	a[i]=new Scanner(System.in).nextInt(); //getting the input values
            }
            
            do{
            for (i=0;i<size;i++) 
            {
 
                for (j=i+1;j<size;j++) 
                {
 
 
                    if (a[i]==a[j]) 		//checking elements for duplicates
                    {
                        while (j<(size)-1) 
                        {
                            a[j] = a[j+1]; 	//shifting the element
                            j++;
                        }   
                        size--; 	//removing the element by reducing the size of the array
                    }
                }
                l++;
            }
            }while(l<=5); //to check for multiple instances of the same number
            
            
            System.out.println("The array after deleting the duplicates is as follows:");
            for (k = 0; k < size; k++) 
            {
                System.out.println(a[k]);  //displaying the values after deleting duplicates            }
    }
            System.out.println("Program done by R.M.Chandrakanth(2015103054)");
    }
    
}