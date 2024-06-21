package com.cringe.SocialNW.controller;

import com.cringe.SocialNW.domain.model.*;
import com.cringe.SocialNW.repository.CinemaRepository;
import com.cringe.SocialNW.repository.database.implementation.purchaseServiceImpl;
import com.cringe.SocialNW.repository.database.implementation.ticketServiceImpl;
import com.cringe.SocialNW.repository.database.implementation.userServiceImpl;
import com.cringe.SocialNW.services.CinemaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.security.core.Authentication;

import java.util.List;
import java.util.Map;
//JDBC +++

@RestController
@RequestMapping("/cinema")
@RequiredArgsConstructor
@Tag(name = "Kino-auth")
public class CinemaController {
    private final userServiceImpl clientService;
    private final ticketServiceImpl ticketService;
    private final purchaseServiceImpl purchaseService;

    private CinemaRepository cinemaRepository = new CinemaRepository();

    private CinemaService cinemaService = new CinemaService();

    @GetMapping("/all_tickets")
    public List<Ticket> getAllTickets(){
        return ticketService.readAll();
    }

    @PostMapping(path = "/purchase")
    public Purchase purchaseTicket(Authentication authentication, @RequestBody Ticket ticket){ //Ticket
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String username = userDetails.getUsername();
        return purchaseService.create(new Purchase(clientService.findUserByUsername(userDetails.getUsername()).getId(),
                ticket.getId(), ticket.getSession_id(), ticket.getDate(), ticket.getPrice()));
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return clientService.readAll();
    }

    @Deprecated
    @GetMapping("/seats")
    public Cinema getSeats() {
        return cinemaService.getCinemaInfo();
    }


    @GetMapping("/available_seats/{price}")
    public Seat getPrice(@PathVariable int price){
        for(Seat c : cinemaRepository.getAvailable_seats()){
            if(c.getPrice() == price) return c;
        }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
    }

    @Deprecated
    @PostMapping(path = "/return")
    public Map<String, Seat> returnTicket(@RequestBody Token token){
        //ArrayList
        return cinemaService.returnTicket(token);
    }

    @Deprecated
    @PostMapping(path = "/stats")
    public Statistics getStats(@RequestParam(required = false) String password){
        return cinemaService.getStats(password);
    }
}