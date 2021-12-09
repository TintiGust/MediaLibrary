package Main;

import java.util.List;

public class DVD extends Media {

    protected String description;
    private ZonesDVD zone;

    DVD(String name, String authorName, ZonesDVD zone){
        super(authorName, name );
        this.zone = zone;
    }

    public enum ZonesDVD{
        Zone_0, Zone_1, Zone_2, Zone_3, Zone_4, Zone_5, Zone_6, Zone_7, Zone_8
    }
    public String toString(){
        return this.description;
    }

    public boolean readable(List<ZonesDVD> zones){
        return zones.contains(this.zone);
    }
}
