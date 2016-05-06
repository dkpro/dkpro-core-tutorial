
/* First created by JCasGen Wed Nov 04 19:20:14 CET 2015 */
package de.tudarmstadt.ukp.tutorial.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Nov 04 19:20:14 CET 2015
 * @generated */
public class Location_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Location_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Location_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Location(addr, Location_Type.this);
  			   Location_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Location(addr, Location_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Location.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.tudarmstadt.ukp.tutorial.types.Location");
 
  /** @generated */
  final Feature casFeat_Country;
  /** @generated */
  final int     casFeatCode_Country;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCountry(int addr) {
        if (featOkTst && casFeat_Country == null)
      jcas.throwFeatMissing("Country", "de.tudarmstadt.ukp.tutorial.types.Location");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Country);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCountry(int addr, String v) {
        if (featOkTst && casFeat_Country == null)
      jcas.throwFeatMissing("Country", "de.tudarmstadt.ukp.tutorial.types.Location");
    ll_cas.ll_setStringValue(addr, casFeatCode_Country, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Location_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Country = jcas.getRequiredFeatureDE(casType, "Country", "uima.cas.String", featOkTst);
    casFeatCode_Country  = (null == casFeat_Country) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Country).getCode();

  }
}



    