package cl.duoc.sevalderramar.fullstack1.tickets.service;

import cl.duoc.sevalderramar.fullstack1.tickets.model.Ticket;
import cl.duoc.sevalderramar.fullstack1.tickets.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

    public Ticket create(Ticket ticket){
        boolean exists = this.repository.existsByTitle(ticket.getTitle());
        if (exists) {
            return ticket;
        }
        LocalDateTime now = LocalDateTime.now();
        LocalDate ldNow = LocalDate.now();
        LocalDate estimated = ldNow.plusDays(5L);

        ticket.setStatus("NEW");
        ticket.setCreatedAt(now);
        ticket.setEstimatedResolutionDate(estimated);
        this.repository.save(ticket);
        return ticket;
    }



}
