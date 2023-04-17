package org.chico.uclm.teaw.figures;

import java.io.File;
import java.util.HashMap;

//import org.eclipse.core.resources.IFile;
//import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;

public class PersonFigure extends ImageFigure {
	static Image unspecified = null;

	  public PersonFigure() {
	      if (unspecified == null) {
	    	  unspecified = ImageDescriptor.createFromURL(
	               FileLocator.find(
	                       Platform.getBundle(Activator.PLUGIN_ID),
	                       new Path("images/person_arasaac128.png"), 
	                       new HashMap())).createImage();
	      }
	  }

	  public static Image createImage(String imagePath) {
	      try {
//	          IFile res = (IFile)ResourcesPlugin.getWorkspace().getRoot().
	                     //          findMember(new Path(imagePath));
	          File file = new File(imagePath);
	          ImageData data = ImageDescriptor.createFromURL(file.toURI().toURL()).createImage().getImageData();
	          ImageData scaledData = data.scaledTo(128, 128);
	          
	          return new Image(null, scaledData);
	      }
	      catch (Exception ex) {
	          return unspecified;
	      }
	  }

	  public void setImagePath(String imagePath) {
	      try {
	          if (getImage() != null && getImage() != unspecified) {
	              getImage().dispose();
	          }

	          this.setImage(createImage(imagePath));
//	          Dimension x = new Dimension(128,128);
//	          this.setMaximumSize(x);
//	          this.setSize(x);
//	          this.setPreferredSize(x);
	      }
	      catch (Exception ex) {
	          ex.printStackTrace();
	      }
	  }
}
