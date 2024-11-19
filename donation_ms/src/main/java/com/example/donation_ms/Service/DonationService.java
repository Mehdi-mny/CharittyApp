package com.example.donation_ms.Service;

import com.example.donation_ms.DAO.Donation;

import java.util.List;

public interface DonationService {
    public List<Donation> getAllDonations();
    public Donation createDonation(Donation org);
    public void deleteDonationById(Long id);
    public Donation findDonationById(Long id);
}
