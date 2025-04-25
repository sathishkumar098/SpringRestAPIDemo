package com.example.rest_demo.Controller;

import com.example.rest_demo.Model.CloudVender;
import com.example.rest_demo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIController {

    CloudVendorService cloudVendorService;

    public CloudVendorAPIController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorId}")
    public CloudVender getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendorById(vendorId);
    }

    @PostMapping("/create")
    public String createCloudVendor(@RequestBody CloudVender cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Successfully Created...";
    }

    @PutMapping("/update")
    public String updateCloudVendor(@RequestBody CloudVender cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Updated Successfully...";
    }

    @DeleteMapping("/delete/{vendorId}")
    public String deleteCloudVendor(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.deleteCloudVendor(vendorId);
    }

    @GetMapping("/all-vendors")
    public List<CloudVender> getAllCloudVendors(){
        return cloudVendorService.getAllCloudVendor();
    }

}
