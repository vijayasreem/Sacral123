·       Ability to enter details in the fields.·       Ability to upload the file from machine.·       Should have checkbox to overwrite and Validate and Store button to process records.·       Should display records processed successfully after Validate and Store button clicked.

package com.testing123.sacral123.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import com.testing123.sacral123.model.BranchVolumeUpload;

public interface BranchVolumeUploadRepository extends JpaRepository<BranchVolumeUpload, Long> {

    boolean existsByFileName(String fileName);
    
    void deleteByFileName(String fileName);
    
    BranchVolumeUpload findByFileName(String fileName);
    
    BranchVolumeUpload save(BranchVolumeUpload branchVolumeUpload);
    
    boolean existsByValidateAndStore(boolean validateAndStore);
    
    void deleteByValidateAndStore(boolean validateAndStore);
    
    BranchVolumeUpload findByValidateAndStore(boolean validateAndStore);
    
    boolean existsByPermission(String permission);
    
    void deleteByPermission(String permission);
    
    BranchVolumeUpload findByPermission(String permission);
    
 }