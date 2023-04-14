/**
 */
package teaw.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import teaw.EmotionChoice;
import teaw.TeawPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emotion Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link teaw.impl.EmotionChoiceImpl#getSource_url <em>Source url</em>}</li>
 *   <li>{@link teaw.impl.EmotionChoiceImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmotionChoiceImpl extends EmotionsNodeImpl implements EmotionChoice {
	/**
	 * The default value of the '{@link #getSource_url() <em>Source url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource_url()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource_url() <em>Source url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource_url()
	 * @generated
	 * @ordered
	 */
	protected String source_url = SOURCE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Integer size = SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmotionChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeawPackage.Literals.EMOTION_CHOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource_url() {
		return source_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource_url(String newSource_url) {
		String oldSource_url = source_url;
		source_url = newSource_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeawPackage.EMOTION_CHOICE__SOURCE_URL, oldSource_url, source_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(Integer newSize) {
		Integer oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeawPackage.EMOTION_CHOICE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TeawPackage.EMOTION_CHOICE__SOURCE_URL:
				return getSource_url();
			case TeawPackage.EMOTION_CHOICE__SIZE:
				return getSize();
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
			case TeawPackage.EMOTION_CHOICE__SOURCE_URL:
				setSource_url((String)newValue);
				return;
			case TeawPackage.EMOTION_CHOICE__SIZE:
				setSize((Integer)newValue);
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
			case TeawPackage.EMOTION_CHOICE__SOURCE_URL:
				setSource_url(SOURCE_URL_EDEFAULT);
				return;
			case TeawPackage.EMOTION_CHOICE__SIZE:
				setSize(SIZE_EDEFAULT);
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
			case TeawPackage.EMOTION_CHOICE__SOURCE_URL:
				return SOURCE_URL_EDEFAULT == null ? source_url != null : !SOURCE_URL_EDEFAULT.equals(source_url);
			case TeawPackage.EMOTION_CHOICE__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (source_url: ");
		result.append(source_url);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //EmotionChoiceImpl
