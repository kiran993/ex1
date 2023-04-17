public class Pojo {
    private int empid;
    private String empname;
    private int DOJ;
    public Pojo() {}
    public Pojo(int empid, String empname, int dOJ) {
        this.empid = empid;
        this.empname = empname;
        DOJ = dOJ; 
       
    }
    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public String getEmpname() {
        return empname;
    }
    public void setEmpname(String empname) {
        this.empname = empname;
    }
    public int getDOJ() {
        return DOJ;
    }
    public void setDOJ(int dOJ) {
        DOJ = dOJ;
    }

}
