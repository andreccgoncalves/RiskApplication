/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RiskApplication;

/**
 *
 * @author user
 */
public class vibration {
    
    private String name;
    private String exposureLimit;
    private String injuries;
    private String control;

    /**
     * @return the name
     */
    public String getName() {
        return name = "Vibration";
    }

    /**
     * @return the exposureLimit
     */
    public String getExposureLimit() {
        return exposureLimit = "5 m/s2";
    }

    /**
     * @return the injuries
     */
    public String getInjuries() {
        return injuries = "Hand-arm vibration Syndrome (HAVS)";
    }

    /**
     * @return the control
     */
    public String getControl() {
        return control = "Using machines that are designed to decrease the vibration transmitted to the operator, Implementing speed limits, Scheduling regular work breaks, Posture changes or job rotation to reduce exposure time, Providing training, Information and supervision on adjusting and operating equipment can be used for successful vibration exposure reduction.";
    }
    
}
