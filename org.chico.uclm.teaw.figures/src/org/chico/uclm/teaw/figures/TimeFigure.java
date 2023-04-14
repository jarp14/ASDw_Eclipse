package org.chico.uclm.teaw.figures;

import org.eclipse.draw2d.ImageFigure;

public class TimeFigure extends ImageFigure {
	public TimeFigure() {
		super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
			"images/time_arasaac64.png").createImage(), 0);
	}
}
