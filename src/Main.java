public class Main {
    public static void  examinationYear(int a){
        if (a % 4 == 0 || a % 400==0){
            System.out.println(+a+" год является високосным");
        }else if (a % 100 !=0){
            System.out.println(+a + " год не является високосным");
        }
    }
    public static void examinationOS(int a, int b){
        if (a >= 2015&& a <= 2022 && b == 1 ) {
            System.out.println("Установите обычную версию приложения на ваше Android устройство!");
        } else if (a >= 2015&& a <= 2022 && b == 0) {
            System.out.println("Установите обычную версию приложения на ваше iOS устройство!");
        }
        if (a < 2015 && b == 1){
            System.out.println("Установите лайт-версию приложения для Android по ссылке");
        }else if (a < 2015 && b == 0){
            System.out.println("Установите лайт-версию приложения для iOS по ссылке");
        }
    }
    public static void examinationDeliveryDistance (int a) {
        int b ;
        if (a > 100){
            System.out.println("Дальше 100км доставка невозможна");
            return;
        }
        if (a >=0 && a <=20){
            b = 1;
            System.out.println("Потребуется дней: " +b);
        } else if (a >=20 &&a <=60) {
            b = 2;
            System.out.println("Потребуется дней: " + b);
        } else if (a >= 60 && a <=100) {
            b = 3;
            System.out.println("Потребуется дней: " +b);
        }
    }
    public static void main(String[] args) {
        //Задание 1
        int year = 2021;
        examinationYear(year);
        //Задание 2
        int clientDeviceYear = 2015;
        byte operationSystem = 0;
        examinationOS(clientDeviceYear,operationSystem);
        //Задание 3
        int deliveryDistance = 25;
        examinationDeliveryDistance(deliveryDistance);
    }
}