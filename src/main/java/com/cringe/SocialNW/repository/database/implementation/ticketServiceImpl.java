package com.cringe.SocialNW.repository.database.implementation;

import com.cringe.SocialNW.domain.model.Ticket;
import com.cringe.SocialNW.repository.database.interfaces.ticketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ticketServiceImpl {
    private ticketRepository ticketRepository;

    @Autowired
    public ticketServiceImpl(ticketRepository clientRepository) {
        this.ticketRepository = clientRepository;
    }

    /*public void create(Ticket ticket) {
        ticketRepository.save(ticket);
    }*/

    public List<Ticket> readAll() {
        return ticketRepository.findAll();
    }

    public Ticket read(int id) {
        return ticketRepository.getReferenceById(id);
    }

    public boolean update(Ticket ticket, int id) {
        if (ticketRepository.existsById(id)) {
            ticket.setId(id);
            ticketRepository.save(ticket);
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