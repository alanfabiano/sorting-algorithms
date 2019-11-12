package trabalhoGrauB1;

import java.util.LinkedList;

public class InsertionSort {

	public String name = "Insertion Sort";
	
	public String description = "O Insertion Sort começa a trabalhar com o segundo valor do vetor e vai jogando ele para a esquerda (início do vetor). Ele percorre todo o vetor um única vez, porém para fazer o movimento descrito (jogar para o início) ele utiliza-se de outro laço interno.";
	
	
	public void ordenarDados(LinkedList<Integer> list)
	{
		int n = list.size(); 
        for (int i = 1; i < n; ++i) { 
            int key = list.get(i); 
            int j = i - 1; 
 
            while (j >= 0 && list.get(j) > key) { 
                list.set((j + 1), list.get(j));
                j = j - 1; 
            }
            list.set((j + 1), key);
        } 
	}
}
