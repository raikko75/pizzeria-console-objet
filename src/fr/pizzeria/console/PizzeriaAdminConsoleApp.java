package fr.pizzeria.console;

import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean demarrage = true;
		int choixUser;

		while (demarrage = true)
		{
			System.out.println("**************Pizzeria Administration***************");
			System.out.println("choix 1 lister les pizzas ");
			System.out.println("choix 2 Ajouter une nouvelle pizza");
			System.out.println("choix 3 Mettre à jour une pizza ");
			System.out.println("choix 4 supprimer une pizza");
			System.out.println("choix 99 sortir");
			
			Scanner choix = new Scanner(System.in);
			choixUser = choix.nextInt();
			
			if (choixUser == 1)
			{
				System.out.println("***liste des pizzas****");
			}
				else if(choixUser == 2)
				{
					System.out.println("***ajout d'une nouvelle pizza *** ");
				}
				else if (choixUser == 3)
				{
					System.out.println("***Mis a jour de la pizza***");
				}
				else if(choixUser == 4)
				{
					System.out.println("***suppresion de la pizza selectionne***");
					
				}
				else if (choixUser == 99) {
					System.out.println(" bye bye :( :( ");
				}
		}
	}

}
