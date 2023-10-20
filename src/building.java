import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
 abstract class building {
    static Collection<building> buildingCollection = new ArrayList<>();

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

    public void setHeight() {
        this.height =InOut.GetIntFromUser("Введите высоту", 1 );
    }

    public void setLength() {
        this.length = InOut.GetIntFromUser("Введите длину", 1 );
    }

    public void setName() {
        Name=InOut.getLineFromUser("Введите назавание");
    }

    public void setWidth() {this.width = InOut.GetIntFromUser("Введите ширину", 1 );}
//    public static building GetBuildingFromCollection(){}
     public static building FindBuildingByName(String Name){
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