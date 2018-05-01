import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JNEXT {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			int li = n-1;//li-->last index
			//int ar[] = new int[n];
			ArrayList<Integer> ar = new ArrayList<>(n);
		 	while(n-->0){
		 		ar.add(in.nextInt());
		 	}
		 	//System.out.println(ar);
		 	if(ar.get(0)==9 && ar.get(li)==9) {
		 		System.out.println(-1);
		 	}
		 	else
		 	{
		 		int quot;
		 		do {
		 			quot = (ar.get(li)+1)/10;
		 			ar.set(li, (ar.get(li)+1)%10);
		 			li--;
		 		}while(quot!=0);
		 		//Print the element
		 		Iterator<Integer> it = ar.iterator();
		 		String s="";
		 		while(it.hasNext()) {
		 			s += it.next();
		 		}
		 		System.out.println(s);
		 	}

		}
	}

}
