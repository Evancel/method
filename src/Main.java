import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //a lesson
        task0();
        System.out.println();

        //task1
        System.out.println("Task1");
        isLeapYear(2003);
        isLeapYear(2000);
        isLeapYear(2100);
        isLeapYear(2020);

        //task2
        System.out.println("Task2");
        defineDownloadVersion(0,2005);
        defineDownloadVersion(0,2023);
        defineDownloadVersion(1,2020);
        defineDownloadVersion(1,2023);
        defineDownloadVersion(2,2023);

        //task3
        System.out.println("Task3");
        int daysToDelivery = countDaysToDelivery(60);
        System.out.println("При дистанции 60 км кол-во дней доставки = "+daysToDelivery );

        daysToDelivery = countDaysToDelivery(10);
        System.out.println("При дистанции 10 км кол-во дней доставки = "+daysToDelivery );

        daysToDelivery = countDaysToDelivery(40);
        System.out.println("При дистанции 40 км кол-во дней доставки = "+daysToDelivery );

        daysToDelivery = countDaysToDelivery(99);
        System.out.println("При дистанции 99 км кол-во дней доставки = "+daysToDelivery );

        daysToDelivery = countDaysToDelivery(101);
        System.out.println("При дистанции 101 км кол-во дней доставки = "+daysToDelivery );
    }
    public static void task0(){
        int [] issuesByMonth = {4,6,7,9,2,5,12,3,7,10,6,7,1,8};
        printSeparator();
        for (int i = 0; i < issuesByMonth.length; i++) {
            printIssues(issuesByMonth[i]);
            if ((i+1)%3==0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonth);
        printIssues(total);
    }

    public static void printSeparator(){
        System.out.println("++++++++++");
        System.out.println("----------");
    }

    public static void printIssues(int issueCount){
        System.out.println(issueCount);
    }

    public static int sum(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        return sum;
    }

    //Task1
    public static void isLeapYear(int year){
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year + " год — високосный год");
        } else{
            System.out.println(year + " год — невисокосный год");
        }
    }

    //Task2
    public static void defineDownloadVersion(int typeOS, int year){
        int currentYear = LocalDate.now().getYear();
        if(typeOS==0){
            if(year<currentYear){
                System.out.println("Установите облегченную версию iOS.");
            } else {
                System.out.println("Установите стандартную версию iOS.");
            }
        } else if (typeOS==1){
            if(year<currentYear){
                System.out.println("Установите облегченную версию Android.");
            } else {
                System.out.println("Установите стандартную версию Android.");
            }
        } else {
            System.out.println("Версия устройства не определена.");
        }
    }

    //Task3
    public static int countDaysToDelivery(int distance){
        int countDays=0;
        if(distance>0 && distance<20){
            countDays=1;
        } else if (distance>=20 && distance<60){
            countDays=2;
        } else if (distance>=60 && distance<100){
            countDays=3;
        } else if (distance>=100){
            countDays=-1;
        }
        return countDays;
    }
}