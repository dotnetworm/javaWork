/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class VectorOfStringVector extends java.util.AbstractList<StringVector> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected VectorOfStringVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VectorOfStringVector obj) {
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
        CoolPropJNI.delete_VectorOfStringVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public VectorOfStringVector(StringVector[] initialElements) {
    this();
    reserve(initialElements.length);

    for (StringVector element : initialElements) {
      add(element);
    }
  }

  public VectorOfStringVector(Iterable<StringVector> initialElements) {
    this();
    for (StringVector element : initialElements) {
      add(element);
    }
  }

  public StringVector get(int index) {
    return doGet(index);
  }

  public StringVector set(int index, StringVector e) {
    return doSet(index, e);
  }

  public boolean add(StringVector e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, StringVector e) {
    modCount++;
    doAdd(index, e);
  }

  public StringVector remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public VectorOfStringVector() {
    this(CoolPropJNI.new_VectorOfStringVector__SWIG_0(), true);
  }

  public VectorOfStringVector(VectorOfStringVector other) {
    this(CoolPropJNI.new_VectorOfStringVector__SWIG_1(VectorOfStringVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return CoolPropJNI.VectorOfStringVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    CoolPropJNI.VectorOfStringVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return CoolPropJNI.VectorOfStringVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    CoolPropJNI.VectorOfStringVector_clear(swigCPtr, this);
  }

  public VectorOfStringVector(int count, StringVector value) {
    this(CoolPropJNI.new_VectorOfStringVector__SWIG_2(count, StringVector.getCPtr(value), value), true);
  }

  private int doSize() {
    return CoolPropJNI.VectorOfStringVector_doSize(swigCPtr, this);
  }

  private void doAdd(StringVector x) {
    CoolPropJNI.VectorOfStringVector_doAdd__SWIG_0(swigCPtr, this, StringVector.getCPtr(x), x);
  }

  private void doAdd(int index, StringVector x) {
    CoolPropJNI.VectorOfStringVector_doAdd__SWIG_1(swigCPtr, this, index, StringVector.getCPtr(x), x);
  }

  private StringVector doRemove(int index) {
    return new StringVector(CoolPropJNI.VectorOfStringVector_doRemove(swigCPtr, this, index), true);
  }

  private StringVector doGet(int index) {
    return new StringVector(CoolPropJNI.VectorOfStringVector_doGet(swigCPtr, this, index), false);
  }

  private StringVector doSet(int index, StringVector val) {
    return new StringVector(CoolPropJNI.VectorOfStringVector_doSet(swigCPtr, this, index, StringVector.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    CoolPropJNI.VectorOfStringVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}