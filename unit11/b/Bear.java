package unit11.b;

// let's explore inheritance!
public class Bear {
    private zoo whereILive;
    private String name;
    public Bear(String myName){
        this.name = myName;
    }
}

// https://wwf.panda.org/wwf_news/?163461/Is-the-giant-panda-a-bear
class Panda extends Bear{
    public Panda (String pandaName){
        super(pandaName);
        this.myPandaName = pandaName;


        public Panda();
    }
}

// https://en.wikipedia.org/wiki/List_of_giant_pandas
class Zoo{
    private Panda inhabitant;
}
public static void main(String[] args) {
    //Bear meiLan = new Bear("Mei Lan");
    Bear mrBear = new bear();
    Panda mrPandaBear = new Panda();
}
// Zookeeper, Visitor, etc.
