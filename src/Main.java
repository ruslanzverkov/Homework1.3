public class Main {
    public static void main(String[] args) {
//       Первое задание
        byte clientOS=0;
        if(clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } if (clientOS==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
//        Второе задание
        short clientDeviceYear=2015;
        boolean clientIOS=true;
        boolean clientAndroid=true;
        if (clientDeviceYear>=2015&&clientIOS||clientAndroid&&clientDeviceYear>=2015){
            System.out.println("Установите приложение для ОС по ссылке");
        }else if (clientDeviceYear<2015&&clientIOS){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientDeviceYear<2015&&clientAndroid){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
//       Третье задание
        int year=2022;
        if ((year%4==0)&&(year%100!=0)||(year%400==0)){
            System.out.println(year+"год является високосным");
        }else{
            System.out.println(year+"год не является високосным");
        }
//        Четвертая задача
        short deliveryDistance=95;
        if (deliveryDistance<=20){
            System.out.println("Потребуеться дней"+1);
        }else if (deliveryDistance>20&&deliveryDistance<=60){
            System.out.println("Потребуеться дней"+2);
        }else if (deliveryDistance>60&&deliveryDistance<=100){
            System.out.println("Потребуеться дней"+3);
        }
//        Пятая задача
        byte monthNumber = 13;
        switch (monthNumber){
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
            default:
                System.out.println("Такого месяца несуществует");
        }


    }
}