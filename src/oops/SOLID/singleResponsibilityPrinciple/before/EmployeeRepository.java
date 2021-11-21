package oops.SOLID.singleResponsibilityPrinciple.before;

import java.util.Arrays;
import java.util.List;
import java.nio.file.Path;

public class EmployeeRepository {

    public List<Employee> findAll(){

        // Employees are kept in memory for simplicity
        Employee anna = new FullTimeEmployee("Anna Smith", 2000);
        Employee billy = new FullTimeEmployee("Billy Leech", 920);

        Employee steve = new PartTimeEmployee("Steve Jones", 800);
        Employee magda = new PartTimeEmployee("Magda Iovan", 920);

        return Arrays.asList(anna, billy, steve, magda);
    }

    public void saveEmployee(Path path,StringBuilder sb){
            filedb.save(path, sb.toString().getBytes())
    }
}