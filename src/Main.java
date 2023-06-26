import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Yusuf", "Kılıç");
        Employee emp2 = new Employee(1, "Yusuf", "Kılıç");
        Employee emp3 = new Employee(2, "Elif", "Taşçı");
        Employee emp4 = new Employee(3, "Ömer", "Budak");

        Set set = new TreeSet();

        System.out.println(set.add(emp1));
        System.out.println(set.add(emp2));
        System.out.println(set.add(emp3));
        System.out.println(set.add(emp4));

        set.forEach(s -> System.out.println(s.toString()));

        System.out.println();


        Employee2 e1 = new Employee2(1, "Yusuf", "Kılıç");
        Employee2 e2 = new Employee2(1, "Yusuf", "Kılıç");
        Employee2 e3 = new Employee2(2, "Elif", "Taşçı");
        Employee2 e4 = new Employee2(3, "Ömer", "Budak");

        EmployeeComparator ec = new EmployeeComparator();

        Set set2 = new TreeSet(ec);

        System.out.println(set2.add(e1));
        System.out.println(set2.add(e2));
        System.out.println(set2.add(e3));
        System.out.println(set2.add(e4));

        set2.forEach(s -> System.out.println(s.toString()));
            
        }
    }
