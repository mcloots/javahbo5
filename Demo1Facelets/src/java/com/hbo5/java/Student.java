/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hbo5.java;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Michaël
 */
@ManagedBean
@RequestScoped
public class Student {
    
    private String voornaam;
    private String familienaam;

    /**
     * Creates a new instance of Student
     */
    public Student() {
      this.voornaam = "Jos";
      this.familienaam = "De Keyser";
    }
    
    public String getVoornaam() {
        return voornaam;
    }
    
    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }
    
    public String getFamilienaam() {
        return familienaam;
    }
    
    public void setFamilienaam(String familienaam) {
        this.familienaam = familienaam;
    }    
}
