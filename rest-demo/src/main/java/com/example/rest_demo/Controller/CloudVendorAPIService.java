package com.example.rest_demo.Controller;

import com.example.rest_demo.Model.CloudVender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    CloudVender cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVender getCloudVendorDetails(String vendorId){

//        return new CloudVender("C1",
//                "Satish",
//                "Namakkal",
//                "1234567890");
        return cloudVendor;
    }

    @PostMapping("/create")
    public String createCloudVendor(@RequestBody CloudVender cloudVendor){

        this.cloudVendor = cloudVendor;

        return "Successfully created...";
    }

    @PutMapping("/update")
    public String updateCloudVendor(@RequestBody CloudVender cloudVendor){
        this.cloudVendor = cloudVendor;
        return "updated Successfully...";
    }

    @DeleteMapping("/delete")
    public String deleteCloudVendor(){
        this.cloudVendor = null;
        return "Deleted Successfully...";
    }

}
