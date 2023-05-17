package com.testing123.sacral123.controller;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.testing123.sacral123.model.BranchVolumeUpload;
import com.testing123.sacral123.service.BranchVolumeUploadService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class BranchVolumeUploadController {
    
    @Autowired
    private BranchVolumeUploadService branchVolumeUploadService;
    
    @PostMapping("/uploadFile")
    public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile file) {
        branchVolumeUploadService.uploadFile(file);
        return ResponseEntity.ok("File uploaded successfully");
    }
    
    @PostMapping("/validateAndStore")
    public ResponseEntity<?> validateAndStore(@RequestParam("branchVolumeUploads") List<BranchVolumeUpload> branchVolumeUploads) {
        branchVolumeUploadService.validateAndStore(branchVolumeUploads);
        return ResponseEntity.ok("Validated and stored successfully");
    }
    
    @GetMapping("/getProcessedRecords")
    public ResponseEntity<?> getProcessedRecords() {
        List<BranchVolumeUpload> branchVolumeUploads = branchVolumeUploadService.getProcessedRecords();
        return ResponseEntity.ok(branchVolumeUploads);
    }
    
    @PostMapping("/overwrite")
    public ResponseEntity<?> overwrite(@RequestParam("overwrite") boolean overwrite) {
        branchVolumeUploadService.overwrite(overwrite);
        return ResponseEntity.ok("Overwritten successfully");
    }
    
}