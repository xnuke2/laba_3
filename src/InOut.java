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
                        building tmp = building.FindBuildingByName(InOut.getLineFromUser("Введите название здания"));
                        InOut.PrintBuilding(tmp);
                        if(tmp.getClass()==private_house.class){
                            private_house tmp1=(private_house) tmp;
                            System.out.println("1 Редактировать имя\n2 Редактировать высоту\n3 Редактировать ширину\n4 Редактировать длину\n5 Редактировать плорщадь\n6 Редактировать поле гараж\n7 Редактировать поле сарай\n8 Редактировать поле навес/беседка\n9 Редактировать поле леьтний дом(дача)\n10 Выход");
                            switch(InOut.GetIntFromUser("Введите номер варианта", 11,1)) {
                                case 1:
                                    tmp1.setName();
                                    break;
                                case 2:
                                    tmp1.setHeight();
                                    break;
                                case 3:
                                    tmp1.setWidth();
                                    break;
                                case 4:
                                    tmp1.setLength();
                                    break;
                                case 5:
                                    tmp1.setLand_area();
                                    break;
                                case 6:
                                    tmp1.setIs_garage();
                                    break;
                                case 7:
                                    tmp1.setIs_barn();
                                    break;
                                case 8:
                                    tmp1.setIs_shed();
                                    break;
                                case 9:
                                    tmp1.setIs_summerhouse();
                                    break;
                                case 10:
                                    break;
                            }
                        } else if (tmp.getClass()==skyscraper.class) {
                            skyscraper tmp1=(skyscraper)tmp;
                            System.out.println("1 Редактировать имя\n2 Редактировать высоту\n3 Редактировать ширину\n4 Редактировать длину\n5 Редактировать коллиичество этажей\n6 Редактировать площадь 1 квартиры\n7 Редактировать поле парковка\n8 Редактировать поле площадка\n9 Редактировать поле забор)\n10 Выход");
                            switch(InOut.GetIntFromUser("Введите номер варианта", 11,1)) {
                                case 1:
                                    tmp1.setName();
                                    break;
                                case 2:
                                    tmp1.setHeight();
                                    break;
                                case 3:
                                    tmp1.setWidth();
                                    break;
                                case 4:
                                    tmp1.setLength();
                                    break;
                                case 5:
                                    tmp1.setNumber_of_floors();
                                    break;
                                case 6:
                                    tmp1.setThe_area_of_1_apartment();
                                    break;
                                case 7:
                                    tmp1.setIs_parking();
                                    break;
                                case 8:
                                    tmp1.setIs_children_playground();
                                    break;
                                case 9:
                                    tmp1.setIs_fence();
                                    break;
                                case 10:
                                    break;
                            }
                        }
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
                System.out.println("Здания с высотой больше 50");
                InOut.PrintBuildingsWithHeightMoreWhen50(building.buildingCollection);
                break;
        }
    }
    static void PrintBuildingsWithHeightMoreWhen50(Collection<building> Coll){
        Iterator<building> iter = Coll.iterator();
        building it = iter.next();
        boolean findOne=false;
        while(iter.equals(iter)) {
            if (it.height>50){
                System.out.println(it.Name);
                findOne =true;
            }
            if(iter.hasNext()){
                it = iter.next();
            }else break;
        }
        if (findOne!=true){
            System.out.println("Не найдено");
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
            if(_build.getClass()==private_house.class){
                InOut.PrintPrivateHouse((private_house) _build);
            } else if (_build.getClass()==skyscraper.class) {
                InOut.PrintSkyscraper((skyscraper) _build);
            }
        }
        System.out.println();
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
    static void PrintSkyscraper(skyscraper _build){
        System.out.println("Название "+_build.Name);
        System.out.println("Высота "+_build.height);
        System.out.println("Ширина "+_build.width);
        System.out.println("Длина "+_build.length);
        System.out.println("Колличество этажей "+_build.number_of_floors);
        System.out.println("Площадь 1 квартиры "+_build.the_area_of_1_apartment);
        if(_build.is_children_playground) System.out.println("Детская площадка есть ");
        else System.out.println("Детской площадки нет ");
        if(_build.is_fence) System.out.println("Забор есть ");
        else System.out.println("Забора нет ");
        if(_build.is_parking) System.out.println("Парковка есть ");
        else System.out.println("Парковки нет ");

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
