// Aim: Write a program that accepts a shopping list of items and perform the following operations: Add
// 		an item at specified location, delete an item in the list, and print the content of vector.
// Name: Adyan Shaikh
// UIN: 231P063

package Experiment_6;
import java.util.*;
public class ShoppingList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String obj;

		Vector<String> list = new Vector<String>();
		list.addElement("milk");
		list.addElement("egg");
		list.addElement("butter");
		list.addElement("curd");
		list.addElement("Cake");
		System.out.print("Enter item: ");
		obj = sc.nextLine();
		System.out.println();
		list.insertElementAt(obj, 1);
		System.out.println("The list :-" + list);
		list.remove(4);
		System.out.println("The list after removing item:-" + list);
		System.out.println("Name: Adyan Shaikh \nUIN:231P063 \nBranch:Comps A");
	}
}
