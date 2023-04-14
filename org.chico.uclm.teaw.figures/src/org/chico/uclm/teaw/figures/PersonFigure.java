package org.chico.uclm.teaw.figures;

import org.eclipse.draw2d.ImageFigure;

public class PersonFigure extends ImageFigure {
	public PersonFigure() {
		super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
			"images/person_arasaac128.png").createImage(), 0);
	}
}
