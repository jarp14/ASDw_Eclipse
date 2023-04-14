/**
 */
package teaw.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import teaw.Picto;
import teaw.TeawPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Picto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link teaw.impl.PictoImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link teaw.impl.PictoImpl#getImage_url <em>Image url</em>}</li>
 *   <li>{@link teaw.impl.PictoImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PictoImpl extends PlanningNodeImpl implements Picto {
	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected Integer order = ORDER_EDEFAULT;

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
	protected PictoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeawPackage.Literals.PICTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(Integer newOrder) {
		Integer oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeawPackage.PICTO__ORDER, oldOrder, order));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TeawPackage.PICTO__IMAGE_URL, oldImage_url, image_url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TeawPackage.PICTO__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TeawPackage.PICTO__ORDER:
				return getOrder();
			case TeawPackage.PICTO__IMAGE_URL:
				return getImage_url();
			case TeawPackage.PICTO__SIZE:
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
			case TeawPackage.PICTO__ORDER:
				setOrder((Integer)newValue);
				return;
			case TeawPackage.PICTO__IMAGE_URL:
				setImage_url((String)newValue);
				return;
			case TeawPackage.PICTO__SIZE:
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
			case TeawPackage.PICTO__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case TeawPackage.PICTO__IMAGE_URL:
				setImage_url(IMAGE_URL_EDEFAULT);
				return;
			case TeawPackage.PICTO__SIZE:
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
			case TeawPackage.PICTO__ORDER:
				return ORDER_EDEFAULT == null ? order != null : !ORDER_EDEFAULT.equals(order);
			case TeawPackage.PICTO__IMAGE_URL:
				return IMAGE_URL_EDEFAULT == null ? image_url != null : !IMAGE_URL_EDEFAULT.equals(image_url);
			case TeawPackage.PICTO__SIZE:
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
		result.append(" (order: ");
		result.append(order);
		result.append(", image_url: ");
		result.append(image_url);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //PictoImpl
