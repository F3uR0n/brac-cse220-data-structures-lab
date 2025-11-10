public class WRM {
    Patient dh;

    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        Patient newPatient = new Patient(id, name, age, bloodgroup, dh, dh.prev);
        dh.prev.next = newPatient;
        dh.prev = newPatient;
        System.out.println("Success, Registering Patient");
    }

    public void servePatient() {
        if(dh.next== dh){
            System.out.println("No Patient");
            return;
        }
        Patient done = dh.next;
        System.out.println(done.name + " Served");
        dh.next = done.next;
        done.next.prev = dh;
    }

    public void showAllPatient() {
        if(dh.next== dh){
            System.out.println("No Patient in the Line");
            return;
        }
        Patient current = dh.next;
        while(current != dh){
            System.out.print(current.name+" ");
            current = current.next;
        }
        System.out.println();
    }

    public boolean canDoctorGoHome() {
        if(dh.next!= dh){
            return false;
        }
        return true;
    }

    public void cancelAll() {
        dh.next = dh;
        dh.prev = dh;
        System.out.println("Success");
    }

    public void reverseTheLine() {
        if(dh.next== dh){
            System.out.println("No Patient in the Line");
            return;
        }
        Patient current = dh.next;
        Patient temp = null;
        while (current != dh) {
            temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = temp;
        }
        temp = dh.next;
        dh.next = dh.prev;
        dh.prev = temp;
    }

}