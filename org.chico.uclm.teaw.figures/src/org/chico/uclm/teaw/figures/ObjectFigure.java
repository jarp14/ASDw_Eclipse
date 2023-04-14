package org.chico.uclm.teaw.figures;

import org.eclipse.draw2d.ImageFigure;

public class ObjectFigure extends ImageFigure {
	public ObjectFigure() {
		super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
			"images/object_arasaac64.png").createImage(), 0);
	}
}
