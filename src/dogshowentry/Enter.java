package dogshowentry;

import javax.inject.Inject;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.handlers.HandlerUtil;

public class Enter extends AbstractHandler{
	
	public static final String ID = "RcpView.command2";

	@Inject IWorkbench workbench;
	
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
    	
        MessageDialog.openInformation(HandlerUtil.getActiveWorkbenchWindow(
                event).getShell(), "Info", "Details of Dog Is Successfully Added!");
        return null;
    }


}
