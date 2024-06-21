package com.cringe.SocialNW.repository.database.interfaces;

import com.cringe.SocialNW.domain.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ticketRepository extends JpaRepository<Ticket,Integer> {

}
