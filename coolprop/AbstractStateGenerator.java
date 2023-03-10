/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class AbstractStateGenerator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AbstractStateGenerator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AbstractStateGenerator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CoolPropJNI.delete_AbstractStateGenerator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AbstractState get_AbstractState(StringVector fluid_names) {
    long cPtr = CoolPropJNI.AbstractStateGenerator_get_AbstractState(swigCPtr, this, StringVector.getCPtr(fluid_names), fluid_names);
    return (cPtr == 0) ? null : new AbstractState(cPtr, false);
  }

}
