package com.model.entities;

import java.io.Serializable;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    //private Integer id;
    //private String name;

    private SimpleIntegerProperty id = new SimpleIntegerProperty(1);
    private SimpleStringProperty name = new SimpleStringProperty("Alface");


    public Department() {
    }

    public Department(Integer id, String name) {
        this.id.setValue(id);
        this.name.setValue(name);
    }

    public Integer getId() {
        return id.getValue();
    }

    public void setId(Integer id) {
        this.id.setValue(id);
    }

    public String getName() {
        return name.getValue();
    }

    public void setName(String name) {
        this.name.setValue(name);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Department other = (Department) obj;
        if (id == null) {
            return other.id == null;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Department [Id=" + id + ", Name=" + name + "]";
    }
}
