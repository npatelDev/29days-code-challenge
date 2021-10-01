import java.util.Enumeration;
import java.util.Vector;

public class BasicProgrameVector {
public static void main(String[] args) {
		
		Vector<String> emp=new Vector<>();
		emp.add("Red");
		emp.add("Green");
		emp.add("Purple");
		emp.add("Yellow");
		emp.add("Blue");
		Enumeration<String> enu=emp.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		
		
	}
}
