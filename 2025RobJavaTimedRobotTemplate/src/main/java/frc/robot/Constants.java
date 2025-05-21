// Filename: Constants.java

package frc.robot;

public class Constants {
    public static class OperatorConstants {
      public static final int kDriverControllerPort = 0;
    }

    /*
     * Constants for the Can Bus ID. A negative 1 indicates a unused ID.
     * Most, if not all of these -1 assignments are from the 2024 version
     * of the code.
     */

    public static class CanBusID {
      public static final int kGripper       = -1;
      public static final int kShoulderJoint = -1;
      public static final int kWristJoint    = -1;
      public static final int kLeftSimA      =  1;
      public static final int kLeftSimB      = -1;
      public static final int kRightSimA     =  2;
      public static final int kRightSimB     = -1;
    }

    /*
     * Joystick port IDs
     */
    
     public static class JoystickPortID {
      public static final int kLeftJoystick  = 0;
      public static final int kRightJoystick = 1;
      public static final int kArmJoystick   = 2;
     }

     /*
      * Default Velocity +/- for the gripper
      * Left over from the 2024 version of the code leaving
      * it here since it won't cause any harm.
      */

      public static class Gripper {
        public static final double kGripperVelocity = 0.0;
      }

      /*
       * Will see about having this variable explicitely set to true
       * for simulation mode. Will need to set false for the real
       * robot.
       */

      public static class SimulationMode {
        public static Boolean simulate = true;
      }
      
}
