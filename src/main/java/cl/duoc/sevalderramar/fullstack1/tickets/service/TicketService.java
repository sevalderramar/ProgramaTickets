package cl.duoc.sevalderramar.fullstack1.tickets.service;

import cl.duoc.sevalderramar.fullstack1.tickets.model.TicketModel;
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

    public List<TicketModel> geTickets(){
        return this.repository.getAll();
    }

    public TicketModel create(TicketModel ticketModel){
        boolean exists = this.repository.existsByTitle(ticketModel.getTitle());
        if (exists) {
            return ticketModel;
        }
        LocalDateTime now = LocalDateTime.now();
        LocalDate ldNow = LocalDate.now();
        LocalDate estimated = ldNow.plusDays(5L);

        ticketModel.setStatus("NEW");
        ticketModel.setCreatedAt(now);
        ticketModel.setEstimatedResolutionDate(estimated);
        this.repository.save(ticketModel);
        return ticketModel;
    }



}
