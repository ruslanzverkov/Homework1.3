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


    }
}