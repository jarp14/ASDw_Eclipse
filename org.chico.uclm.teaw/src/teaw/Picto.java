/**
 */
package teaw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Picto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link teaw.Picto#getOrder <em>Order</em>}</li>
 *   <li>{@link teaw.Picto#getImage_url <em>Image url</em>}</li>
 *   <li>{@link teaw.Picto#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see teaw.TeawPackage#getPicto()
 * @model
 * @generated
 */
public interface Picto extends PlanningNode {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(Integer)
	 * @see teaw.TeawPackage#getPicto_Order()
	 * @model
	 * @generated
	 */
	Integer getOrder();

	/**
	 * Sets the value of the '{@link teaw.Picto#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Integer value);

	/**
	 * Returns the value of the '<em><b>Image url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image url</em>' attribute.
	 * @see #setImage_url(String)
	 * @see teaw.TeawPackage#getPicto_Image_url()
	 * @model
	 * @generated
	 */
	String getImage_url();

	/**
	 * Sets the value of the '{@link teaw.Picto#getImage_url <em>Image url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image url</em>' attribute.
	 * @see #getImage_url()
	 * @generated
	 */
	void setImage_url(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(Integer)
	 * @see teaw.TeawPackage#getPicto_Size()
	 * @model
	 * @generated
	 */
	Integer getSize();

	/**
	 * Sets the value of the '{@link teaw.Picto#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Integer value);

} // Picto
