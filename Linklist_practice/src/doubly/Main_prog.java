package doubly;

import java.util.Scanner;

public class Main_prog {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Linklist list = new Linklist();
		
		System.out.print("Enter Node size: ");
		int size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.print("Enter Value: ");
			int value = scanner.nextInt();
			list.add(new Node(value));
		}
//		list.deleteHead();
		list.display();
		System.out.println();
		list.average();
		System.out.println();
		list.highest();
//		list.reverse();
		
		insert(list);
		list.display();
		
		delete(list);
		list.display();
		
		System.out.println();
		list.average();
//		System.out.println();
//		list.deleteHighest();
//		list.display();
	}
	
	public static void insert(Linklist list) {
		System.out.print("Enter position: ");
		int position = scanner.nextInt();
		System.out.print("Enter new value: ");
		int newVal = scanner.nextInt();
		
		
		list.insert(new Node(newVal), position);
		
	}
	public static void delete(Linklist list) {
		System.out.print("Enter positon to delete: ");
		int position = scanner.nextInt();
		
		list.delete(position);
	}

}
