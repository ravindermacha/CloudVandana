package javaa;
import java.util.ArrayList;
import java.util.Collections;
public class ShuffleArray 
{
	public static void main(String[] args) {
	        
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        arrayList.add(1);
	        arrayList.add(2);
	        arrayList.add(3);
	        arrayList.add(4);
	        arrayList.add(5);
	        arrayList.add(6);
	        arrayList.add(7);

	       
	        Collections.shuffle(arrayList);

	    
	        for (int num : arrayList) {
	            System.out.print(num + " ");
	        }
	    }
	}


