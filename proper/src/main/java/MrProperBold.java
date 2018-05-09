public class MrProperBold implements MrProper {

    private boolean isBold;

    public MrProperBold(boolean isBold) {
        this.isBold = isBold;
    }

    public void doCleaning() {
        System.out.println("Super bold cleaning!");
    }

    public boolean isBold() {
        return isBold;
    }

    public void setBold(boolean bold) {
        isBold = bold;
    }
}
