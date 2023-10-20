import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
public class InOut {
    static Scanner in = new Scanner(System.in);
    static void PrintInformationAboutMenu(){
        System.out.println("1 Ввести новый элемент\n2 Найти и возможно изменить элемент\n3 Найти самый высокое здание\n4 Определить здания с высотой более 50 м");
        switch (InOut.GetIntFromUser("Введите номер варианта", 5,1)){
            case 1:
                System.out.println("1 Частный дом\n2 небоскрёб\n3 Назад");
                switch(InOut.GetIntFromUser("Введите номер варианта", 4,1)) {
                    case 1:
                        new private_house();
                        break;
                    case 2:
                        new skyscraper();
                        break;
                    case 3:
                        InOut.PrintInformationAboutMenu();
                        break;
                }
                break;
            case 2:
                System.out.println("1 Вывести список домов\n2 Найти дом по названию\n3 Назад");
                switch(InOut.GetIntFromUser("Введите номер варианта", 4,1)) {
                    case 1:
                        System.out.println("Список построек");
                        InOut.PrintAllNamesFromCollection(building.buildingCollection);
                        break;
                    case 2:
                        InOut.PrintBuilding(building.FindBuildingByName(InOut.getLineFromUser("Введите название здания")));
                        break;
                    case 3:
                        InOut.PrintInformationAboutMenu();
                        break;
                }
                break;
            case 3:
                System.out.println("не реализовано");
                break;
            case 4:
                System.out.println("не реализовано");
                break;
        }
    }
    static void PrintAllNamesFromCollection(Collection<building> Coll){
        Iterator<building> iter = Coll.iterator();
        building it = iter.next();
        while(iter.equals(iter)){
            System.out.println(it.Name);
            if(iter.hasNext()){
                it = iter.next();
            }else break;
        }
    }
    static void  PrintBuilding(building _build){
        if(_build!=null) {
            System.out.println(_build.getClass());
//        if(_build.getClass()==private_house.class){
//
//        }
//        private_house f= (private_house) _build;
        }
        System.out.println("0");
    }
    static void PrintPrivateHouse(private_house _build){
        System.out.println("Название "+_build.Name);
        System.out.println("Высота "+_build.height);
        System.out.println("Ширина "+_build.width);
        System.out.println("Длина "+_build.length);
        System.out.println("Площадь "+_build.land_area);
        if(_build.is_shed) System.out.println("Беседка/навес есть ");
        else System.out.println("Беседки/навеса нет ");
        if(_build.is_barn) System.out.println("Cарай/амбар есть ");
        else System.out.println("Cарая/амбара нет ");
        if(_build.is_garage) System.out.println("Гараж есть ");
        else System.out.println("Гаража нет ");
        if(_build.is_summerhouse) System.out.println("Является летним домом(дачей) ");
        else System.out.println("Не является летним домом(дачей) ");
    }
    static  boolean getBooleanFromUser(String WhatToNeed){
        System.out.println(WhatToNeed+" ('да' или 'нет')");
        String name="";
        while(name.isEmpty()){
            if(in.hasNextLine()){
                name = in.nextLine();
                switch (name){
                    case "да":
                        return true;
                    case "нет":
                        return false;
                }
                name="";
            }else{
                System.out.println("Ввод некорректен");
                in.next();
            }
        }
        return false;
    }
    static String getLineFromUser(String WhatToNeed){
        System.out.println(WhatToNeed);
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
        System.out.println(WhatToNeed);
        int num=0;
        while(num<=0){
            if(in.hasNextInt()){
                num = in.nextInt();
                if(num<min || num>=max){
                    System.out.println("Число некорректно");
                    in.next();
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
}
