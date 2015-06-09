import java.util.ArrayList;
import java.util.HashMap;

public class Rules {
    private HashMap<Cell,ArrayList<Integer>> cells=new HashMap<Cell, ArrayList<Integer>>();

    public Rules(HashMap<Cell,ArrayList<Integer>> cells){
        this.cells=cells;
    }

    public void run(){

        for(int cellId=0; cellId<=500; cellId++){
          cells.get(cellId);
        }
    }

}
