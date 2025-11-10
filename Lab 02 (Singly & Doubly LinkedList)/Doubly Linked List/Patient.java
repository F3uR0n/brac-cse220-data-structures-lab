public class Patient{

    public Integer id;
    public String name;
    public Integer age;
    public String bloodGroup;
    public Patient next;
    public Patient prev;

    public Patient(Integer x,String y,Integer z,String k,Patient next,Patient prev){
        id = x;
        name = y;
        age = z;
        bloodGroup =k;
        this.next = next;
        this.prev = prev;
    }
}