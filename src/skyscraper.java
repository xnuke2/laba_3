public class skyscraper extends building {
    int number_of_floors;
    int the_area_of_1_apartment;
    boolean is_parking;
    boolean is_children_playground;
    boolean is_fence;
    skyscraper(){}
    skyscraper(String _name,int _height,int _width,int _length,int _number_of_floors,int _the_area_of_1_apartment,boolean _is_parking,boolean _is_children_playground,boolean _is_fence){
        Name=_name;
        height=_height;
        width=_width;
        length=_length;
        number_of_floors = _number_of_floors;
        the_area_of_1_apartment=_the_area_of_1_apartment;
        is_parking=_is_parking;
        is_children_playground=_is_children_playground;
        is_fence=_is_fence;
    }
}
