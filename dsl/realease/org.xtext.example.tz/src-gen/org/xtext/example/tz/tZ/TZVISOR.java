/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.tz.tZ;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VISOR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.tz.tZ.TZVISOR#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.tz.tZ.TZVISOR#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.xtext.example.tz.tZ.TZVISOR#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.xtext.example.tz.tZ.TZVISOR#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.tz.tZ.TZPackage#getTZVISOR()
 * @model
 * @generated
 */
public interface TZVISOR extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.tz.tZ.TZPackage#getTZVISOR_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.tz.tZ.TZVISOR#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.tz.tZ.VARIABLES}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see org.xtext.example.tz.tZ.TZPackage#getTZVISOR_Variables()
   * @model containment="true"
   * @generated
   */
  EList<VARIABLES> getVariables();

  /**
   * Returns the value of the '<em><b>Constant</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.tz.tZ.CONSTANT}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' containment reference list.
   * @see org.xtext.example.tz.tZ.TZPackage#getTZVISOR_Constant()
   * @model containment="true"
   * @generated
   */
  EList<CONSTANT> getConstant();

  /**
   * Returns the value of the '<em><b>Module</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.tz.tZ.MODULE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' containment reference list.
   * @see org.xtext.example.tz.tZ.TZPackage#getTZVISOR_Module()
   * @model containment="true"
   * @generated
   */
  EList<MODULE> getModule();

} // TZVISOR
