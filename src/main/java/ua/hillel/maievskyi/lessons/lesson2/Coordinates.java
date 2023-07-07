package ua.hillel.maievskyi.lessons.lesson2;

public class Coordinates {
    public static void main(String[] args) {
        double lat = 50.494446;
        double lon = 30.445675;
        char degreeSymbol = '°';
        char specSymbol = '\'';
        char specSymbol2 = '\"';

        System.out.println("Latitude: " + lat + " Longitude: " + lon);
        System.out.println("GPS Coordinates: " + "50" + degreeSymbol + " 29" + specSymbol + " 40.0056" + specSymbol2 + " N");
        System.out.println("                 " + "30" + degreeSymbol + " 26" + specSymbol + " 44.43" + specSymbol2 + " E");
    }
}