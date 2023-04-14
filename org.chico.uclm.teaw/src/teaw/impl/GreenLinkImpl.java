/**
 */
package teaw.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import teaw.Emotion;
import teaw.EmotionChoice;
import teaw.GreenLink;
import teaw.TeawPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Green Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link teaw.impl.GreenLinkImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link teaw.impl.GreenLinkImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GreenLinkImpl extends LinkImpl implements GreenLink {
	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Emotion origin;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EmotionChoice target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GreenLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeawPackage.Literals.GREEN_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Emotion getOrigin() {
		if (origin != null && origin.eIsProxy()) {
			InternalEObject oldOrigin = (InternalEObject)origin;
			origin = (Emotion)eResolveProxy(oldOrigin);
			if (origin != oldOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TeawPackage.GREEN_LINK__ORIGIN, oldOrigin, origin));
			}
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emotion basicGetOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigin(Emotion newOrigin) {
		Emotion oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeawPackage.GREEN_LINK__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmotionChoice getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (EmotionChoice)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TeawPackage.GREEN_LINK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmotionChoice basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(EmotionChoice newTarget) {
		EmotionChoice oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeawPackage.GREEN_LINK__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TeawPackage.GREEN_LINK__ORIGIN:
				if (resolve) return getOrigin();
				return basicGetOrigin();
			case TeawPackage.GREEN_LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TeawPackage.GREEN_LINK__ORIGIN:
				setOrigin((Emotion)newValue);
				return;
			case TeawPackage.GREEN_LINK__TARGET:
				setTarget((EmotionChoice)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TeawPackage.GREEN_LINK__ORIGIN:
				setOrigin((Emotion)null);
				return;
			case TeawPackage.GREEN_LINK__TARGET:
				setTarget((EmotionChoice)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TeawPackage.GREEN_LINK__ORIGIN:
				return origin != null;
			case TeawPackage.GREEN_LINK__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //GreenLinkImpl
