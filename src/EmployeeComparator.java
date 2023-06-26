import java.util.Comparator;

public class EmployeeComparator implements Comparator {

    @Override
    public int compare(Object arg0, Object arg1) {
        Employee2 e1 = (Employee2) arg0;
        Employee2 e2 = (Employee2) arg1;

        if (e1.getId() < e2.getId())
            return -1;
        else if (e1.getId() == e2.getId())
            return 0;
        else
            return 1;
    }
}
