/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public final class fluid_types {
  public final static fluid_types FLUID_TYPE_PURE = new fluid_types("FLUID_TYPE_PURE");
  public final static fluid_types FLUID_TYPE_PSEUDOPURE = new fluid_types("FLUID_TYPE_PSEUDOPURE");
  public final static fluid_types FLUID_TYPE_REFPROP = new fluid_types("FLUID_TYPE_REFPROP");
  public final static fluid_types FLUID_TYPE_INCOMPRESSIBLE_LIQUID = new fluid_types("FLUID_TYPE_INCOMPRESSIBLE_LIQUID");
  public final static fluid_types FLUID_TYPE_INCOMPRESSIBLE_SOLUTION = new fluid_types("FLUID_TYPE_INCOMPRESSIBLE_SOLUTION");
  public final static fluid_types FLUID_TYPE_UNDEFINED = new fluid_types("FLUID_TYPE_UNDEFINED");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static fluid_types swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + fluid_types.class + " with value " + swigValue);
  }

  private fluid_types(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private fluid_types(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private fluid_types(String swigName, fluid_types swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static fluid_types[] swigValues = { FLUID_TYPE_PURE, FLUID_TYPE_PSEUDOPURE, FLUID_TYPE_REFPROP, FLUID_TYPE_INCOMPRESSIBLE_LIQUID, FLUID_TYPE_INCOMPRESSIBLE_SOLUTION, FLUID_TYPE_UNDEFINED };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

