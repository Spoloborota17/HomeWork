package it_park.HomeRepository;

public class CombSort {
	
	int[] arraySorted;
	static final double DECREASEFACTOR = 1.247;
	
	public CombSort(int[] array){
		this.arraySorted = array;
		
		toSort();
		
		// Для вывода отсортированного массива на консоль - раскомментировать :)
//		for(int x : arraySorted){
//			System.out.println(x);
//		}
	}
	
	// Реализация сортировки методом расчёстки
	public int[] toSort(){
		int step = arraySorted.length - 1;
		
		while(!(step == 0)){
			for(int i = 0; (step + i) < arraySorted.length; i++){
				if(arraySorted[i] > arraySorted[step + i]){
					int temp = arraySorted[step + i];
					arraySorted[step + i] = arraySorted[i];
					arraySorted[i] = temp;
				}
			}
			step /= DECREASEFACTOR;
		}
		return arraySorted;
	}

}