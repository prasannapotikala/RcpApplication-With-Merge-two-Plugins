package dogshowentry;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

public class show extends Action implements IWorkbenchAction{

private static final String ID = "show";

public show(){
setId(ID);
}

public void run() {
	
	System.out.println("hi");
	
	try {
	FileInputStream fis = new FileInputStream("C:\\Users\\PC\\Desktop\\dog.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Object obj = ois.readObject();
	DogShowEntryModel dog = (DogShowEntryModel) obj;
	dog.toString();
	
	String name = dog.getDogName();
	String breed = dog.getBreed();
	String ownerName = dog.getOwnerName();
	String ownerPhone = dog.getPhone();

	System.out.println(ownerName);
	
	Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	String dialogBoxTitle = "Info";
	String message = "Dog Name ::    "+name+"    |||    Dog Breed   ::  "+breed+"    ||    Owner Name  ::   "+ ownerName+"    ||   Owner Phone  :: "+ownerPhone;
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