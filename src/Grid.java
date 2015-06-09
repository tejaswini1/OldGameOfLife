import java.util.ArrayList;
import java.util.HashMap;

public class Grid {
     private HashMap<Cell,ArrayList<Cell>> cells=new HashMap<Cell, ArrayList<Integer>>();

    public Grid(){
        initialize("dead");
    }

   public Grid(String state){
       initialize(state);
   }
    public void initialize(String state){
             for(int count=1;count<500;count++){

                 int step=1;
                 ArrayList<Integer> integerArrayList=null;

                 for(int neighbourId=count+1, iteration=1;iteration<=8;neighbourId+=step){

                   integerArrayList=new ArrayList<Integer>();
                     integerArrayList.add(neighbourId);

                     if(iteration==4)
                         step-=1;
                 }
                 cells.put(new Cell(count,state),integerArrayList);}
    }

    public HashMap<Cell,ArrayList<Integer>> getcells(){
        return cells;
    }
}
