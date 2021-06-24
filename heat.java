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
public class heat {
     
    private String name;
    private String exposureLimit;
    private String injuries;
    private String control;

    /**
     * @return the name
     */
    public String getName() {
        return name = "Heat";
    }

    /**
     * @return the exposureLimit
     */
    public String getExposureLimit() {
        return exposureLimit = "29.4 C";
    }

    /**
     * @return the injuries
     */
    public String getInjuries() {
        return injuries = "Dehydration, Increased irritability, Heat stroke.";
    }

    /**
     * @return the control
     */
    public String getControl() {
        return control = "Air conditioning and ventilation, Training.";
    }
    
}
