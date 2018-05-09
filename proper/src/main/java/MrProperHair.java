public class MrProperHair implements MrProper {
    private boolean isBold;

    public MrProperHair(boolean isBold) {
        this.isBold = isBold;
    }

    public boolean isBold() {
        return isBold;
    }

    public void setBold(boolean bold) {
        isBold = bold;
    }

    public void doCleaning() {
        System.out.println("Super hair cleaning!");
    }
}
