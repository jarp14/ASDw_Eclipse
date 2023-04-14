/**
 */
package teaw.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import teaw.Emotion;
import teaw.TeawPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emotion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link teaw.impl.EmotionImpl#getImage_url <em>Image url</em>}</li>
 *   <li>{@link teaw.impl.EmotionImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmotionImpl extends EmotionsNodeImpl implements Emotion {
	/**
	 * The default value of the '{@link #getImage_url() <em>Image url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_url()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage_url() <em>Image url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_url()
	 * @generated
	 * @ordered
	 */
	protected String image_url = IMAGE_URL_EDEFAULT;

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
	protected EmotionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeawPackage.Literals.EMOTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImage_url() {
		return image_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage_url(String newImage_url) {
		String oldImage_url = image_url;
		image_url = newImage_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeawPackage.EMOTION__IMAGE_URL, oldImage_url, image_url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TeawPackage.EMOTION__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TeawPackage.EMOTION__IMAGE_URL:
				return getImage_url();
			case TeawPackage.EMOTION__SIZE:
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
			case TeawPackage.EMOTION__IMAGE_URL:
				setImage_url((String)newValue);
				return;
			case TeawPackage.EMOTION__SIZE:
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
			case TeawPackage.EMOTION__IMAGE_URL:
				setImage_url(IMAGE_URL_EDEFAULT);
				return;
			case TeawPackage.EMOTION__SIZE:
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
			case TeawPackage.EMOTION__IMAGE_URL:
				return IMAGE_URL_EDEFAULT == null ? image_url != null : !IMAGE_URL_EDEFAULT.equals(image_url);
			case TeawPackage.EMOTION__SIZE:
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
		result.append(" (image_url: ");
		result.append(image_url);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //EmotionImpl
