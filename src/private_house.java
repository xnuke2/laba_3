import java.util.Iterator;

public class private_house extends building{
    int land_area;// площадь земельного участка
    boolean is_garage=false;// присутсвует ли гараж на участке
    boolean is_barn=false;// присутсвует ли сарай амбор на участке
    boolean is_shed=false;//присутствует ли сарай/амбар на участке
    boolean is_summerhouse=false;//является ли этот дом летним(дачей)
    private_house(){//конструктор по умолчанию
        super();
        land_area=InOut.GetIntFromUser("Введите размер участка(в квадратных метрах)", width*length );
        is_garage=InOut.getBooleanFromUser("Есть ли у вас гараж");
        is_barn=InOut.getBooleanFromUser("Есть ли у вас сарай/амбар");
        is_shed=InOut.getBooleanFromUser("Есть ли у вас навес/беседка");
        is_summerhouse=InOut.getBooleanFromUser("Является ли это здание летним домом(дачей)");
        building.buildingCollection.add(this);
    }
    private_house(String _name,int _height,int _width,int _length,int _land_area,boolean _is_garage,
                  boolean _is_barn,boolean _is_shed,boolean _is_summerhouse){//конструктор с параметрами
        super(_name,_height,_width,_length);
        land_area=_land_area;
        is_garage=_is_garage;
        is_barn=_is_barn;
        is_shed=_is_shed;
        is_summerhouse=_is_summerhouse;
        building.buildingCollection.add(this);
    }


    public void setIs_barn() {// установить значение is_barn
        this.is_barn =InOut.getBooleanFromUser("Есть ли у вас сарай/амбар"); ;
    }

    public void setIs_garage() {// установить значение Is_garage
        this.is_garage = InOut.getBooleanFromUser("Есть ли у вас гараж");
    }

    public void setIs_shed() {// установить значение Is_shed
        this.is_shed = InOut.getBooleanFromUser("Есть ли у вас навес/беседка");
    }

    public void setIs_summerhouse() {// установить значение Is_summerhouse
        this.is_summerhouse = InOut.getBooleanFromUser("Является ли это здание летним домом(дачей)");
    }

    public void setLand_area() {// установить значение Land_area
        this.land_area = InOut.GetIntFromUser("Введите размер участка(в квадратных метрах", 1 );
    }

    public String getLand_area() {
        return "Площадь "+this.land_area;
    }
    public String getIs_barn(){
        return "Сарай/амбар " + this.is_barn;
    }
    public String getIs_garage(){
        return "Гараж " + this.is_garage;
    }
    public String getIs_shed(){
        return "Навес/беседка " + this.is_shed;
    }
    public String getIs_summerhouse() {
        return "Летний дом " + this.is_summerhouse;
    }

    public String getInfoOfPrivateHouse(){
        return getInfo() + "\n" +
                "Площадь "+this.land_area + "\n" +
                "Сарай/амбар " + this.is_barn + "\n" +
                "Гараж " + this.is_garage + "\n" +
                "Навес/беседка " + this.is_shed + "\n" +
                "Летний дом " + this.is_summerhouse;
    }
}
