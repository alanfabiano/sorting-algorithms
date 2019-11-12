package trabalhoGrauB1;

import java.util.LinkedList;

public class MergeSort {

	public String name = "Merge Sort";
	
	public String description = "A idéia básica do Merge Sort é criar uma sequência ordenada a partir de duas outras também ordenadas. Para isso, o algoritmo Merge Sort divide a sequência original em pares de dados, agrupa estes pares na ordem desejada; depois as agrupa as sequências de pares já ordenados, formando uma nova sequência ordenada de quatro elementos, e assim por diante, até ter toda a sequência ordenada.";
	
	
    public void ordenarDados(LinkedList<Integer> list, int l, int r) {
    	if (l < r) { 
            int m = (l+r)/2; 
   
            ordenarDados(list, l, m); 
            ordenarDados(list, m + 1, r); 
   
            merge(list, l, m, r); 
        } 
    }
    
    
    public void merge(LinkedList<Integer> list, int l, int m, int r) {
          
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        for (int i=0; i<n1; ++i) 
            L[i] = list.get(l + i); 
        for (int j=0; j<n2; ++j) 
            R[j] = list.get(m + 1 + j);
   
        int i = 0, j = 0; 
  
        int k = l; 
        
        while (i < n1 && j < n2) { 
            if (L[i] <= R[j]) {
            	list.set(k,  L[i]);
                i++; 
            } else { 
                list.set(k, R[j]);
                j++; 
            } 
            k++; 
        } 
  
        while (i < n1) {
        	list.set(k, L[i]);
            i++; 
            k++; 
        } 
 
        while (j < n2) {
        	list.set(k, R[j]);
            j++; 
            k++; 
        } 
    }
}
