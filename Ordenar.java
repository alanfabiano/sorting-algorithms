package trabalhoGrauB1;

import java.util.LinkedList;
import java.util.Scanner;

public class Ordenar {

	private static Scanner input;
	
	
	public Ordenar () {
		input = new Scanner(System.in);
	}
	
	public static boolean confirm(String name, String description)
	{	
		int option;
		boolean confirm = false;
		
		System.out.println("\n" + name);
		System.out.println(description);

		do {
			System.out.println("\n1: Confirmar | 2: Cancelar");
			System.out.print("O que deseja fazer: ");
			option = input.nextInt();
			
			if (option == 1) {
				confirm = true;
			
			} else if (option == 2) {
				confirm = false;
			} else {
				System.out.println("Opção inválida.\n");
			}
		
		} while(option != 1 && option != 2);
		
		return confirm;
	}
	
	
	public void quickSort(LinkedList<Integer> list) {
	
		QuickSort quickSort = new QuickSort();
		boolean confirm = confirm(quickSort.name, quickSort.description);
		
		if (confirm) {
			quickSort.ordenarDados(list, 0, list.size() - 1);
			System.out.println("Ordenado com Quick Sort.");
		}
	}

	
	public void bubbleSort(LinkedList<Integer> list)
	{	
		BubbleSort bubbleSort = new BubbleSort();
		boolean confirm = confirm(bubbleSort.name, bubbleSort.description);
		
		if (confirm) {
			bubbleSort.ordenarDados(list);
			System.out.println("Ordenado com Bubble Sort.");
		}
	}
	
	
	public void mergeSort(LinkedList<Integer> list)
	{	
		MergeSort mergeSort = new MergeSort();
		boolean confirm = confirm(mergeSort.name, mergeSort.description);
		
		if (confirm) {
	        mergeSort.ordenarDados(list, 0, (list.size() - 1));
	        System.out.println("Ordenado com Merge Sort.");
		}
	}
	
	
	public void selectionSort(LinkedList<Integer> list)
	{
		SelectionSort selectionSort = new SelectionSort();
		boolean confirm = confirm(selectionSort.name, selectionSort.description);
		
		if (confirm) {
			selectionSort.ordenarDados(list);
			System.out.println("Ordenado com Selection Sort.");
		}
		
	}
	
	
	public void insertionSort(LinkedList<Integer> list)
	{
		InsertionSort insertionSort = new InsertionSort();
		boolean confirm = confirm(insertionSort.name, insertionSort.description);
		
		if (confirm) {
			insertionSort.ordenarDados(list);
			System.out.println("Ordenado com Insertion Sort.");
		}
		
	}

}
