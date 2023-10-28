public class skyscraper extends building {
    int number_of_floors;//колличество этажей
    int the_area_of_1_apartment;// площадь 1 квартиры
    boolean is_parking;//есть ли парковка
    boolean is_children_playground;//есть ли детская площадка
    boolean is_fence;//есть ли забор
    skyscraper(){// конструктор по умолчанию
        super();
        number_of_floors = InOut.GetIntFromUser("Введите количество этажей", 1);
        the_area_of_1_apartment = InOut.GetIntFromUser("Введите площадь одного номера");
        is_parking = InOut.getBooleanFromUser("Есть ли у вас парковка");
        is_children_playground = InOut.getBooleanFromUser("Есть ли у вас детская площадка");
        is_fence = InOut.getBooleanFromUser("Есть ли у вас забор");
        building.buildingCollection.add(this);
    }
    skyscraper(String _name,int _height,int _width,int _length,int _number_of_floors,int _the_area_of_1_apartment,
               boolean _is_parking,boolean _is_children_playground,boolean _is_fence){//конструктор с параметрами
        super(_name,_height,_width,_length);
        number_of_floors = _number_of_floors;
        the_area_of_1_apartment=_the_area_of_1_apartment;
        is_parking=_is_parking;
        is_children_playground=_is_children_playground;
        is_fence=_is_fence;
        building.buildingCollection.add(this);
    }

    public void setNumber_of_floors() {// установить значение Number_of_floors
        this.number_of_floors = InOut.GetIntFromUser("Введите количество этажей", 1);
    }

    public void setIs_children_playground() {// установить значение Is_children_playground
        this.is_children_playground = InOut.getBooleanFromUser("Есть ли у вас детская площадка");
    }

    public void setIs_fence() {// установить значение Is_fence
        this.is_fence = InOut.getBooleanFromUser("Есть ли у вас забор");
    }

    public void setIs_parking() {// установить значение Is_parking
        this.is_parking = InOut.getBooleanFromUser("Есть ли у вас парковка");
    }

    public void setThe_area_of_1_apartment() {// установить значение The_area_of_1_apartment
        this.the_area_of_1_apartment = InOut.GetIntFromUser("Введите площадь одного номера");
    }
    public String getNumber_of_floord(){
        return "Количество этажей " + this.number_of_floors;
    }
    public String getIs_children_playground(){
        return "Детская площадка " + this.is_children_playground;
    }
    public String getIs_fence(){
        return "Забор " + this.is_fence;
    }
    public String getIs_parking(){
        return "Парковка " + this.is_parking;
    }
    public String getThe_area_of_1_apartment(){
        return "площадь 1 номера " + this.the_area_of_1_apartment;
    }
    public String getInfoOfSkyscraper(){
        return getInfo() + "\n" +
                "Количество этажей " + this.number_of_floors + "\n" +
                "Детская площадка " + this.is_children_playground + "\n" +
                "Забор " + this.is_fence + "\n" +
                "Парковка " + this.is_parking + "\n" +
                "площадь 1 номера " + this.the_area_of_1_apartment;
    }
}
