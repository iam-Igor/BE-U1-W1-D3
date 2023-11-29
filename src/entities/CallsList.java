package entities;

public class CallsList {

    private String numberCalled;
    private double callDuration;


    public CallsList(String numberCalled, double callDuration) {
        this.numberCalled = numberCalled;
        this.callDuration = callDuration;
    }


    public String getNumberCalled() {
        return numberCalled;
    }

    public double getDuration() {
        return callDuration;
    }

}
