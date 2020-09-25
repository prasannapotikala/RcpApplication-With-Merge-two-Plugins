package employeedetails;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ITableColorProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.PlatformUI;


public class EmpTableController03 implements ITableColorProvider{
	
	
	protected abstract class AbstractEditingSupport extends EditingSupport {
		
		private TextCellEditor editor;

		public AbstractEditingSupport(TableViewer viewer) {
			super(viewer);
			this.editor = new TextCellEditor(viewer.getTable());
		}

		public Color getForeground(Object element) {
			// TODO Auto-generated method stub
			return null;
		}

		public Color getBackground(Object element) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		protected boolean canEdit(Object element) {
			return true;
		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			return editor;
		}

		@Override
		protected void setValue(Object element, Object value) {
			doSetValue(element, value);
			getViewer().update(element, null);
		}

		protected abstract void doSetValue(Object element, Object value);
	}
	
	
	// creating constructor
	public EmpTableController03(Composite child) {
		
		super();
		// TODO Auto-generated constructor stub
		
		createTable(child);
		
		
	}

	private void createTable(Composite child) {
		// TODO Auto-generated method stub
		
		TableViewer v = new TableViewer(child, SWT.BORDER | SWT.FULL_SELECTION);
		//v.setLabelProvider(new ColorAndFont());
		v.setContentProvider(ArrayContentProvider.getInstance());
		
		
		// create EmpId

		TableViewerColumn column = createColumnFor(v, "EmpId");
		column.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				return (((Employee)element).getEmpId());
			}
			
			@Override
			public Color getBackground(Object element) {
				// TODO Auto-generated method stub
				/* if(((Employee) element).getEmpSalary() >= 50000) {
					
					return Display.getCurrent().getSystemColor(SWT.COLOR_RED);
					
				}*/
				return null;
			}
			
