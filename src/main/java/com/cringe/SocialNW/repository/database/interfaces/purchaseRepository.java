package com.cringe.SocialNW.repository.database.interfaces;


import com.cringe.SocialNW.domain.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface purchaseRepository extends JpaRepository<Purchase,Integer> {
}
