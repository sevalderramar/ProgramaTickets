package cl.duoc.sevalderramar.fullstack1.tickets.service;

import cl.duoc.sevalderramar.fullstack1.tickets.model.Ticket;
import cl.duoc.sevalderramar.fullstack1.tickets.repository.TicketRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TicketService {
    private TicketRepository repository;

    public TicketService(TicketRepository repository) {
        this.repository = repository;
    }

    public List<Ticket> geTickets(){
        return this.repository.getAll();
    }

}
