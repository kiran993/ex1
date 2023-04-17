public class Outerclass {
    private int outerInt;

    public Outerclass(int outerInt) {
        this.outerInt = outerInt;
    }

    public void outerMethod() {
        InnerClass inner = new InnerClass();
        inner.innerMethod();
    }

    private class InnerClass {
        public void innerMethod() {
            System.out.println("The value of outerInt is " + outerInt);
        }
    }

    public static void main(String[] args) {
        Outerclass inOut = new Outerclass(42);
        inOut.outerMethod();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}