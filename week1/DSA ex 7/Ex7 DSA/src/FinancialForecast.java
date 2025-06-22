public class FinancialForecast {

    public static double forecastRecursive(double initialValue, double rate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return forecastRecursive(initialValue, rate, years - 1) * (1 + rate);
    }

    public static double forecastIterative(double initialValue, double rate, int years) {
        double value = initialValue;
        for (int i = 1; i <= years; i++) {
            value *= (1 + rate);
        }
        return value;
    }

    public static void main(String[] args) {
        double initialInvestment = 1000.0;
        double growthRate = 0.05; 
        int years = 10;
        double recursiveResult = forecastRecursive(initialInvestment, growthRate, years);
        System.out.printf("Future Value (Recursive) after %d years: ₹%.2f\n", years, recursiveResult);
        double iterativeResult = forecastIterative(initialInvestment, growthRate, years);
        System.out.printf("Future Value (Iterative) after %d years: ₹%.2f\n", years, iterativeResult);
    }
}
