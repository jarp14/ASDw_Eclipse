/**
 */
package teaw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emotion Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link teaw.EmotionChoice#getSource_url <em>Source url</em>}</li>
 *   <li>{@link teaw.EmotionChoice#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see teaw.TeawPackage#getEmotionChoice()
 * @model annotation="gmf.node figure='org.chico.uclm.teaw.figures.EmotionChoiceFigure' tool.name='Target emotion' tool.small.bundle='org.chico.uclm.teaw.figures' tool.large.path='images/emochoice_arasaac128.png' tool.small.path='images/emochoice_arasaac32.png' label.placement='none' resizable='false' size='128,128'"
 * @generated
 */
public interface EmotionChoice extends EmotionsNode {
	/**
	 * Returns the value of the '<em><b>Source url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source url</em>' attribute.
	 * @see #setSource_url(String)
	 * @see teaw.TeawPackage#getEmotionChoice_Source_url()
	 * @model
	 * @generated
	 */
	String getSource_url();

	/**
	 * Sets the value of the '{@link teaw.EmotionChoice#getSource_url <em>Source url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source url</em>' attribute.
	 * @see #getSource_url()
	 * @generated
	 */
	void setSource_url(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(Integer)
	 * @see teaw.TeawPackage#getEmotionChoice_Size()
	 * @model
	 * @generated
	 */
	Integer getSize();

	/**
	 * Sets the value of the '{@link teaw.EmotionChoice#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Integer value);

} // EmotionChoice
