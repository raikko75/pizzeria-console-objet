package fr.pizzeria.console;
import fr.pizza.dao.PizzaArrayDao;
import fr.pizza.services.*;
import java.util.Scanner;

import fr.pizzeria.excetpion.StockageException;
import fr.pizzeria.excetpion.UpdatePizzaException;
import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) throws StockageException {
		// TODO Auto-generated method stub
		boolean demarrage = true;
		int choixUser;
		 Scanner choix = new Scanner(System.in);
		 PizzaArrayDao pizza = new PizzaArrayDao();
		 MenuServiceFactory c = new MenuServiceFactory();
		pizza.arrayPizzaDao();

		// alimenter un tableau s
		/*
		tableauPizza [0]=  new Pizza(0, "pep","peperoni",12.50);
		tableauPizza [1] = new Pizza(1, "mar","margueria",14.00);
		tableauPizza [2] = new Pizza(2, "rein","la reine",11.50);
		tableauPizza [3] = new Pizza(3, "fro","les 4 fromages",12.00);
		tableauPizza [4] = new Pizza(4, "can","la cannibale",12.50);
		tableauPizza [5] = new Pizza(5, "sav","savoyarde",13.00);
		tableauPizza [6] = new Pizza(6, "ori","oriantale",13.50);
		tableauPizza [7] = new Pizza(7, "ind","indienne",14.00);
*/
		while (demarrage = true)
		{
			System.out.println("**************Pizzeria Administration***************");
			System.out.println("choix 1 lister les pizzas ");
			System.out.println("choix 2 Ajouter une nouvelle pizza");
			System.out.println("choix 3 Mettre à jour une pizza ");
			System.out.println("choix 4 supprimer une pizza");
			System.out.println("choix 99 sortir");

			try {
				choixUser = choix.nextInt();
				MenuService nn = c.getChoixMenu(choixUser);
				nn.executeUC(pizza, choix);
				
			} catch (StockageException e) {
				System.out.println("code inexistant");
			}
				/*
				if(codePizzatemp.isEmpty() )
				{
					throw new UpdatePizzaException("le champ est vide");
				}			
				if(arrayPizza.get(i).getCode().equals(codePizzatemp))
				{
					throw new UpdatePizzaException("le champ est vide");
				}
				
				}
				*/
			

			//*****************************************************************************************************
			//*****************************************************************************************************
			//*****************************************************************************************************

			//*****************************************************************************************************



		}
	}
}


/*
	public static void showPizza()
	{
		for (Pizza temp : tableauPizza)
		{
			System.out.println(temp.code + " > " + temp.libelle + " > " + temp.prix);
		}
	}
*/
	/*
	public static void editPizza()
	{
		showPizza();
		choix.nextLine();
		System.out.println("veuillez saisir le code ");
		String codePizzatemp = choix.nextLine();
		System.out.println("veuillez saisir le nouveau code ");
		String newCode = choix.nextLine();
		System.out.println("veuillez saisir le nouveau nom(sans espace ");
		String newname = choix.nextLine();
		System.out.println("veuillez saisir le nouveau prix");
		double choixPriceUsers = Double.parseDouble(choix.nextLine());
		boolean findCodePizza = false;

		for (int i=0;i<tableauPizza.length;i++)
		{
			if(tableauPizza[i].code.equals(codePizzatemp))
			{
				tableauPizza[i] = new Pizza( newCode, newname, choixPriceUsers);

			}
		}

	}
*/
	/******************************************************************/
	/******************************************************************/



	/**********************************************************************/
	/**********************************************************************/
	/**********************************************************************/
/*
	public static void removePizza()
	{
		choix.nextLine();
		System.out.println("le code pizza : ");
		String newCodePizza = choix.nextLine();
		Pizza newMenu [] = new Pizza[tableauPizza.length-1];
		int temp =0;
		for(int i=0;i<tableauPizza.length;i++)
		{
			if(!tableauPizza[i].code.equals(newCodePizza))
			{	

				newMenu[temp] = tableauPizza[i];
				temp++;

			}
			else {
				System.out.println("code inexistant");
			}
		}
		tableauPizza = newMenu ;
*/
	





