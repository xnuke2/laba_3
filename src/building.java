import java.util.*;

abstract class building{
    static ArrayList<building> buildingCollection = new ArrayList<>();//коллекция для хранения наследников класса
     static void sortByHeight(){//Сортировка объектов по высоте
         Collections.sort(buildingCollection, Comparator.comparing(building::GetHeight));
     }
    String Name;//название здания
    int height;// высота здания
    int width;// ширина здания
    int length;//длина здания
    building(){// конструктор по умолчанию
        String tmp=InOut.getLineFromUser("Введите назавание");
        while (building.FindBuildingByName(tmp)!=null){
            tmp=InOut.getLineFromUser("Уже есть здание с таким названием. Введите новое назавание");
        }
        Name=tmp;
        height=InOut.GetIntFromUser("Введите высоту", 1 );
        width=InOut.GetIntFromUser("Введите ширину", 1 );
        length=InOut.GetIntFromUser("Введите длину", 1 );
    };
    building(String _name,int _height,int _width,int _length){//конструктор с параметром
        Name=_name;
        height=_height;
        width=_width;
        length =_length;
    }



    public void setHeight() {// установить значение height
        this.height =InOut.GetIntFromUser("Введите высоту", 1 );
     }

     public void setLength() {// установить значение lenght
         this.length = InOut.GetIntFromUser("Введите длину", 1 );
     }

     public void setName(){// установить значение Name
         Name=InOut.getLineFromUser("Введите назавание");
     }

     public void setWidth(){// установить значение width
        this.width = InOut.GetIntFromUser("Введите ширину", 1 );
    }

     public static building FindBuildingByName(String Name){//поиск в коллекции по названию
        if(buildingCollection.isEmpty()){
            return null;
        }
         Iterator<building> iter = buildingCollection.iterator();
         building it = iter.next();
         while(iter.equals(iter)) {
             if (Name.equals(it.Name)){
                 return it;
             }
             else {
                 if(iter.hasNext()){
                     it = iter.next();
                 }
                 else break;
             }
         }
         return null;
     }

    public String getWidth() {
        return "Ширина "+ width;
    }

    public String getName() {
        return "Название "+ Name;
    }

    public String getLength() {
        return "Длина "+length;
    }
    public int GetHeight() {//Возвращает высоту здания
        return height;
    }
    public String getHeight(){
        return "Высота "+this.height;
    }
    public String getInfo(){
        return "Ширина "+ width + "\n" + "Название "+ Name + "\n" + "Длина "+ length + "\n" + "Высота "+height;
    }
}