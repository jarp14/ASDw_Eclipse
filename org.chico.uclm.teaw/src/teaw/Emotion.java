/**
 */
package teaw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emotion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link teaw.Emotion#getImage_url <em>Image url</em>}</li>
 *   <li>{@link teaw.Emotion#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see teaw.TeawPackage#getEmotion()
 * @model annotation="gmf.node figure='org.chico.uclm.teaw.figures.EmotionFigure' tool.name='Response option' tool.small.bundle='org.chico.uclm.teaw.figures' tool.large.path='images/emotion_arasaac128.png' tool.small.path='images/emotion_arasaac32.png' label.placement='none' resizable='false' size='128,128'"
 * @generated
 */
public interface Emotion extends EmotionsNode {
	/**
	 * Returns the value of the '<em><b>Image url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image url</em>' attribute.
	 * @see #setImage_url(String)
	 * @see teaw.TeawPackage#getEmotion_Image_url()
	 * @model
	 * @generated
	 */
	String getImage_url();

	/**
	 * Sets the value of the '{@link teaw.Emotion#getImage_url <em>Image url</em>}' attribute.
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
	 * @see teaw.TeawPackage#getEmotion_Size()
	 * @model
	 * @generated
	 */
	Integer getSize();

	/**
	 * Sets the value of the '{@link teaw.Emotion#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Integer value);

} // Emotion
