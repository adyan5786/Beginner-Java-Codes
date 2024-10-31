// Aim: Write a program to implement a Vector that accepts five items from the command line and store them
//        in a Vector and display the objects stored in a Vector.
// Name: Adyan Shaikh
// UIN: 231P063

package Experiment_6;
import java.util.*;
public class VectorImplementation {

	public static void main(String[] args) {
		Vector list = new Vector();
		int len = args.length;
		
		for(int i = 0; i < len; i++)
			list.addElement(args[i]);
		
		int size = list.size();
		String str[] = new String[size];
		list.copyInto(str);
		for(int i = 0; i < size; i++)
			System.out.println("Element of Vector at position " + i + " is " + str[i]);
		System.out.println("Name: Adyan Shaikh \nUIN:231P063 \nBranch:Comps A");
	}

}