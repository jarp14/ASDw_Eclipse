package org.chico.uclm.teaw.figures;

import org.eclipse.draw2d.ImageFigure;

public class ActionFigure extends ImageFigure {
	public ActionFigure() {
		super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
			"images/action_arasaac128.png").createImage(), 0);
	}
}
