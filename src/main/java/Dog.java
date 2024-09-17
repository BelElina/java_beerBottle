class Dog {

    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("Гав! Гав!");
    }
}

class DogTestDrive {
    public static void main(String[] args) {
        // Создаем объект класса Dog
        Dog d = new Dog();
        // Используем оператор доступа (точка), устанавливаем значение поля size
        d.size = 40;
        //Вызываем метод bark
        d.bark();
    }
}
