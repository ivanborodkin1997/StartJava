class ConditionalStatement {
	public static void main(String[] args) {
		int age = 21;
		if(age > 20) {
			System.out.println("Я молодец!");
		}

		String gender = "man";
		if(gender == "man") {
			System.out.println("Я мужчина!");
		}

		if(gender != "man") {
			System.out.println("Вот так вот!");
		}

		double higth = 1.81;
		if(higth < 1.80) {
			System.out.println("Вот так Вау!");
		} else {
			System.out.println("Вот так могу!");
		}
		
		char firstNameLetter = 'I';
		if( firstNameLetter == 'M') {
			System.out.println("Плохое имя!");
		} else if(firstNameLetter == 'I') {
			System.out.println("Хорошее имя!");
		} else {
			System.out.println("У меня уже есть хорошее имя!");
		}
	}
}