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

import teaw.diagram.edit.parts.ActionEditPart;
import teaw.diagram.edit.parts.PersonEditPart;
import teaw.diagram.edit.parts.PlaceEditPart;
import teaw.diagram.providers.TeawElementTypes;
import teaw.diagram.providers.TeawModelingAssistantProvider;

/**
 * @generated
 */
public class TeawModelingAssistantProviderOfPlaceEditPart extends TeawModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((PlaceEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(PlaceEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(TeawElementTypes.NormalLink_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((PlaceEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(PlaceEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof PersonEditPart) {
			types.add(TeawElementTypes.NormalLink_4001);
		}
		if (targetEditPart instanceof ActionEditPart) {
			types.add(TeawElementTypes.NormalLink_4001);
		}
		if (targetEditPart instanceof PlaceEditPart) {
			types.add(TeawElementTypes.NormalLink_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((PlaceEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(PlaceEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == TeawElementTypes.NormalLink_4001) {
			types.add(TeawElementTypes.Person_3003);
			types.add(TeawElementTypes.Action_3004);
			types.add(TeawElementTypes.Place_3005);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((PlaceEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(PlaceEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(TeawElementTypes.NormalLink_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((PlaceEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(PlaceEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == TeawElementTypes.NormalLink_4001) {
			types.add(TeawElementTypes.Person_3003);
			types.add(TeawElementTypes.Action_3004);
			types.add(TeawElementTypes.Place_3005);
		}
		return types;
	}

}
