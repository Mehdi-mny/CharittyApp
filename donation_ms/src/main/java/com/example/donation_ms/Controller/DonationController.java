package com.example.donation_ms.Controller;

import com.example.donation_ms.DAO.Donation;
import com.example.donation_ms.Service.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Donations")
public class DonationController {
    @Autowired
    private DonationService donationservice;

    @RequestMapping("/getAllDonations")
    public List<Donation> getAllDonations(){
        return donationservice.getAllDonations();
    }

    @RequestMapping("/getDonationById/{id}")
    public Donation getdonation(@PathVariable Long id){
        return donationservice.findDonationById(id);
    }

    @PostMapping("/createDonation")
    public Donation createdonation(@RequestBody Donation org){
        return donationservice.createDonation(org);
    }

    @DeleteMapping("/deleteDonationById/{id}")
    public void deleteDonationById(@PathVariable Long id){
        donationservice.deleteDonationById(id);
    }
}