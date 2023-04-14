/*
 * 
 */
package teaw.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import teaw.diagram.edit.parts.EmotionChoiceEditPart;
import teaw.diagram.edit.parts.EmotionEditPart;
import teaw.diagram.providers.TeawElementTypes;
import teaw.diagram.providers.TeawModelingAssistantProvider;

/**
 * @generated
 */
public class TeawModelingAssistantProviderOfEmotionChoiceEditPart extends TeawModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((EmotionChoiceEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(EmotionChoiceEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(TeawElementTypes.RedLink_4002);
		types.add(TeawElementTypes.GreenLink_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((EmotionChoiceEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(EmotionChoiceEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == TeawElementTypes.RedLink_4002) {
			types.add(TeawElementTypes.Emotion_3002);
		} else if (relationshipType == TeawElementTypes.GreenLink_4003) {
			types.add(TeawElementTypes.Emotion_3002);
		}
		return types;
	}

}
