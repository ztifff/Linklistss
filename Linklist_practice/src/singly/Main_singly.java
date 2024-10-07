package singly;

import java.util.Scanner;

public class Main_singly {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		Linklists list = new Linklists();
		
		System.out.print("Enter the size of the node: ");
		int size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.print("Enter a Node: ");
			int value = scanner.nextInt();
			list.add(new Node(value));
		}
		list.display();
		
		insert(list);
		list.display();
		
		delete(list);
		list.display();
		
		
	}
	
	public static void insert(Linklists list) {
		System.out.println("Enter a position: ");
		int position = scanner.nextInt();
		
		System.out.println("Enter a new value: ");
		int newValue = scanner.nextInt();
		
		list.insert(new Node(newValue), position);
		
	}
	public static void delete(Linklists list) {
		System.out.println("Enter a position: ");
		int position = scanner.nextInt();
		
		list.delete(position);
	}

}
