package org.chico.uclm.teaw.figures;

import org.eclipse.draw2d.ImageFigure;

public class EmotionChoiceFigure extends ImageFigure {
	public EmotionChoiceFigure() {
		super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
			"images/emochoice_arasaac128.png").createImage(), 0);
	}
}
