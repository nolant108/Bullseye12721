// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final int MOTOR_LEFT_FRONT = 1;
    public static final int MOTOR_LEFT_BACK = 2;
    public static final int MOTOR_RIGHT_FRONT = 3;
    public static final int MOTOR_RIGHT_BACK = 4;
    
    public static final double OPEN_LEFT_LOOP_RATE = 0.5;
    public static final double OPEN_RIGHT_LOOP_RATE = 0.5;

    public static final int DRIVER_JOYSTICK_LEFT = 2;
    public static final int DRIVER_JOYSTICK_RIGHT = 3;

    public static final int OPERATOR_CONTROLLER = 1;
}
