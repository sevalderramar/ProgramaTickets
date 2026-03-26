package cl.duoc.sevalderramar.fullstack1.tickets.controller;

import cl.duoc.sevalderramar.fullstack1.tickets.model.TicketModel;
import cl.duoc.sevalderramar.fullstack1.tickets.service.TicketService;
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
        return this.service.geTickets();
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
