public class Converter {
    double distance(int steps){
        int stepLenght = 75;
        double distance = stepLenght * steps / 100000.0;
        return distance;
    }
    double cal(int steps){
        double cal = steps * 50.0 / 1000;
        return cal;
    }
}
