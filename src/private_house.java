public class private_house extends building{
    int land_area;
    boolean is_garage=false;
    boolean is_barn=false;
    boolean is_shed=false;
    boolean is_summerhouse=false;
    private_house(){
        super();
        land_area=InOut.GetIntFromUser("Введите размер участка(в квадратных метрах)", width*length );
        is_garage=InOut.getBooleanFromUser("Есть ли у вас гараж");
        is_barn=InOut.getBooleanFromUser("Есть ли у вас сарай/амбар");
        is_shed=InOut.getBooleanFromUser("Есть ли у вас навес/беседка");
        is_summerhouse=InOut.getBooleanFromUser("Является ли это здание летним домом(дачей)");
        building.buildingCollection.add(this);
    }
    private_house(String _name,int _height,int _width,int _length,int _land_area,boolean _is_garage,boolean _is_barn,boolean _is_shed,boolean _is_summerhouse){
        Name=_name;
        height=_height;
        width=_width;
        length=_length;
        land_area=_land_area;
        is_garage=_is_garage;
        is_barn=_is_barn;
        is_shed=_is_shed;
        is_summerhouse=_is_summerhouse;
    }


    public void setIs_barn() {
        this.is_barn =InOut.getBooleanFromUser("Есть ли у вас сарай/амбар"); ;
    }

    public void setIs_garage() {
        this.is_garage = InOut.getBooleanFromUser("Есть ли у вас гараж");
    }

    public void setIs_shed() {
        this.is_shed = InOut.getBooleanFromUser("Есть ли у вас навес/беседка");
    }

    public void setIs_summerhouse() {
        this.is_summerhouse = InOut.getBooleanFromUser("Является ли это здание летним домом(дачей)");
    }

    public void setLand_area() {
        this.land_area = InOut.GetIntFromUser("Введите размер участка(в квадратных метрах", 1 );
    }
}
