package com.example.rest_demo.service;

import com.example.rest_demo.Model.CloudVender;

import java.util.List;

public interface CloudVendorService
{
    public String createCloudVendor(CloudVender cloudVender);

    public String updateCloudVendor(CloudVender cloudVender);

    public String deleteCloudVendor(String id);

    public CloudVender getCloudVendorById(String id);

    public List<CloudVender> getAllCloudVendor();
}
