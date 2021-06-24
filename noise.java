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
public class noise {
    private String name;
    private String exposureLimit;
    private String injuries;
    private String control;

    /**
     * @return the name
     */
    public String getName() {
        return name = "Noise";
    }

    /**
     * @return the exposureLimit
     */
    public String getExposureLimit() {
        return exposureLimit = "90 dB";
    }

    /**
     * @return the injuries
     */
    public String getInjuries() {
        return injuries = "Hearing loss";
    }

    /**
     * @return the control
     */
    public String getControl() {
        return control = "Using quieter machines, Isolating the noise source, Limiting worker exposure, Use of PPE.";
    }
    
}
