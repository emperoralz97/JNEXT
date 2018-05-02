import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class JNEXT {

	public static void main(String[] args)throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		
		while(t-->0) {
			int n = Integer.parseInt(in.readLine());
			String s = in.readLine();
		 	long ar[] = new long[n];
		 	int i = 0;
		 	for(String ch : s.split(" ")) {
		 		ar[i++] = Long.valueOf(ch);
		 	}
		 	int pivot=-1;
		 	//1.Find the 1st non increasing no.
		 	for(i=n-1;i>0;i--) {
		 		if(ar[i]>ar[i-1]) {
		 			//2.Set the pivot to the no.
		 		pivot = i-1;
		 		//System.out.println(pivot);
		 		break;
		 		}
		 		
		 	}
		 	if(pivot!=-1) {
		 		int r;
		 		//3.Find the rightmost largest no.
		 		for(i=n-1;i>pivot;i--) {
		 			//System.out.println("ar[pivot] "+ar[pivot]+" ar[i] "+ar[i]);
		 			if(ar[pivot]<ar[i]) {
		 				r = i;
		 				//4.Swap the elements
		 				long temp = ar[pivot];
		 				ar[pivot] = ar[i];
		 				ar[i] = temp;
		 				
		 				//5.Reverse the remaining
		 				int li = n-1;
		 				for(int j = pivot+1;j<n-1;j++) {
		 					//System.out.println("j "+j+" : "+ar[j]+" "+ar[li]);
		 					temp = ar[j];
		 					//System.out.println("temp "+temp);
		 					ar[j]=ar[li];
		 					//System.out.println("ar[j]"+ar[j]);
		 					ar[li]= temp;
		 					//System.out.println("ar[li]"+ar[li]);
		 					li--;
		 				}
		 				//System.out.println("ri "+r);
		 				break;
		 			}
		 		}
		 		
		 		//Display the numbers
			 	for(i = 0;i<n;i++) {
			 		System.out.print(ar[i]);
			 	}
			 	System.out.println();
		 		
		 	}else {
		 		System.out.println(pivot);
		 	}
			
		}
	}

}
