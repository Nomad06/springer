public class ScoperOwner {

    private Scoper scoper;

    private Scoper prototypeScoper;

    public ScoperOwner(Scoper scoper, Scoper prototypeScoper){
        this.scoper = scoper;
        this.prototypeScoper = prototypeScoper;
    }

    public void doSome(){
        scoper.someMethod();
    }

    public void doPrototype(){
        prototypeScoper.someMethod();
    }

    public Scoper getScoper() {
        return scoper;
    }

    public void setScoper(Scoper scoper) {
        this.scoper = scoper;
    }

    public Scoper getPrototypeScoper() {
        return prototypeScoper;
    }

    public void setPrototypeScoper(Scoper prototypeScoper) {
        this.prototypeScoper = prototypeScoper;
    }
}
