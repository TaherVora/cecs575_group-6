/* 
Java implementation of Iterator Pattern to fetch the list of available
sub categories in a particular category
*/
package Assignment;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char choice = 'y';
		while(choice == 'y' || choice == 'Y') {
			System.out.println("Enter 1: For products in Furniture Category");
			System.out.println("Enter 2: For products in Electronics Category");
			System.out.println("Enter 3: For products in Pet Supplies Category");
			System.out.println("Enter 4: For products in Sports Category");
			int cat = sc.nextInt();
			if(cat == 1) {
				FurnitureSubCat productsRepository = new FurnitureSubCat();
				System.out.println("Sub-category list for Furniture Category:");
				for(Iterator iter = productsRepository.getIterator(); iter.hasNext();){
				String product = (String)iter.next();
				System.out.println(product);
				}
			}
			else if(cat == 2) {
				ElectronicsSubCat productsRepository = new ElectronicsSubCat();
				System.out.println("Sub-category list for Electronics Category:");
				for(Iterator iter = productsRepository.getIterator(); iter.hasNext();){
				String product = (String)iter.next();
				System.out.println(product);
				}
			}
			else if(cat == 3) {
				PetSupplySubCat productsRepository = new PetSupplySubCat();
				System.out.println("Sub-category list for Electronics Category:");
				for(Iterator iter = productsRepository.getIterator(); iter.hasNext();){
				String product = (String)iter.next();
				System.out.println(product);
				}
			}
			else if(cat == 4) {
				SportsSubCat productsRepository = new SportsSubCat();
				System.out.println("Sub-category list for Electronics Category:");
				for(Iterator iter = productsRepository.getIterator(); iter.hasNext();){
				String product = (String)iter.next();
				System.out.println(product);
				}
			}
			else
			System.out.println("You have entered wrong category number");
			System.out.println("Do you want to enter more? (y/n)");
			choice = sc.next().charAt(0);
			System.out.println();
		}
		sc.close();
	}

	
}
