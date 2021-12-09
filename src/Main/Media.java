package Main;

import java.util.ArrayList;
import java.util.List;

public class Media {

    protected String name;
    protected String authorName;
    protected List<Integer> rating;
    protected ArrayList bdd = new ArrayList();

    Media(String name, String authorName){
        this.name = name;
        this.authorName = authorName;
    }

    public String toString() {
        return "Le " + this.name + " par : " + this.authorName;
    }

    protected void vote(int note){
        this.rating.add(note);
    }

    protected double averageRate(){
        double tmp = 0;
        for (Integer rate : rating){
            tmp = tmp + rate;
        }
        if (rating.size() == 0){
            return 0;
        }
        else {
            return tmp / rating.size();
        }
    }

    protected void add (Media m){
        this.bdd.add(m);
    }

    protected ArrayList filter(String parameter, String needle ){
        tmp =
        for (int i = 0; i<bdd.size(); i++){
            if (parameter == "titre" && bdd.get()){

            }
            else if(parameter == "auteur"){

            }
            else if(parameter == "media"){

            }
        }
    }

}
