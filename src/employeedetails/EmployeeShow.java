package employeedetails;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

public class EmployeeShow extends Action implements IWorkbenchAction{

private static final String ID = "EmployeeShow";

public EmployeeShow(){
setId(ID);
}

public void run() {
	System.out.println("Hi");

	
	try {
		System.out.println("Hi");
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\Desktop\\emp.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Employee emp = (Employee) obj;
		emp.toString();
		System.out.println(obj);
		String id = emp.getEmpId();
		String name = emp.getEmpName();
		String age = emp.getEmpAge();
		String salary = emp.getEmpSalary();
		String gender = emp.getGender();
	
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		String dialogBoxTitle = "Info";
		String message = "ID ::  "+id + "   Name   ::  "+name+"    age  :: "+age + "   salary ::   "+salary+"   Gender  :: "+gender;
		MessageDialog.openInformation(shell, dialogBoxTitle, message);

		
		System.out.println("Successfully read");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}

public void dispose() {}

}