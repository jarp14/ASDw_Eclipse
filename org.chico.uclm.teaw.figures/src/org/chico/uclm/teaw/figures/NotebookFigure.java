package org.chico.uclm.teaw.figures;

import org.eclipse.draw2d.ImageFigure;

public class NotebookFigure extends ImageFigure {
	public NotebookFigure() {
		super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
			"images/notebook_arasaac64.png").createImage(), 0);
	}
}
