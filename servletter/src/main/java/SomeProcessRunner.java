import enums.DistributorStatus;
import enums.DistributorSteps;
import org.springframework.beans.factory.annotation.Autowired;

public class SomeProcessRunner implements ProcessRunner {
    @Autowired
    private Stepper stepper;

    public SomeProcessRunner(){}

    public SomeProcessRunner(Stepper stepper){
        this.stepper = stepper;
    }

    public String runProcess() {
        if(stepper.getStatus() == DistributorStatus.IN_PROGRESS){
            return stepper.getStep().toString();
        }
        stepper.setStatus(DistributorStatus.IN_PROGRESS);
        stepper.setStep(DistributorSteps.LAUNCH_DB);
        stepper.setStep(DistributorSteps.AUTHORIZATION);
        stepper.setStep(DistributorSteps.PREPARE_TO_UPDATE);
        stepper.setStep(DistributorSteps.UPDATE);
        for(int i = 0; i < 5000000; i++){
            System.out.println(i);
        }
        stepper.setStep(DistributorSteps.POST_UPDATE);
        stepper.setStep(DistributorSteps.FINISH);

        return stepper.getStep().toString();
    }
}