			@Override
			public Color getForeground(Object element) {
				// TODO Auto-generated method stub
				/*if(((Employee) element).getEmpSalary() <= 50000) {
					
					return Display.getCurrent().getSystemColor(SWT.COLOR_BLACK);
					
				}*/
				return null;
			}
			

		});

		column.setEditingSupport(new AbstractEditingSupport(v) {

			@Override
			protected Object getValue(Object element) {
				return (((Employee)element).getEmpId());
			}

			@Override
			protected void doSetValue(Object element, Object value) {
				
				String eId = ((String) value);
				((Employee) element).setEmpId(eId);
				
				
			}
			
			@Override
			public Color getBackground(Object element) {
				// TODO Auto-generated method stub
				 /*if(((Employee) element).getEmpSalary() >= 50000) {
					
					return Display.getCurrent().getSystemColor(SWT.COLOR_RED);
					
				}*/
				return null;
			}
			
			@Override
			public Color getForeground(Object element) {
				// TODO Auto-generated method stub
				/*if(((Employee) element).getEmpSalary() <= 50000) {
					
					return Display.getCurrent().getSystemColor(SWT.COLOR_BLACK);
					
				}*/
				return null;
			}
			


		});
		
		
		
		// create EmpName 
		column = createColumnFor(v, "EmpName");
		column.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				
				return ((Employee)element).getEmpName();
			}
			
			@Override
			public Color getBackground(Object element) {
				// TODO Auto-generated method stub
				 /*if(((Employee) element).getEmpSalary() >= 50000) {
					
					return Display.getCurrent().getSystemColor(SWT.COLOR_RED);
					
				}*/
				return null;
			}
			
			@Override
			public Color getForeground(Object element) {
				// TODO Auto-generated method stub
				/*if(((Employee) element).getEmpSalary() <= 50000) {
					
					return Display.getCurrent().getSystemColor(SWT.COLOR_BLACK);
					
				}*/
				return null;
			}
			


		});

		column.setEditingSupport(new AbstractEditingSupport(v) {

			@Override
			protected Object getValue(Object element) {
				return ((Employee)element).getEmpName();
			}

			@Override
			protected void doSetValue(Object element, Object value) {
				
				String name = (String) value;
				((Employee) element).setEmpName(name);
			}
			
			@Override
			public Color getBackground(Object element) {
				// TODO Auto-generated method stub
				 /*if(((Employee) element).getEmpSalary() >= 50000) {
					
					return Display.getCurrent().getSystemColor(SWT.COLOR_RED);
					
				}*/
				return null;
			}
			
			@Override
			public Color getForeground(Object element) {
				// TODO Auto-generated method stub
				/*if(((Employee) element).getEmpSalary() <= 50000) {
					
					return Display.getCurrent().getSystemColor(SWT.COLOR_BLACK);
					
				}*/
				return null;
			}
			


		});
		
		
		// create EmpAge
		column = createColumnFor(v, "EmpAge");
		column.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				return (((Employee)element).getEmpAge());
			}
			
			@Override
			public Color getBackground(Object element) {
				// TODO Auto-generated method stub
				 /*if(((Employee) element).getEmpSalary() >= 50000) {
					
					return Display.getCurrent().getSystemColor(SWT.COLOR_RED);
					
				}*/
				return null;
			}
			
			@Override
			public Color getForeground(Object element) {
				// TODO Auto-generated method stub
				/*if(((Employee) element).getEmpSalary() <= 50000) {
					
					return Display.getCurrent().getSystemColor(SWT.COLOR_BLACK);
					
				}*/
				return null;
			}
			


		});

		column.setEditingSupport(new AbstractEditingSupport(v) {

			@Override
			protected Object getValue(Object element) {
				return (((Employee)element).getEmpAge());
			}

			@Override
			protected void doSetValue(Object element, Object value) {
				
				//int age = Integer.parseInt((String) value) ;
				String age = ((String) value) ;

				((Employee) element).setEmpAge(age);
			}
			
			@Override
			public Color getBackground(Object element) {
				// TODO Auto-generated method stub
				/* if(((Employee) element).getEmpSalary() >= 50000) {
					
					return Display.getCurrent().getSystemColor(SWT.COLOR_RED);
					
				}*/
				return null;
			}
			
			@Override
			public Color getForeground(Object element) {
				// TODO Auto-generated method stub
				/*if(((Employee) element).getEmpSalary() <= 50000) {
					
					return Display.getCurrent().getSystemColor(SWT.COLOR_BLACK);
					
				}*/
				return null;
			}
			


		});
		
		
		
		// create EmpSalary
		column = createColumnFor(v, "EmpSalary");
		column.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				//return Double.toString(((Employee)element).getEmpSalary());
				return (((Employee)element).getEmpSalary());

			}
			
			@Override
			public Color getBackground(Object element) {
				// TODO Auto-generated method stub
				 /*if(((Employee) element).getEmpSalary() >= 50000) {
					
					return Display.getCurrent().getSystemColor(SWT.COLOR_RED);
					
				}*/
				return null;
			}
			
			@Override
			public Color getForeground(Object element) {
				// TODO Auto-generated method stub
				/*if(((Employee) element).getEmpSalary() <= 50000) {
					
					return Display.getCurrent().getSystemColor(SWT.COLOR_BLACK);
					
				}*/
				return null;
			}
			


		});

		column.setEditingSupport(new AbstractEditingSupport(v) {

			@Override
			protected Object getValue(Object element) {
				//return Double.toString(((Employee)element).getEmpSalary());
				return (((Employee)element).getEmpSalary());

			}

			@Override
			protected void doSetValue(Object element, Object value) {
						
				//Double salary = Double.parseDouble( (String) value);
				String salary = ( (String) value);

				((Employee) element).setEmpSalary(salary);
			}
			
			@Override
			public Color getBackground(Object element) {
				// TODO Auto-generated method stub
				/* if(((Employee) element).getEmpSalary() >= 50000) {
					
					return Display.getCurrent().getSystemColor(SWT.COLOR_RED);
					
				}*/
				return null;
			}
			
			@Override
			public Color getForeground(Object element) {
				// TODO Auto-generated method stub
				/*if(((Employee) element).getEmpSalary() <= 50000) {
					
					return Display.getCurrent().getSystemColor(SWT.COLOR_BLACK);
					
				}*/
				return null;
			}
			


		});
		
		
		// create EmpGender
		column = createColumnFor(v, "EmpGender");
		
		
		column.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				return ((Employee)element).getGender();
			}
			
			@Override
			public Color getBackground(Object element) {
				// TODO Auto-generated method stub
				 /*if(((Employee) element).getEmpSalary() >= 50000) {
					
					return Display.getCurrent().getSystemColor(SWT.COLOR_RED);
					
				}*/
				return null;
			}
			
			@Override
			public Color getForeground(Object element) {
				// TODO Auto-generated method stub
				/*if(((Employee) element).getEmpSalary() <= 50000) {
					
					return Display.getCurrent().getSystemColor(SWT.COLOR_BLACK);
					
				}*/
				return null;
			}
			


		}
		
		);

		column.setEditingSupport(new EditingSupport(v) {
			
			ComboBoxCellEditor genders;
			
			@Override
			protected void setValue(Object element, Object value) {
				// TODO Auto-generated method stub
	
				int mark = ((Integer) value).intValue() * 10;
				
				System.out.println(mark);
				
				if(mark == 0) {
					
					((Employee) element).setGender("Female");
					
				}else if(mark == 10) {
					
					((Employee) element).setGender("Male");
				}
				
				else {
					
					((Employee) element).setGender("others");
				}
				
				
				getViewer().update(element, null);
				
			}
			
			@Override
			protected Object getValue(Object element) {
				
				 return Integer.valueOf(((Employee) element).flag / 10);
				
			}
			
			

			@Override
			protected CellEditor getCellEditor(Object element) {
				// TODO Auto-generated method stub
				
				 genders = new ComboBoxCellEditor(v.getTable(), 
											new String[] {"Female", "Male", "others"});
					
						return genders;
				
			}

			@Override
			protected boolean canEdit(Object element) {
				// TODO Auto-generated method stub
				return true;
			}
			
			
		});
				
	
		// Insert data into table
		v.setInput(createModel());
		
		
		v.getTable().setLinesVisible(true);
		v.getTable().setHeaderVisible(true);
		
		Table table = v.getTable();
		
		table.addSelectionListener(new SelectionAdapter()
	    {               
	        @Override
	        public void widgetSelected(SelectionEvent event)
	        {
	        	
	        	TableItem[] items =  table.getItems();
	             ArrayList<Integer> selectedTableItemList=new ArrayList<Integer>();//Creating arraylist 

	            
	           System.out.println(event.item.getData());
	           
	           
	           try {
	        		  
					FileOutputStream fos = new FileOutputStream("C:\\Users\\PC\\Desktop\\emp.txt");
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					oos.writeObject(event.item.getData());
					System.out.println("Employee Details added successfully to file");
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	  
	        	 
	        	  
	            

	        }

	       
	    });
		
		
	}

	private TableViewerColumn createColumnFor(TableViewer viewer, String label) {
		
		TableViewerColumn column = new TableViewerColumn(viewer, SWT.NONE);
		column.getColumn().setWidth(200);
		column.getColumn().setText(label);
		column.getColumn().setMoveable(true);
		
		return column;
		
	}
	
	

	private Employee[] createModel() {
		
		return new Employee[] {
				
				new Employee("101", "Abhi", "22"," 55000.0", "Female"),
				new Employee("102", "Joshi", "33"," 60000.0", "male"),
				new Employee("103", "Mahi", "25", "28000.0", "male"),
				new Employee("104", "Nivi", "28", "75000.0", "Female"),
				new Employee("106", "Mehak", "42", "24000.0", "Female"),
				new Employee("106", "Ganan"," 44", "43000.0", "male"),
				new Employee("107", "Vihan", "34"," 53000.0", "Male"),
				new Employee("108", "Parli", "32", "36000.0", "Fenmale"),
				new Employee("109", "Chinmai", "25", "57000.0", "Female")
		};
	}

	@Override
	public Color getForeground(Object element, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getBackground(Object element, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
