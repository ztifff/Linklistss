package cll;

import java.util.Scanner;



public class Main_CLL {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cll listCll = new Cll();
		
		System.out.print("Enter a size of a Node: ");
		int size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.print("Enter a Node: ");
			int value = scanner.nextInt();
			listCll.add(new Node(value));
		}
		listCll.display();
		System.out.println("____________________________________________________________");
		
		insert(listCll);
		listCll.display();
		
		delete(listCll);
		listCll.display();

	}
	
	public static void insert(Cll listCll) {
		System.out.println("Enter a position: ");
		int position = scanner.nextInt();
		
		System.out.println("Enter a new value: ");
		int newValue = scanner.nextInt();
		
		listCll.insert(new Node(newValue), position);
		
	}
	public static void delete(Cll listCll) {
		System.out.println("Enter a position: ");
		int position = scanner.nextInt();
		
		listCll.delete(position);
	}

}
