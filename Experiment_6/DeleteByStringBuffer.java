//Aim: Write a program for delete method of StringBuffer class.
//Name: Adyan Shaikh
//UIN: 231P063

package Experiment_6;
public class DeleteByStringBuffer {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Good morning");
		System.out.println("Before :- " + sb);
		sb = sb.delete(4, 20);
		System.out.println("After deleting:- " + sb);
		System.out.println("Name: Adyan Shaikh \nUIN:231P063 \nBranch:Comps A");
	}
}