package org.chico.uclm.teaw.figures;

import org.eclipse.draw2d.ImageFigure;

public class EmotionFigure extends ImageFigure {
	public EmotionFigure() {
		super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
			"images/emotion_arasaac128.png").createImage(), 0);
	}
}
