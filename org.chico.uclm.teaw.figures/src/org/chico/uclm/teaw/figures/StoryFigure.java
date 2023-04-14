package org.chico.uclm.teaw.figures;

import org.eclipse.draw2d.ImageFigure;

public class StoryFigure extends ImageFigure {
	public StoryFigure() {
		super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
			"images/story_arasaac64.png").createImage(), 0);
	}
}
