package org.chico.uclm.teaw.figures;

import org.eclipse.draw2d.ImageFigure;

public class PrizeFigure extends ImageFigure {
	public PrizeFigure() {
		super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
			"images/prize_arasaac64.png").createImage(), 0);
	}
}
