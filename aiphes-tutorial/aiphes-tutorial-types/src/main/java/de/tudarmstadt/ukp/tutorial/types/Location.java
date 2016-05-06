

/* First created by JCasGen Wed Nov 04 19:20:14 CET 2015 */
package de.tudarmstadt.ukp.tutorial.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Nov 04 19:20:14 CET 2015
 * XML source: C:/Users/pedro/Documents/GitHub/dkpro-core-tutorial/h_da-tutorial/h_da-tutorial-types/src/main/resources/de/tudarmstadt/ukp/tutorial/types/typeSystemDescriptor.xml
 * @generated */
public class Location extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Location.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Location() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Location(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Location(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Location(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: Country

  /** getter for Country - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCountry() {
    if (Location_Type.featOkTst && ((Location_Type)jcasType).casFeat_Country == null)
      jcasType.jcas.throwFeatMissing("Country", "de.tudarmstadt.ukp.tutorial.types.Location");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Location_Type)jcasType).casFeatCode_Country);}
    
  /** setter for Country - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCountry(String v) {
    if (Location_Type.featOkTst && ((Location_Type)jcasType).casFeat_Country == null)
      jcasType.jcas.throwFeatMissing("Country", "de.tudarmstadt.ukp.tutorial.types.Location");
    jcasType.ll_cas.ll_setStringValue(addr, ((Location_Type)jcasType).casFeatCode_Country, v);}    
  }

    