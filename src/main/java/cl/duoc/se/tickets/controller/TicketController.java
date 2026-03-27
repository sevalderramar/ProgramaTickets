package cl.duoc.se.tickets.controller;

import cl.duoc.se.tickets.model.TicketModel;
import cl.duoc.se.tickets.service.TicketService;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/by-id/{id}")
    public ResponseEntity<TicketModel> getTicketById(@PathVariable Long id){
        TicketModel found = this.service.getById(id);
        if (found != null){
            return ResponseEntity.status(201).body(found);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping
    public


}
