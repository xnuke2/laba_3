import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
public class InOut {
    static Scanner in = new Scanner(System.in);
    static void PrintInformationAboutMenu(){//функция отвечающая за взаимодействие с пользователем
        System.out.println("1 Ввести новый элемент\n2 Найти и возможно изменить элемент\n3 Найти самое высокое здание\n4 Определить здания с высотой более 50 м\n5 Сортировать по высоте");
        switch (InOut.GetIntFromUser("Введите номер варианта", 6,1)){
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
                        if(!building.buildingCollection.isEmpty()){
                            System.out.println("Список построек");
                            InOut.PrintAllNamesFromCollection(building.buildingCollection);
                            break;
                        }
                        else {
                            System.out.println("Контейнер пуст");
                            break;
                        }
                    case 2:
                        if(!building.buildingCollection.isEmpty()){
                            building tmp = null;
                            while(tmp==null){
                                tmp = building.FindBuildingByName(InOut.getLineFromUser("Введите название здания"));
                            }
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
                        }
                        else{
                            System.out.println("Контейнер пуст");
                            break;
                        }
                    case 3:
                        InOut.PrintInformationAboutMenu();
                        break;
                }
                break;
            case 3:
                if(!building.buildingCollection.isEmpty()){
                    FindTheTallestBuilding(building.buildingCollection);
                    break;
                }
                else{
                    System.out.println("Контейнер пуст");
                    break;
                }
            case 4:
                if(!building.buildingCollection.isEmpty()){
                    System.out.println("Здания с высотой больше 50");
                    InOut.PrintBuildingsWithHeightMoreWhen50(building.buildingCollection);
                    break;
                }
                else{
                    System.out.println("Контейнер пуст");
                    break;
                }
            case 5:
                if(!building.buildingCollection.isEmpty()){
                    building.sortByHeight();
                    break;
                }
                else{
                    System.out.println("Контейнер пуст");
                    break;
                }
        }
    }
    static void PrintBuildingsWithHeightMoreWhen50(Collection<building> Coll){/*функция которая выводит в консоль все
        здания высотой больше 50 метров*/
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
    static void FindTheTallestBuilding(Collection <building> Coll){//функция которая находит самое высокое здание
        Iterator<building> iter = Coll.iterator();
        building it = iter.next();
        int tmp = 0;
        building ttttt = it;
        while(iter.equals(iter)){
            if(it.height == tmp){
                System.out.println(it.Name);
            }
            if(it.height>tmp){
                tmp = it.height;
                ttttt = it;
            }
            if(iter.hasNext()){
                it = iter.next();
            }
            else break;
        }
        System.out.println(ttttt.Name);
    }
    static void PrintAllNamesFromCollection(Collection<building> Coll){//функция которая выводит все название зданий
        Iterator<building> iter = Coll.iterator();
        building it = iter.next();
        while(iter.equals(iter)){
            System.out.println(it.Name);
            if(iter.hasNext()){
                it = iter.next();
            }else break;
        }
    }
    static void PrintBuilding(building _build){//функция которая выводит все данные здания в зависимости от типа здания
        if(_build!=null) {
            if(_build.getClass()==private_house.class){
                InOut.PrintPrivateHouse((private_house) _build);
            } else if (_build.getClass()==skyscraper.class) {
                InOut.PrintSkyscraper((skyscraper) _build);
            }
        }
        System.out.println();
    }
    static void PrintPrivateHouse(private_house _build){//выводит всю информацию о объекте класса private_house
        System.out.println(_build.getInfoOfPrivateHouse());
    }
    static void PrintSkyscraper(skyscraper _build){//выводит всю информацию о объекте класса Skyscraper
        System.out.println(_build.getInfoOfSkyscraper());
    }
    static  boolean getBooleanFromUser(String WhatToNeed){//функция для получения значения boolean от пользователя
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
    static String getLineFromUser(String WhatToNeed){//функция для получения значения string от пользователя
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
    static int GetIntFromUser(String WhatToNeed, int max, int min){//функция для получения значения int от пользователя
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
    static int GetIntFromUser(String WhatToNeed, int min){//функция для получения значения int от пользователя
        return GetIntFromUser(WhatToNeed,2147483647,min);
    }
    static int GetIntFromUser(String WhatToNeed){//функция для получения значения int от пользователя
        return GetIntFromUser(WhatToNeed,2147483647,-2147483647);
    }
}
