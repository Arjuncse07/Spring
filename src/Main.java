import com.arjun.model.Employee;
import com.arjun.model.Pancard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("com/arjun/Beans.xml");
        Employee employee=applicationContext.getBean("employee", Employee.class);

        System.out.println(employee.getEmployeeId()+"\t" +employee.getEmployeeName());

        System.out.println("---------------------------------------------------------");

        Pancard pancard= employee.getPancard();
        if(pancard != null){
            System.out.println(pancard.getPanHolderName()+"\t" + pancard.getPanNumber());
        }else{
            System.out.println("Pancard details is not available...");
        }
    }
}