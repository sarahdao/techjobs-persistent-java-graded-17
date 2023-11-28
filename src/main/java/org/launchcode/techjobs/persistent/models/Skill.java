package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany (mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    @Size(min = 5, message = "Your description must be more than 5 characters")
    @NotBlank(message = "A Description required")
    private String description;

    public Skill() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {return jobs; }

    public void setJobs(List<Job> jobs) {this.jobs = jobs;}
}
