package mypackconverter;

public class CurrencyConv{
    public static float dollarToINR(float dollar){
        return (dollar * 71.74f);
    }

    public static float euroToINR(float euro){
        return (euro * 78.99f);
    }

    public static float yenToINR(float yen){
        return (yen * 0.67f);
    }

    public static float inrToDollar(float inr){
        return (inr * 0.014f);
    }

    public static float inrToEuro(float inr){
        return (inr * 0.013f);
    }

    public static float inrToYen(float inr){
        return (inr * 1.49f);
    }
}