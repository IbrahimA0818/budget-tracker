public class BudgetCategory {
    private String name;
    private int limit;
    private int spent;

    public BudgetCategory( String name, int limit, int spent){
        this.name = name;
        this.limit = limit;
        this.spent = spent;
    }

     public String getname(){
        return name;
     }
     public int getLimit(){
        return limit;
     }
     public int getSpent(){
        return spent;
     }
     public String toString(){
      return "for:" + name + "the budget was: " + limit + " , the amount spent was " + spent;
     }

}