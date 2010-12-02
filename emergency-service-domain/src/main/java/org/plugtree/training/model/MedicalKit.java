/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.plugtree.training.model;

import java.io.Serializable;
import org.plugtree.training.model.Medic.MedicSpeciality;

/**
 *
 * @author salaboy
 */
public class MedicalKit implements Serializable{
    private Long id;
    private String name;
    private MedicSpeciality type;

    public MedicalKit(String name, MedicSpeciality type) {
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MedicSpeciality getType() {
        return type;
    }

    public void setType(MedicSpeciality type) {
        this.type = type;
    }
    
}
