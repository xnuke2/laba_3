public abstract class building {
    String Name;
    int height;
    int width;
    int length;
    building(){};
    building(String _name,int _height,int _width,int _length){
        Name=_name;
        height=_height;
        width=_width;
        length =_length;
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
}
