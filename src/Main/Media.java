package Main;

import java.util.ArrayList;

public class Media {

    protected String name;
    protected String authorName;
    protected ArrayList rating = new ArrayList();
    protected ArrayList bdd = new ArrayList();

    Media(String name, String authorName){
        this.name = name;
        this.authorName = authorName;
    }

    public String toString() {
        return "Le " + this.name + " par : " + this.authorName;
    }

    protected void vote(double note){
        this.rating.add(note);
    }

    protected double averageRate(){
        double tmp = 0;
        for (int i=0; i<rating.size(); i++){
            tmp = tmp + (double)rating.get(i);
        }
        return tmp/rating.size();
    }

    protected void add (Media m){
        this.bdd.add(m);
    }

    protected ArrayList filter(String parameter, String needle ){
        
    }
}
