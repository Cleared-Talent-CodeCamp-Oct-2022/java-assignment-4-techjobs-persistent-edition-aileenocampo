package org.launchcode.techjobs.persistent.models;

import org.dom4j.io.ElementModifier;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    @Size(min=2, max=25, message="Location must be between two and twenty-five characters")
    @NotNull
    private String location;

    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    public Employer(@Size(min=2, max=25, message="Location must be between two and twenty-five characters") String location) {
        this.location = location;
    }
    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
