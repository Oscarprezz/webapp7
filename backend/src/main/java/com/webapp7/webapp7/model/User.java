package com.webapp7.webapp7.model;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Blob;
import java.util.List;

//DATA BASE TABLE
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;

    private String name;

    private String password;

    private String rol;
    @Lob
    private Blob imageFile;
    private boolean image;

    @ManyToMany
    private List<Material> finishedMaterials;

    private int numberMaterial ;

    @OneToOne
    private Course course;

    public List<Material> getFinishedMaterials() {
        return finishedMaterials;
    }

    public void setFinishedMaterials(List<Material> finishedMaterials) {
        this.finishedMaterials = finishedMaterials;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setNumberMaterial(int numberMaterial) {
        this.numberMaterial = numberMaterial;
    }

    public int getNumberMaterial(){return numberMaterial;}



    public User(User user){}

    public User(String email, String name, String password, String rol) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.rol= rol;
        this.course = null;
        this.finishedMaterials = null;
    }

    public User() { }

    public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
    public void deleteById(long id){ }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }


    public Blob getImageFile() {
        return imageFile;
    }
    public void setImageFile(Blob image) {
        this.imageFile = image;
    }
    public boolean hasImage(){
        return this.image;
    }
    public void setImage(boolean image){
        this.image = image;
    }

    @Override
	public String toString() {
		return String.format("User[id=%d, email='%s', username='%s', password='%s', rol='%s']",
				id, email, name,password, rol);
	}

}