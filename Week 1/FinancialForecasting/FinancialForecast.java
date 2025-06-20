public class FinancialForecast
{
    public static double fValue(double intialAmt, double grwRate, int yrs)
    {
        if(yrs==0) return intialAmt;

        return fValue(intialAmt,grwRate, yrs-1)*(1+grwRate);
    }

    public static void main(String[] args)
    {
        double intialAmt=10000;
        double grwRate=0.10;
        int yrs=5;

        double res=fValue(intialAmt, grwRate, yrs);
        System.out.printf("Future Value after %d years: Rs%.2f%n",yrs,res);
    }
}