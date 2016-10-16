package it_park.HomeRepository;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListMain {
public static void main(String[] args) {
	
	// Этот класс сделан чтобы произвести черри-пик в смартгиде.
		
		Random random = new Random();
		
		 ArrayList<Integer> list = new ArrayList<Integer>();
		
		// Создаём рандомную ёмкость массива (от 1 до 10) и заполняем его случайными 
		// целыми числами от 1 до 1000
		int sizeArray = random.nextInt((10) + 1);
		for(int i = 0; i < sizeArray; i++){
			list.add(random.nextInt(1000) + 1);
		}
		
		// Используем сортировку Collections.sort()
		System.out.println("***************Сортировка Collections.sort()****************");
		long begin2 = System.currentTimeMillis();
		Collections.sort(list);
		long end2 = System.currentTimeMillis();
		System.out.println("Время выполнения: " + (end2 - begin2));
		
		System.out.println("Массив на экран!");
		for(int x : list){
			System.out.println(x);
		}
	}

}
