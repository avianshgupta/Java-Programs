package mypackconverter;

public class DistanceConv{
    public static float metersToKM(float meters){
        return (meters * 0.001f);
    }

    public static float milesToKM(float miles){
        return (miles * 1.609f);
    }

    public static float kmToMeters(float km){
        return (km * 1000);
    }

    public static float kmToMiles(float km){
        return (km * 0.621f);
    }
}