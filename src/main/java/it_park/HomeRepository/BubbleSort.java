package it_park.HomeRepository;

public class BubbleSort {
	
	int[] sortedArray;
	
	public BubbleSort(int[] array){
		this.sortedArray = array;

		toSort();
				
		// Для вывода отсортированного массива на консоль - раскомментировать :)
//		for(int x : sortedArray){
//			System.out.println(x);
//		}
	}
	// Реализация сортировки методом пузырька
	private int[] toSort(){
		for(int i = sortedArray.length - 1; i > 1; i--){
			boolean sort = true;
			for(int j = 0; j < i; j++){
				int temp;
				if(sortedArray[j] > sortedArray[j + 1]){
					temp = sortedArray[j + 1];
					sortedArray[j + 1] = sortedArray[j];
					sortedArray[j] = temp;
					sort = false;
				}
			}
			if(sort){
				break;
			}
		}
		return sortedArray; 
	}
}
