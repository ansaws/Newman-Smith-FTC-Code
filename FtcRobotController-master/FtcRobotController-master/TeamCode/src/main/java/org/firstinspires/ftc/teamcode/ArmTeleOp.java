package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public class ArmTeleOp extends OpMode {
    DcMotor armMotor;
    Servo clawServo;

    @Override
    public void init() {
        armMotor = hardwareMap.dcMotor.get("armMotor");
        clawServo = hardwareMap.servo.get("clawServo");
    }

    @Override
    public void loop()
    {

        //Close Claw
        if(gamepad1.right_trigger>0) {
            armMotor.setPower(gamepad1.right_trigger);
        }






        //Open Claw
        else if(gamepad1.left_trigger>0)
        {
            armMotor.setPower(-gamepad1.right_trigger);
        }


    }
}
