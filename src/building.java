import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
 abstract class building {
    static Collection<building> buildingCollection = new ArrayList<>();
     public static building findByName(String Name) {
         return buildingCollection.stream().filter(carnet -> Name.equals(carnet.getName())).findFirst().orElse(null);
     }
    String Name;
    int height;
    int width;
    int length;
    building(){
        Name=InOut.getLineFromUser("Введите назавание");
        height=InOut.GetIntFromUser("Введите высоту", 1 );
        width=InOut.GetIntFromUser("Введите ширину", 1 );
        length=InOut.GetIntFromUser("Введите длину", 1 );
    };
    building(String _name,int _height,int _width,int _length){
        Name=_name;
        height=_height;
        width=_width;
        length =_length;
    }
    public String getName(){
        return this.Name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setWidth(int width) {
        this.width = width;
    }
//    public static building GetBuildingFromCollection(){}
     public static building FindBuildingByName(String Name){
         Iterator<building> iter = buildingCollection.iterator();
         building it = iter.next();
         while(iter.equals(iter)) {
             if (Name.equals(it.Name)){
                 System.out.println("Высота: " + it.height + "\n" +
                         "Длина: " + it.length + "\n" +
                         "Ширина: " + it.width + "\n");
                 break;
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