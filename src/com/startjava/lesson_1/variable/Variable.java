package com.startjava.lesson_1.variable;

public class Variable {
	public static void main(String[] args) {
		byte cores = 2; //ядра
		short frequencyCpu = 2700; //  частота МГЦ
		int memorySize = 8; // оперативная память
		long discharge = 64; //разрядная ос
		float swapSize = 526e-3F; //Размер файла подкачки
		double physMemorySize =  5.18; //доступно физической памяти
		char firstNameLatter = 'D'; // прост
		boolean answerMyQuestion = true; //тож прост)

		System.out.println("Количество ядер - " + cores + " МГц");
		System.out.println("Частота процессора - " + frequencyCpu);
		System.out.println("Оперативная память - " + memorySize + " Гб");
		System.out.println(discharge + " - разрядная ОС");
		System.out.println("Размер файла подкачки - " + swapSize + " Гб");
		System.out.println("Доступно физической памяти - " + physMemorySize + " Гб");
		System.out.println("Просто char - " + firstNameLatter);
		System.out.println("Просто boolean - " + answerMyQuestion);
	}
}