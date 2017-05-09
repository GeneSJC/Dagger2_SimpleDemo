package com.demo.dagger2demo;

import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    void inject(MainActivity mainActivity);
}
