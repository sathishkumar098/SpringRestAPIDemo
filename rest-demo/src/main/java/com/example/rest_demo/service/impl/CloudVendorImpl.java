package com.example.rest_demo.service.impl;

import com.example.rest_demo.Model.CloudVender;
import com.example.rest_demo.repository.CloudVendorRepository;
import com.example.rest_demo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorImpl implements CloudVendorService
{
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVender cloudVender) {
        cloudVendorRepository.save(cloudVender);
        return "Successfully Created...";
    }

    @Override
    public String updateCloudVendor(CloudVender cloudVender) {

        cloudVendorRepository.save(cloudVender);

        return "Successfully Updated...";
    }

    @Override
    public String deleteCloudVendor(String id) {
        cloudVendorRepository.deleteById(id);
        return "Deleted Successfully...";
    }

    @Override
    public CloudVender getCloudVendorById(String id) {
        return cloudVendorRepository.findById(id).get();
    }

    @Override
    public List<CloudVender> getAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }
}
