import java.util.Scanner;

public class MinHops {

	private static int minHops(int[] arr, int n) 
    { 
	 			
	 int previous = 0;
			    int current = 0 ;
			    int jumps = 0;
			    for(int i = 0; i < n;i++) {
			        if(i > previous) {
			            jumps = jumps + 1;
			            previous = current;
			        }
			        current = Math.max(current, i + arr[i]);
			    }
			    return jumps;
    } 
  

    public static void main(String[] args) 
    { 
    	
    	
    	Scanner in =new Scanner(System.in);
    	System.out.print("Enter no.of compartments : ");
    	int TotalCompartments=in.nextInt();
    	int arr[] = new int[TotalCompartments];
    	System.out.println("Enter JETPACK values of compartments : ");
    	
    	for(int i=0;i<TotalCompartments;i++) {
    		arr[i]=in.nextInt();	
    	}
       
    	System.out.print("Compartment Structure:  ");
    	for(int i=0;i<TotalCompartments;i++) {
    		if(i!=TotalCompartments-1) {
    	System.out.print(arr[i]+"-");	
    		}
    		else System.out.println(arr[i]);
    	}
  
    	System.out.print("Enter Compartment number to reach :");
    	int HiddenCompartment=in.nextInt();
    	in.close();
    	
        System.out.println("Minimum number of hops to reach = " + minHops(arr, HiddenCompartment)); 
    } 
}
