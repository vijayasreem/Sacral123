package com.testing123.sacral123.model;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "branch_volume_upload")
public class BranchVolumeUpload {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String fileName;
    
    private boolean validateAndStore;
    
    private String permission;
    
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getFileName() {
        return fileName;
    }
 
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    public boolean getValidateAndStore() {
        return validateAndStore;
    }
    
    public void setValidateAndStore(boolean validateAndStore) {
        this.validateAndStore = validateAndStore;
    }
    
    public String getPermission() {
        return permission;
    }
    
    public void setPermission(String permission) {
        this.permission = permission;
    }
    
}