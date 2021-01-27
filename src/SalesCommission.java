//7.10 (Sales Commissions) Use a one-dimensional array to solve the following problem: A company
//        pays its salespeople on a commission basis. The salespeople receive $200 per week plus 9% of
//        their gross sales for that week. For example, a salesperson who grosses $5,000 in sales in a week receives
//        $200 plus 9% of $5,000, or a total of $650. Write an application (using an array of counters)
//        that determines how many of the salespeople earned salaries in each of the following ranges (assume
//        that each salesperson’s salary is truncated to an integer amount):
//        a) $200–299
//        b) $300–399
//        c) $400–499
//        d) $500–599
//        e) $600–699
//        f) $700–799
//        g) $800–899
//        h) $900–999
//        i) $1,000 and over
//        Summarize the results in tabular format.

public class SalesCommission {
    private static int basePay = 200;
    private static int[] frequency ;
    private static  int[] sales;
    private  static  int commission;

    public static void calculateSalaryFrequency(int[] sales, int[] frequency){
        for(int sale: sales) {
            commission = (int) (sale * 0.09 + basePay);

             switch(commission / 100){
                 case 2 -> ++frequency[0];
                 case 3 -> ++frequency[1];
                 case 4 -> ++frequency[2];
                 case 5 -> ++frequency[3];
                 case 6 -> ++frequency[4];
                 case 7 -> ++frequency[5];
                 case 8 -> ++frequency[6];
                 case 9 -> ++frequency[7];
                 default-> ++frequency[8];
             }
        }

    }
    
}
