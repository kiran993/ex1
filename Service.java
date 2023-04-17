import java.util.List;

interface Service {
    public List <Pojo> getallemployee();
  public void addemp(Pojo xPojo);
  public void deleteemp(Pojo yPojo);
  public void updateemp(Pojo zPojo);
}
