/*
* 
*/
package teaw.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import teaw.diagram.providers.TeawElementTypes;

/**
 * @generated
 */
public class GreenLinkItemSemanticEditPolicy extends TeawBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GreenLinkItemSemanticEditPolicy() {
		super(TeawElementTypes.GreenLink_4003);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
