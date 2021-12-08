package Main;

public class DVD extends Media {

    protected int zone;
    protected String description;

    DVD(String name, String authorName){
        super(authorName, name );
    }

    public String toString(){
        return this.description;
    }

    public boolean readable(int [] zonesNeedle){
        boolean tmp = false;
        for (int i=0; i<zonesNeedle.length; i++){
            if (zonesNeedle[i] == this.zone){
            tmp = true;
            break;
            }
        }
        return tmp;
    }
}
