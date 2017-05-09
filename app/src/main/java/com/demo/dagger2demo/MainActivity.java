package com.demo.dagger2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private VehicleComponent mVehicleComponent;

    @Inject
    Motor mMotor;

    public MainActivity() {

        mVehicleComponent = DaggerVehicleComponent.builder()
                .vehicleModule(new VehicleModule())
                .build();

        mVehicleComponent.inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("dbg", "Motor rpm = " + mMotor.getRpm());
        setContentView(R.layout.activity_main);
    }
}
