import TheComplex.TheComplexImplementation;
import TheOkay.TheOkayImplementation;
import TheUsual.TheUsualImplementation;

public class Main {
    public static void main(String[] args) {
        var usualImplementation = new TheUsualImplementation();
        var theOkayImplementation = new TheOkayImplementation();
        var complexImplementation = new TheComplexImplementation();

        usualImplementation.execute();
        theOkayImplementation.execute();
        complexImplementation.execute();
    }
}