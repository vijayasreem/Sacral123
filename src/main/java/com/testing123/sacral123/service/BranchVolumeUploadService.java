package com.testing123.sacral123.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testing123.sacral123.model.BranchVolumeUpload;
import com.testing123.sacral123.repository.BranchVolumeUploadRepository;

@Service
public class BranchVolumeUploadService {
   
    @Autowired
    private BranchVolumeUploadRepository branchVolumeUploadRepository;
    
    public boolean existsByFileName(String fileName) {
        return branchVolumeUploadRepository.existsByFileName(fileName);
    }
    
    public void deleteByFileName(String fileName) {
        branchVolumeUploadRepository.deleteByFileName(fileName);
    }
    
    public BranchVolumeUpload findByFileName(String fileName) {
        return branchVolumeUploadRepository.findByFileName(fileName);
    }
    
    public BranchVolumeUpload save(BranchVolumeUpload branchVolumeUpload) {
        return branchVolumeUploadRepository.save(branchVolumeUpload);
    }
    
    public boolean existsByValidateAndStore(boolean validateAndStore) {
        return branchVolumeUploadRepository.existsByValidateAndStore(validateAndStore);
    }
    
    public void deleteByValidateAndStore(boolean validateAndStore) {
        branchVolumeUploadRepository.deleteByValidateAndStore(validateAndStore);
    }
    
    public BranchVolumeUpload findByValidateAndStore(boolean validateAndStore) {
        return branchVolumeUploadRepository.findByValidateAndStore(validateAndStore);
    }
    
    public boolean existsByPermission(String permission) {
        return branchVolumeUploadRepository.existsByPermission(permission);
    }
    
    public void deleteByPermission(String permission) {
        branchVolumeUploadRepository.deleteByPermission(permission);
    }
    
    public BranchVolumeUpload findByPermission(String permission) {
        return branchVolumeUploadRepository.findByPermission(permission);
    }
    
    public void uploadFile(File file) {
        // upload the file from machine
    }
    
    public void validateAndStore(List<BranchVolumeUpload> branchVolumeUploads) {
        // Save the branchVolumeUploads and validate and store the records
    }
    
    public List<BranchVolumeUpload> getProcessedRecords() {
        // Retrieve the list of records processed successfully after Validate and Store button clicked
        return branchVolumeUploadRepository.findAll();
    }
    
    public void overwrite(boolean overwrite) {
        // Overwrite the existing records based on the checkbox
    }
    
}