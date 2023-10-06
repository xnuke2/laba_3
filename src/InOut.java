import java.util.Scanner;

public class InOut {
    static Scanner in = new Scanner(System.in);
    void get_information(){

    }
    static String getLineFromUser(String WhatToNeed){
        System.out.println("Введите "+ WhatToNeed);
        String name="";
        while(name.isEmpty()){
            if(in.hasNextLine()){
                name = in.nextLine();
            }else{
                System.out.println("Ввод некорректен");
                in.next();
            }
        }
        return name;
    }
    static int GetIntFromUser(String WhatToNeed, int max, int min){
        if (max<min)return 0;
        System.out.println("Введите "+ WhatToNeed);
        int num=0;
        while(num<=0){
            if(in.hasNextInt()){
                num = in.nextInt();
                if(num<=min||num>=max){
                    System.out.println("Число некорректно");
                }
            }else{
                System.out.println("Вводиться не целое число");
                in.next();
            }
        }
        return num;
    }
    static int GetIntFromUser(String WhatToNeed, int min){
        return GetIntFromUser(WhatToNeed,2147483647,min);
    }
    static int GetIntFromUser(String WhatToNeed){
        return GetIntFromUser(WhatToNeed,2147483647,-2147483647);
    }
    static void print_private_house(private_house _build){
        System.out.println("Название"+_build.Name);
        System.out.println("Высота"+_build.height);
        System.out.println("Длина"+_build.length);
        System.out.println("Ширина"+_build.width);
        System.out.println("Сарай"+_build.is_barn);
        System.out.println("Гараж"+_build.is_garage);
        System.out.println("Навес"+_build.is_shed);
        System.out.println("Летний дом"+_build.is_summerhouse);
        System.out.println("Площадь земли"+_build.land_area);
    }
}
