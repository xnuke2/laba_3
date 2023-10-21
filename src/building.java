import java.util.*;

abstract class building implements Comparable{
    static ArrayList<building> buildingCollection = new ArrayList<>();//коллекция для хранения наследников класса
     @Override
     public int compareTo(Object o) {
         building f = (building) o;
         return this.height - f.height ;
     }
     static void sortByHeight(){

         Collections.sort(buildingCollection, Comparator.comparing(building::getHeight));
         //buildingCollection.stream().sorted().collect(buildingCollection);
         //Collections.sort(buildingCollection.stream().toList());
         //buildingCollection.stream().sorted(building::compareTo);
     }


     // building
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

    public int getHeight() {
        return height;
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
             }
         }
         return null;
     }
}