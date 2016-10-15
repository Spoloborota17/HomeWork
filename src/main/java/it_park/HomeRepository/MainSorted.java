package it_park.HomeRepository;

import java.util.Random;

public class MainSorted {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		// Создаём массив со случайным размером в диапазоне от 1 до 10000
		int[] array = new int[random.nextInt((10000) + 1)];
		
		// Заполняем массив случайными целыми числами в диапазоне от 1 до размер массива*5
		for(int i = 0; i < array.length; i++){
			array[i] = random.nextInt(array.length * 5);
		}
		
		System.out.println("***************Сортировка №1 (пузырьком)****************");
		long begin = System.currentTimeMillis();
		new SortedOne(array);
		long end = System.currentTimeMillis();
		System.out.println("Время выполнения: " + (end - begin));
		
		System.out.println("***************Сортировка №2 (расчёской)****************");
		long begin2 = System.currentTimeMillis();
		new SortedTwo(array);
		long end2 = System.currentTimeMillis();
		System.out.println("Время выполнения: " + (end2 - begin2));
	}
}