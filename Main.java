import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	ArrayList<Cat> cats = new ArrayList<Cat>();
	ArrayList<Dog> dogs = new ArrayList<Dog>();
		
	void addNewPet() {
		String type, name;
		do {
			System.out.println("Masukkan tipe(Cat|Dog)");
			type = scan.nextLine();
		}while(!type.equals("Cat") && !type.equals("Dog"));
		System.out.println("Masukkin nama");
		name = scan.nextLine();
		if (type.equals("Cat")) {
			cats.add(new Cat(name, type, rand.nextInt(21) + 30, rand.nextInt(21) + 30, rand.nextInt(21) + 30));
		}
		else {
			dogs.add(new Dog(name, type, rand.nextInt(21) + 30, rand.nextInt(21) + 30, rand.nextInt(21) + 30 ));
		}
		
	}
	
	void showAllPets() {
		if(cats.isEmpty() && dogs.isEmpty()) {
			System.out.println("Kosong!");
			return;
		}
		for(int i = 0;i<cats.size();i++) {
			System.out.println(cats.get(i).getNama()+ " " + cats.get(i).getType() + " " + cats.get(i).getHunger() + " " + cats.get(i).getHappy()+ " " + cats.get(i).getTrain());
		}
		for(int i = 0;i<dogs.size();i++) {
			System.out.println(dogs.get(i).getNama() + " " + dogs.get(i).getType() + " " + dogs.get(i).getHunger() + " " + dogs.get(i).getHappy()+ " " + cats.get(i).getTrain());
		}
		
	}
	
	void trainPets() {
		String type, name;
		do {
			System.out.println("Masukkan tipe");
			type = scan.nextLine();
		}while(!type.equals("Cat") && !type.equals("Dog"));
		System.out.println("Masukkin nama");
		name = scan.nextLine();
		if(type.equals("Cat")) {
			for(int i = 0; i <cats.size(); i++) {
				if(name.equals(cats.get(i).getNama())) {
					int angka = rand.nextInt(4)+ 2;
					cats.get(i).addHunger(-angka);
					cats.get(i).addHappy(-angka);
					cats.get(i).addTrain(angka);
				}
			}
		}
	}
	
	
	void feedPets() {
		String type, name;
		do {
			System.out.println("Masukkan tipe");
			type = scan.nextLine();
		}while(!type.equals("Cat") && !type.equals("Dog"));
		System.out.println("Masukkin nama");
		name = scan.nextLine();
		if(type.equals("Cat")) {
			for(int i = 0; i <cats.size(); i++) {
				if(name.equals(cats.get(i).getNama())) {
					int angka = rand.nextInt(4)+ 2;
					cats.get(i).addHunger(angka);
					cats.get(i).addHappy(-angka);
					cats.get(i).addTrain(-angka);
				}
			}
		}
	}
	
	void cleanPets() {
		String type, name;
		do {
			System.out.println("Masukkan tipe");
			type = scan.nextLine();
		}while(!type.equals("Cat") && !type.equals("Dog"));
		System.out.println("Masukkin nama");
		name = scan.nextLine();
		if(type.equals("Cat")) {
			for(int i = 0; i <cats.size(); i++) {
				if(name.equals(cats.get(i).getNama())) {
					int angka = rand.nextInt(4)+ 2;
					cats.get(i).addHunger(-angka);
					cats.get(i).addHappy(angka);
					cats.get(i).addTrain(-angka);
				}
			}
		}
	}
	
	
	public Main() {
		int choice = 0;
		do {
			System.out.println("1.Add new pet!");
			System.out.println("2.Show all pets!");
			System.out.println("3.Train pets!");
			System.out.println("4.Feed pets!");
			System.out.println("5.Clean pets!");
			System.out.println("6.Exit!");
			
			choice = scan.nextInt(); scan.nextLine();
			switch(choice) {
			case 1:
				addNewPet();
				break;
			case 2:
				showAllPets();
				break;
			case 3:
				trainPets();
				break;
			case 4:
				feedPets();
				break;
			case 5:
				cleanPets();
				break;
			}
		} while (choice != 6);
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
