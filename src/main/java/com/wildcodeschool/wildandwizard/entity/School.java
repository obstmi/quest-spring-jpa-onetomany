package com.wildcodeschool.wildandwizard.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long capacity;
    private String country;
    
    @OneToMany(mappedBy = "school")
    private List<Wizard> wizards;



	public School() {
    }
	
    /**
     * getter-method is neccessary for resolve one-to-many relationship school - wizard
	 * @return the wizards
	 */
	public List<Wizard> getWizards() {
		return wizards;
	}

//	setter-method isn't necessary in this example, since the wizards are selected in the database 
//	/**
//	 * @param wizards the wizards to set
//	 */
//	public void setWizards(List<Wizard> wizards) {
//		this.wizards = wizards;
//	}

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

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}