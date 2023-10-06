public class private_house extends building{
    int land_area;
    boolean is_garage=false;
    boolean is_barn=false;
    boolean is_shed=false;
    boolean is_summerhouse=false;

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


}
