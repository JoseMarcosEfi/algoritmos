package algoritmos.sort;

import java.util.ArrayList;

public class SelectionSort {

	public ArrayList<Integer> selectionSort(ArrayList<Integer> selection) {

//		int a = 0, b = 0;
//		for (int i = 0; i < selection.size(); i++) {
//			for (int j = 0; j < selection.size(); j++) {
//				if (selection.get(i) <= selection.get(j)) {
//					a = selection.get(j);
//					b = selection.get(i);
//					selection.set(i, a);
//					selection.set(j, b);
//				}
//
//			}
//		}
		
		boolean sair = false;
		int count=0, aux=0;
		while(sair==false) {
		aux=selection.get(0);
		for(int i = count;i<selection.size()-1;i++) {
			if (aux <= selection.get(i)) {
				aux=selection.get(i);
			}else {
				aux=selection.get(i);
			}			
		}
		selection.set(count, aux);
		count++;
		if(count>selection.size()) {
			sair=true;
		}
		}

	return selection;
	}
}
