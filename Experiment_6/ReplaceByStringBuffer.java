//Aim: Write a program for replace method of StringBuffer class.
//Name: Adyan Shaikh
//UIN: 231P063

package Experiment_6;
public class ReplaceByStringBuffer {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("good morning");
		System.out.println("Original String: " + sb);
		System.out.println("After Replacing: " + sb.replace(5, 15, "evening"));
		System.out.println("Name: Adyan Shaikh \nUIN:231P063 \nBranch:Comps A");
	}
}