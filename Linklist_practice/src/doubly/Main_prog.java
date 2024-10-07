package doubly;

import java.util.Scanner;

public class Main_prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
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
		list.reverse();
		
//		list.bago1(new Node(9));
		list.bago2(new Node(7), 0);
		list.display();
	}

}
