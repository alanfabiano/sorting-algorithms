package trabalhoGrauB1;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class OrderTest {
	
	private static Scanner input;
	
	private static LinkedList<Integer> list;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		list = new LinkedList<>();
		int opcao;
		boolean sair = false;
		
		do {
			System.out.print("1: Inserir | 2: Listar | 3: Remover | 4: Ordenar | 9: Sair");
			System.out.print("\nInforme uma opção acima: ");
			opcao = input.nextInt();
			System.out.println("");
			
			switch (opcao) {
			case 1:
				insertElements();
				break;
			case 2:
				showElements();
				break;
			case 3:
				removeElement();
				break;
			case 4:
				orderElements();
				break;
			case 9:
				sair = true;
				break;
			default:
				System.out.print("Opção inválida!");
				break;
			}
			System.out.println("\n");
		} while (!sair);
		
		System.out.print("Programa encerrado.");		
		
	}

	
	public static void randomList(LinkedList<Integer> list)
	{	
		Random random = new Random();
		System.out.print("Quantos Números deseja gerar: ");
		int num = input.nextInt();
		
		for (int i = 0; i < num; i++) {
			list.add(random.nextInt(1500));
		}
		System.out.print(num + " gerados com sucesso.");
	}
	
	
	public static void insertElements() {
		
		int opcao;
		do {
			System.out.print("1: Randomico | 2: Informar | 3: Voltar");
			System.out.print("\nInforme uma opção acima: ");
			opcao = input.nextInt();
			
			if (opcao < 1 || opcao > 3) {
				System.out.println("\nOpção inválida!\n");
			}
		} while (opcao < 1 || opcao > 3);
		
		
		if (opcao == 1) {
			randomList(list);
		}
		
		if (opcao == 2) {
			customList(list);
		}
	}
	
	
	public static void customList(LinkedList<Integer> list) {
		
		System.out.print("Quantos Números deseja informar: ");
		int num = input.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.print((i + 1) + ": ");
			list.add(input.nextInt());
		}
	}
	
	
	public static void showElements() {
	
		if (list.isEmpty()) {
			System.out.println("A Lista está vazia.");
		} else {
			for(int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + ", ");
			}
		}
	}
	
	
	public static void removeElement()
	{
		int index;
		boolean getOut = false;
		
		if (list.isEmpty()) {
			System.out.println("A Lista está vazia.");
			return;
		}

		do {
			for(int i = 0; i < list.size(); i++) {
				 System.out.print(i + ":" + list.get(i) + ", ");
			}
			System.out.print("\nInforme o índice que deseja remover. (índice:valor): ");
			index = input.nextInt();
			
			try {
				int removed = list.remove(index);
				System.out.print("Item " + removed + " foi removido da lista com sucesso.");
				getOut = true;
				
			} catch(IndexOutOfBoundsException exception) {
				System.out.println("Índice inválido.");
			}
		} while(getOut != true);
		
	}
	
	
	public static void orderElements() {
		
		int option;
		Ordenar ordenar = new Ordenar();
		
		do {
			System.out.println("1: Quick Sort | 2: Bubble Sort. | 3: Merge Sort | 4: Selection Sort | 5: Insertion Sort | 6: Voltar");
			System.out.print("Selecione um algoritmo para ordenação: ");
			option = input.nextInt();
			
			switch (option) {
				case 1:
					ordenar.quickSort(list);
					break;
				case 2:
					ordenar.bubbleSort(list);
					break;
				case 3:
					ordenar.mergeSort(list);
					break;
				case 4: 
					 ordenar.selectionSort(list);
					break;
				case 5:
					 ordenar.insertionSort(list);
					break;
				default:
					System.out.println("Opção inválida!\n");
			}
		} while(option < 1 || option > 6);
	}
}
