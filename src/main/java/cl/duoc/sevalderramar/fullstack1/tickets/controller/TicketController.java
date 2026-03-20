package cl.duoc.sevalderramar.fullstack1.tickets.controller;

import cl.duoc.sevalderramar.fullstack1.tickets.model.Ticket;
import cl.duoc.sevalderramar.fullstack1.tickets.service.TicketService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping
    public Ticket create(@RequestBody Ticket ticket){
        Ticket created = this.service.create(ticket);
        if (created != null){
            return created;
        }
        return null;
    }
}
