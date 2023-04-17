import java.util.ArrayList;
import java.util.List;

public class Serviceimp implements Service {
    ArrayList<Pojo> po = new ArrayList<>();

    @Override
    public List<Pojo> getallemployee() {
        return po;
    }

    @Override
    public void addemp(Pojo xPojo) {
        po.add(xPojo);
    }

    @Override
    public void deleteemp(Pojo yPojo) {
        po.remove(yPojo);
    }

    @Override
    public void updateemp(Pojo zPojo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateemp'");
    }

}
