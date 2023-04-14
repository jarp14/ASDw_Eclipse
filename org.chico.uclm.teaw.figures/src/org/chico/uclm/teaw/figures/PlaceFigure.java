package org.chico.uclm.teaw.figures;

import org.eclipse.draw2d.ImageFigure;

public class PlaceFigure extends ImageFigure {
	public PlaceFigure() {
		super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
			"images/place_arasaac128.png").createImage(), 0);
	}
}
