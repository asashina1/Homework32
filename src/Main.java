public class Main {
    public static void main(String[] args) {
        //Задание 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }

        // Задание 2
        int client0S = 1;
        int clientDeviceYear = 2015;
        if (client0S == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (client0S == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }


        // Задание 3
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является высокосным");
        } else {
            System.out.println("Год не является высокосным");
        }


        // Задание 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день для доставки");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня для доставки");
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня для доставки");
        }


        // Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }
    }
}

