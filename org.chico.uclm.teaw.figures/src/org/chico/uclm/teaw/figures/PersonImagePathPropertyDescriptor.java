package org.chico.uclm.teaw.figures;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.gmf.runtime.emf.ui.properties.descriptors.EMFCompositeSourcePropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;

public class PersonImagePathPropertyDescriptor extends EMFCompositeSourcePropertyDescriptor {

	public PersonImagePathPropertyDescriptor(Object object,
	          IItemPropertyDescriptor itemPropertyDescriptor, String category) {
		super(object, itemPropertyDescriptor, category);
	}

	  protected CellEditor doCreateEditor(Composite composite) {
	      try {
	          if (((EAttribute) getFeature()).getName().equals("imagePath")) {
	              return new PersonImagePathCellEditor(composite);
	          }
	      }
	      catch (Exception ex){}
	      return super.doCreateEditor(composite);
	  }
}
