package cl.duoc.se.tickets.controller;

import cl.duoc.se.tickets.model.TicketModel;
import cl.duoc.se.tickets.service.TicketService;
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
    public List<TicketModel> getAllTickets(){
        return this.service.getTickets();
    }

    @PostMapping
    public TicketModel create(@RequestBody TicketModel ticketModel){
        TicketModel created = this.service.create(ticketModel);
        if (created != null){
            return created;
        }
        return null;
    }
}
