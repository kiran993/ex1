public class Pojomain {
    public static void main(String[] args) {
        Pojo ps=new Pojo(100,"Kiran",12);
        Pojo po=new Pojo(101,"Sala",12);
        Pojo jo=new Pojo(102,"Thiyagu",12);
        Pojo gs=new Pojo(103,"Jeya",12);

        Serviceimp se = new Serviceimp();
        se.addemp(ps);
        se.addemp(po);
        se.addemp(jo);
        se.addemp(gs);

        System.out.println(se.getallemployee());

    }
    
}
