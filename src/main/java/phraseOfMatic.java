public class phraseOfMatic {

    public static void main (String [] args) {

        //Создаем три набора слов для выбора
        String[] wordListOne = {"круглосуточный", "трёх-звенный", "взаимный",
                "обоюдный выигрыш", "фронтэнд", "на основе веб-ткхнологий", "метод критического пути", "динамичный"};
        String[] wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "кластезированный", "фирменный",
        "позиционированный", "фирменный", "сетевой", "сфокусированный"};
        String[] wordListThree = {"процесс", "пункт разгрузки", "талант", "подход", "образец", "пункт следования"};

        //Вычисляем, сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //Генерируем три случайных числа
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //Строим фразу
        String phrase = wordListOne [rand1] + " " + wordListTwo [rand2] + " " +  wordListThree [rand3];

        //Выводим фразу на экран
        System.out.println("Все, что нам нужно, - это " + phrase);

    }
}
