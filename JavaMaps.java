import java.util.HashMap;
import java.util.Map;

public class JavaMaps {

    public static void main(String[] args) {

        Map<Integer,String> employeeReg = new HashMap<>();
        employeeReg.put(1, "Richard");
        employeeReg.put(2, "Chantelle");
        employeeReg.put(3, "Raj");
        employeeReg.put(4, "Wong");
        System.out.println(employeeReg);

        employeeReg.put(1,"Ethan");
        System.out.println(employeeReg);

        System.out.println(employeeReg.size());
//        employeeReg.clear();
        employeeReg.remove(1);
        System.out.println(employeeReg);
        employeeReg.remove(2, "Chantelle");
        System.out.println(employeeReg);

        System.out.println(employeeReg.get(3));

        System.out.println(employeeReg.values());
        System.out.println(employeeReg.keySet());

        HashMap clone = new HashMap(employeeReg);
//        clone.putAll(employeeReg);
        System.out.println(clone);

    }

}
