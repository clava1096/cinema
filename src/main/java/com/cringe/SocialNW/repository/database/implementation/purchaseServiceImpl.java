package com.cringe.SocialNW.repository.database.implementation;

import com.cringe.SocialNW.domain.model.Purchase;
import com.cringe.SocialNW.domain.model.Ticket;
import com.cringe.SocialNW.repository.database.interfaces.purchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class purchaseServiceImpl {
    private purchaseRepository purchaseRepository;
    @Autowired
    public purchaseServiceImpl(purchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    public Purchase create(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }

    public List<Purchase> readAll() {
        return purchaseRepository.findAll();
    }

    public Purchase read(int id) {
        return purchaseRepository.getReferenceById(id);
    }

    public boolean update(Purchase purchase, int id) {
        if (purchaseRepository.existsById(id)) {
            purchase.setId(id);
            purchaseRepository.save(purchase);
            return true;
        }
        return false;
    }

    /*public boolean delete(int id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }*/
}
