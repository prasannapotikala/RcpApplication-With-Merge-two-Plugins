package employeedetails;


import javax.inject.Inject;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.part.ViewPart;


public class EmpTableView extends ViewPart{
	
	public static final String ID = "Employee.view";

	@Inject IWorkbench workbench;


	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		
		GridLayout layout = new GridLayout();
		
		// Create the ScrolledComposite to scroll horizontally and vertically
	    ScrolledComposite scrolledcomposite = new ScrolledComposite(parent, SWT.BORDER| SWT.H_SCROLL| SWT.V_SCROLL);
	    scrolledcomposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

	    // Create a child composite to hold the controls
	    Composite child = new Composite(scrolledcomposite, SWT.NONE);
	    child.setLayout(layout);
	    
	    
		// creating employee controller object
		EmpTableController03 controller = new EmpTableController03(child);
		
		

			
		
		
		
		
		
		

		    
		   
		    
		    
		// Set the child as the scrolled content of the ScrolledComposite
	    scrolledcomposite.setContent(child);

	    // Set the minimum size
	   scrolledcomposite.setMinSize(800, 500);

	    // Expand both horizontally and vertically
	    scrolledcomposite.setExpandHorizontal(true);
	    scrolledcomposite.setExpandVertical(true);
		
		EmployeeShow show = new EmployeeShow();
		show.setText("Show");
	    getViewSite().getActionBars().getMenuManager().add(show);

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}

}
