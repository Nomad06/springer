import enums.DistributorStatus;
import enums.DistributorSteps;

public class Stepper {
    private DistributorSteps step;
    private DistributorStatus status;

    private static Stepper stepper;

    private Stepper(){
        status = DistributorStatus.READY;
    }

    public static Stepper createStepper(){
        if(stepper == null){
            stepper = new Stepper();
        }
        return stepper;
    }

    public static void clear(){
        stepper = null;
    }

    public DistributorSteps getStep() {
        return step;
    }

    public void setStep(DistributorSteps step) {
        this.step = step;
    }

    public DistributorStatus getStatus() {
        return status;
    }

    public void setStatus(DistributorStatus status) {
        this.status = status;
    }
}
