package desenvolvimentoPessoal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfContacts {
	
	public static void main(String[] args) {
		
		List<String> listName = new ArrayList<>();
		List<String> listNumber = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
				
				System.out.println("Nome: ");
				listName.add(input.nextLine());
		
		System.out.println("Número: ");
		listNumber.add(input.nextLine());
		
		System.out.println(listName + ": " + listNumber);
		
		input.close();
	}
}
