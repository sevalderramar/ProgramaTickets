package cl.duoc.sevalderramar.fullstack1.tickets.controller;

import cl.duoc.sevalderramar.fullstack1.tickets.model.Ticket;
import cl.duoc.sevalderramar.fullstack1.tickets.service.TicketService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private TicketService service;

    public TicketController(TicketService service) {
        this.service = service;
    }

    @GetMapping
    public List<Ticket> getAllTickets(){
        return this.service.geTickets();
    }
}
