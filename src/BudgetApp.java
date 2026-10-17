import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // BudgetCategory groceries = new BudgetCategory("Groceries", 400, 375);
        // BudgetCategory rent = new BudgetCategory("Rent", 1350, 1350);
        // BudgetCategory dining = new BudgetCategory("Dining", 120, 185);
        // BudgetCategory transportation = new BudgetCategory("Transportation", 200, 190);
        // BudgetCategory entertainment = new BudgetCategory("Entertainment", 80, 115);
        // BudgetCategory utilities = new BudgetCategory("Utilities", 150, 165);
            
        // System.out.println(groceries.getLimit());
        
        List<BudgetCategory> categories = new ArrayList<>();

        while (scan.hasNextLine()) {
            String name = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            // Consume the \n after the spent value
            if (scan.hasNextLine()) scan.nextLine();

            categories.add(new BudgetCategory(name, limit, spent));
        }
        scan.close();

        Collections.sort(categories);
        System.out.println(categories);
    }

    /**
     * Returns overall how much over/under budget a person is given a list of their
     * categories.
     * 
     * This should be the sum of how much over/under budget each individual category is.
     * 
     * If the person is under budget, the result will be negative. If they are over budget, the
     * result will be positive.
     * 
     * @param categories the budget categories with the spend
     * @return the total amount over/under budget
     */
    public static int budgetDifference(List<BudgetCategory> categories) {
        // TODO: You will implement this method in Wave 4
        // Note that this method SHOULD NOT have a print statement.
        // It should instead return the value.
        return -1;
    }
}
