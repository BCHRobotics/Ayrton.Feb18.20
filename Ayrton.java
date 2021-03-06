/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auto;

import com.kauailabs.navx.frc.AHRS;

import frc.robot.subsystems.Drivetrain;

    /**
    * @author Ayrton Mercer. 
    */
    public class Ayrton {

    private AutoCommands mAutoCommands;
    private AHRS ahrs;
    private Drivetrain mDrivetrain;

    public Ayrton(AutoCommands mAutoCommands, AHRS ahrs, Drivetrain mDrivetrain){
        this.mAutoCommands = mAutoCommands;
        this.ahrs = ahrs;
        this.mDrivetrain = mDrivetrain;
    }
 
    /**
    * 1: Drive straight 12 inches.
    * 2: Turn 12 degrees. 
    * 3: Drive straight 221.8 inches.
    * 4: Turn 78 degrees 
    * 5: Shoot the 3 balls.
    * 6: Turn 156.6 degrees.
    * 7: Drive straight 48 inches.
    * 8:Turn another 28 degrees.
    * 9: Drive straight 240 inches.
    * 10: Turn 41.9 degrees.
    * 11: Drive straight 80 inches.
    * 12: Turn 48 degrees.  
    */
    public void start1LowHome(){
        
        ahrs.reset();
        mDrivetrain.resetEncoders();

        try{
            Thread.sleep(1000);
        }  catch(Exception e){
            //Do Nothing
        }
        mAutoCommands.straightDrive(12, -0.004, 0.005, 2, 200, 1500);
        mAutoCommands.gyroTurn(12, 0.005, 2, 125, 1500);
        mAutoCommands.straightDrive(221.8, -0.004, 0.005, 2, 200, 1500);
        mAutoCommands.gyroTurn(78, 0.005, 2, 125, 1500);
        //Shoot Now
        try{
            Thread.sleep(500);
        } catch(Exception e){
            //Don't Sleep
        }
        mAutoCommands.gyroTurn(156.6, 0.005, 2, 125, 1500);
        mAutoCommands.straightDrive(48, -0.004, 0.005, 2, 200, 1500);
        mAutoCommands.gyroTurn(28, 0.005, 1, 125, 500);
        mAutoCommands.straightDrive(240, -0.004, 0.005, 125, 200, 1000);
        mAutoCommands.gyroTurn(41.9, 0.005, 2, 125, 1500);
        mAutoCommands.straightDrive(80, -0.004, 0.005, 125, 200, 1000);
        mAutoCommands.gyroTurn(48, 0.005, 2, 125, 1000);
    }

    /**
    * 1: Drive straight -48 inches.
    * 2: Shoot the 3 balls.
    * 3: Turn 66 degrees.
    * 4: Drive straight 48 inches.
    * 5:Turn another 28 degrees.
    * 6: Drive straight 240 inches.
    * 7: Turn 41.9 degrees.
    * 8: Drive straight 80 inches.
    * 9: Turn 48 degrees. 
    */
    public void start2HighHome(){

        ahrs.reset();
        mDrivetrain.resetEncoders();
      
        mAutoCommands.straightDrive(-48, -0.004, 0.005, 2, 200, 2500);
        //Shoot Now
        try{
            Thread.sleep(500);
        } catch(Exception e){
            //Don't Sleep
        }
        mAutoCommands.gyroTurn(66, 0.005, 2, 125, 1500);
        mAutoCommands.straightDrive(48, -0.004, 0.005, 2, 200, 1500);
        mAutoCommands.gyroTurn(28, 0.005, 1, 125, 500);
        mAutoCommands.straightDrive(240, -0.004, 0.005, 125, 200, 1000);
        mAutoCommands.gyroTurn(41.9, 0.005, 2, 125, 1500);
        mAutoCommands.straightDrive(80, -0.004, 0.005, 125, 200, 1000);
        mAutoCommands.gyroTurn(48, 0.005, 2, 125, 1000);
    }

    /**
    * 1: Drive straight -80 inches.
    * 2: Shoot the 3 balls.  
    * 3: Turn 66.6 degrees.
    * 4: Drive straight 168.5 inches.
    * 5: Turn 23.4 degrees 
    */
    public void start2LowTrench(){

        ahrs.reset();
        mDrivetrain.resetEncoders();

        mAutoCommands.straightDrive(-80, -0.004, 0.005, 2, 200, 2500);
        //Shoot Now
        try{
            Thread.sleep(500);
        } catch(Exception e){
            //Don't Sleep
        }
        mAutoCommands.gyroTurn(66.6, 0.005, 2, 125, 2000);
        mAutoCommands.straightDrive(168.5, -0.004, 0.005, 2, 200, 2500);
        mAutoCommands.gyroTurn(23.4, 0.005, 2, 100, 500);
    }

    /** 
    * 1: Drive straight -80 inches.
    * 2: Shoot the 3 balls.
    * 3: Turn 66.6 degrees.
    * 4: Drive straight 48 inches.
    * 5:Turn another 28 degrees.
    * 6: Drive straight 240 inches.
    * 7: Turn 41.9 degrees.
    * 8: Drive straight 80 inches.
    * 9: Turn 48 degrees. 
    */
    public void start2LowHome(){

        ahrs.reset();
        mDrivetrain.resetEncoders();

        mAutoCommands.straightDrive(-80, -0.004, 0.005, 2, 200, 2500);
        //Shoot Now
        try{
            Thread.sleep(500);
        } catch(Exception e){
            //Don't Sleep
        }
        mAutoCommands.gyroTurn(66.6, 0.005, 2, 125, 1500);
        mAutoCommands.straightDrive(48, -0.004, 0.005, 2, 200, 1500);
        mAutoCommands.gyroTurn(28, 0.005, 1, 125, 500);
        mAutoCommands.straightDrive(240, -0.004, 0.005, 125, 200, 1000);
        mAutoCommands.gyroTurn(41.9, 0.005, 2, 125, 1500);
        mAutoCommands.straightDrive(80, -0.004, 0.005, 125, 200, 1000);
        mAutoCommands.gyroTurn(48, 0.005, 2, 125, 1000);
    }

    /** 
    * 1: Drive straight 12 inches.
    * 2: Turn 44 degrees.
    * 3: Drive straight 115 inches. 
    * 4: Turn 46 degrees.
    * 5: Shoot the 3 balls.
    * 6: Turn 61 degrees
    * 7: Drive straight 188 inches
    * 8: Turn 29 degrees
    */
    public void start3LowRendezVous(){
       
        ahrs.reset();
        mDrivetrain.resetEncoders();

        try{
            Thread.sleep(1000);
        }  catch(Exception e){
            //Do Nothing
        }
        mAutoCommands.straightDrive(12, 0.005, 0.5, 2, 200, 1500);
        mAutoCommands.gyroTurn(44, -0.004, 0.005, 0.5, 1000);
        mAutoCommands.straightDrive(115, 0.005, 0.5, 2, 200, 1500);
        mAutoCommands.gyroTurn(46, -0.004, 0.005, 0.5, 1000);
        //Shoot Now
        try{
            Thread.sleep(500);
        } catch(Exception e){
            //Don't Sleep
        }
        mAutoCommands.gyroTurn(61, 0.005, 3, 200, 1000);
        mAutoCommands.straightDrive(188, -0.004, 0.005, 2, 200, 2000);
        mAutoCommands.gyroTurn(29, 0.005, 3, 100, 500);
    }
}