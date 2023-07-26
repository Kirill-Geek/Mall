import java.util.*;
import java.util.Scanner;

public class mall {
    public static Scanner iScanner = new Scanner(System.in);

    public static toy tedy = new toy(4000, "tedy", 20, 20);
    public static toy owl = new toy(4001, "owl", 25, 20);
    public static toy tiger = new toy(4002, "tiger", 15, 30);
    public static toy stich = new toy(4003, "stich", 10, 10);
    public static toy yoda = new toy(4004, "yoda", 20, 20);

    public static void main(String[] args) {
        playig();
    }

    public static String drop() { // Розыгрыш игрушек в котором 100% выпадет какая-то игрушка.
        String[] nam_toy = new String[] { "tedy", "owl", "tiger", "stich", "yoda"}; //имена соответствуют номерам игрушек.
        int[] number_toy = new int[] { 1, 5, 2, 3, 3, 4, 3, 2, 5, 1 }; //Данный массив инициализирует шанс выпадения игрушек;
        int drop_chance = (int) (Math.random() * 10); //получаем случайную цифру, используя ее как индекс получаем номер игрушки.
        ubdate_toy(number_toy[drop_chance]); //изменяем количество игрушек.
        return nam_toy[number_toy[drop_chance]];
    }

    public static int playig() {
        System.out.println("Выберите действие:\n0 - Выход\n1 - Участвовать в розыгрыше игрушек\n2 - Просмотр информации о количестве игрушек\n3 - Добавление игрушек\n4 - Получение полной информации о игрушках ");
        int x = iScanner.nextInt();
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            System.out.println("Подождите, происходит выбор игрушки");
            System.out.printf("Вам досталась игрушка : %s\n", drop());
        }
        if (x == 2) {
            info_Count_Toy();
        }
        if (x == 3) {
            add_Count_Toy();
        }
        if (x == 4) {
            getInfoToy();
        }
        return playig();
    }
    
    public static void ubdate_toy(int number_toy) { //Метод для обновления информации.
        if (number_toy == 1) {   // Вычитаем игрушку которую получил участник игры.
            tedy.counts(); 
        }
        if (number_toy == 2) {
            owl.counts(); 
        }
        if (number_toy == 3) {
            tiger.counts(); 
        }
        if (number_toy == 4) {
            stich.counts(); 
        }
        if (number_toy == 5) {
            yoda.counts();   
        }
    }

    public static void info_Count_Toy() { //Получение количества игрушек в наличии.
        System.out.printf("Осталось игрушек :\n%d - %s\n%d - %s\n%d - %s\n%d - %s\n%d - %s\n",tedy.count(), tedy.getName(),owl.count(), owl.getName(),tiger.count(), tiger.getName(),stich.count(), stich.getName(),yoda.count(), yoda.getName());
    }

    public static void add_Count_Toy() { //Добаление игрушек.
        System.out.print("Сколько игрушек Вы хотите добавить? ");
        int add_count = iScanner.nextInt();
        System.out.print(
                "Введите номер игрушки которую хотите добавить -\n1 - tedy\n2 - owl\n3 - tiger\n4 - stich\n5 - yoda\n");
        int add_size = iScanner.nextInt();
        if (add_size == 1) {
            int count = tedy.addCountToy(add_count); 
        }
        if (add_size == 2) {
            int count = owl.addCountToy(add_count); 
        }
        if (add_size == 3) {
            int count = tiger.addCountToy(add_count); 
        }
        if (add_size == 4) {
            int count = stich.addCountToy(add_count); 
        }
        if (add_size == 5) {
            int count = yoda.addCountToy(add_count);   
        }
    }

    public static void getInfoToy() {  //Получение общей информации об игрушках
        System.out.println(tedy.getInfo());
        System.out.println(owl.getInfo());
        System.out.println(tiger.getInfo());
        System.out.println(stich.getInfo());
        System.out.println(yoda.getInfo());
    }
}