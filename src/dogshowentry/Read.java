package dogshowentry;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.inject.Inject;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class Read extends AbstractHandler{
	
	public static final String ID = "RcpView.command1";

	@Inject IWorkbench workbench;
	
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
    	
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

    		
        return null;
    }


}
