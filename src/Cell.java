
public class Cell {
    private String state;
    private int id;
    private int generation;

    public Cell(int id,String state){
        this.id=id;
        this.state=state;
       generation=0;
    }
    public  String getState(){
        return state;
    }
    public int getId(){
        return id;
    }
    public int getGeneration(){
        return generation;
    }
}
