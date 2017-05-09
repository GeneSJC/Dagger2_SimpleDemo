# Dagger2_SimpleDemo

This is a super basic demo.  The only way to verify is to look at the log output; 
specifically for this message: `Motor rpm = 990`

This shows that the `@Inject` is working, because `Motor.java` has the `rpm` instance member hard-coded to `990`.  Change that value to verify the setup here is working correctly.

Main points:

1. Define the class you want to inject.  To demonstrate the concept in the simplest mannner, start with an empty constructor

2. Add the `@Component` class; here it is `VehicleComponent.java`. Observe the `inject(MainActivity ..)` .  Any class that wants to use `@Inject` - should declare a corresponding `inject(..)` method.

3. Add the `@Module` class with a `providesXyz()` accessor for each object you want to inject

4. Here's the tricky part:
 - First do all of the above steps
 - Then rebuild the project
 - If all goes well/correct - `DaggerXyzComponent.class` should be generated

5. Assuming #4 above works out as expected, then you can initialize the Component as is required:
```
    public MainActivity() {

        mVehicleComponent = DaggerVehicleComponent.builder()
                .vehicleModule(new VehicleModule())
                .build();

        mVehicleComponent.inject(this);
    }

```
