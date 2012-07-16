/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package cvg.sfmPipeline.calibration;

public class MutualCalibration {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public MutualCalibration(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(MutualCalibration obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CalibrationJNI.delete_MutualCalibration(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MutualCalibration(long heightImage, long widthImage, long heightBoard, long widthBoard, boolean useOpenCVCorner, boolean useOpenCVCalibration, boolean useOnlyIMUGravity, boolean useChessboardHorizontal, boolean useRANSAC) {
    this(CalibrationJNI.new_MutualCalibration__SWIG_0(heightImage, widthImage, heightBoard, widthBoard, useOpenCVCorner, useOpenCVCalibration, useOnlyIMUGravity, useChessboardHorizontal, useRANSAC), true);
  }

  public MutualCalibration(long heightImage, long widthImage, long heightBoard, long widthBoard, boolean useOpenCVCorner, boolean useOpenCVCalibration, boolean useOnlyIMUGravity, boolean useChessboardHorizontal) {
    this(CalibrationJNI.new_MutualCalibration__SWIG_1(heightImage, widthImage, heightBoard, widthBoard, useOpenCVCorner, useOpenCVCalibration, useOnlyIMUGravity, useChessboardHorizontal), true);
  }

  public MutualCalibration(long heightImage, long widthImage, long heightBoard, long widthBoard, boolean useOpenCVCorner, boolean useOpenCVCalibration, boolean useOnlyIMUGravity) {
    this(CalibrationJNI.new_MutualCalibration__SWIG_2(heightImage, widthImage, heightBoard, widthBoard, useOpenCVCorner, useOpenCVCalibration, useOnlyIMUGravity), true);
  }

  public MutualCalibration(long heightImage, long widthImage, long heightBoard, long widthBoard, boolean useOpenCVCorner, boolean useOpenCVCalibration) {
    this(CalibrationJNI.new_MutualCalibration__SWIG_3(heightImage, widthImage, heightBoard, widthBoard, useOpenCVCorner, useOpenCVCalibration), true);
  }

  public MutualCalibration(long heightImage, long widthImage, long heightBoard, long widthBoard, boolean useOpenCVCorner) {
    this(CalibrationJNI.new_MutualCalibration__SWIG_4(heightImage, widthImage, heightBoard, widthBoard, useOpenCVCorner), true);
  }

  public MutualCalibration(long heightImage, long widthImage, long heightBoard, long widthBoard) {
    this(CalibrationJNI.new_MutualCalibration__SWIG_5(heightImage, widthImage, heightBoard, widthBoard), true);
  }

  public boolean tryAddingChessboardImage(long inputImage, long outputImage) {
    return CalibrationJNI.MutualCalibration_tryAddingChessboardImage(swigCPtr, this, (inputImage), (outputImage));
  }

  public void addFullIMURotationByQuaternion(double r0, double r1, double r2) {
    CalibrationJNI.MutualCalibration_addFullIMURotationByQuaternion(swigCPtr, this, r0, r1, r2);
  }

  public void addIMUGravityVector(double g1, double g2, double g3) {
    CalibrationJNI.MutualCalibration_addIMUGravityVector(swigCPtr, this, g1, g2, g3);
  }

  public long getNumberOfImages() {
    return CalibrationJNI.MutualCalibration_getNumberOfImages(swigCPtr, this);
  }

  public void getRotationMatrix(double[] p) {
    CalibrationJNI.MutualCalibration_getRotationMatrix(swigCPtr, this, p);
  }

  public SWIGTYPE_p_std__vectorT_size_t_t randPerm(long n) {
    return new SWIGTYPE_p_std__vectorT_size_t_t(CalibrationJNI.MutualCalibration_randPerm(swigCPtr, this, n), true);
  }

  public void calibrateCamera() {
    CalibrationJNI.MutualCalibration_calibrateCamera(swigCPtr, this);
  }

  public void ransacMutualCalibrateWithHorizontalChessboard() {
    CalibrationJNI.MutualCalibration_ransacMutualCalibrateWithHorizontalChessboard(swigCPtr, this);
  }

  public void lsMutualCalibrateWithHorizontalChessboard() {
    CalibrationJNI.MutualCalibration_lsMutualCalibrateWithHorizontalChessboard(swigCPtr, this);
  }

  public void mutualCalibrate() {
    CalibrationJNI.MutualCalibration_mutualCalibrate(swigCPtr, this);
  }

}