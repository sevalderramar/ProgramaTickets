package cl.duoc.sevalderramar.fullstack1.tickets.repository;

import cl.duoc.sevalderramar.fullstack1.tickets.model.Ticket;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TicketRepository {
    List<Ticket> tickets;

    long currentId = 0L;

    public  TicketRepository() {
        tickets = new ArrayList<>();
        tickets.add(new Ticket(
                currentId++,
                "Ticket1",
                "Ticket 1",
                "NEW",LocalDateTime.now(),
                null,
                null));
        tickets.add(new Ticket(
                currentId++,
                "Ticket1",
                "Ticket 1",
                "NEW",LocalDateTime.now(),
                null,
                null));
    }
    public List<Ticket>getAll(){
        return tickets;
    }
    public Ticket save(Ticket newTicket){
        newTicket.setId(currentId++);
        tickets.add(newTicket);
        return newTicket;
    }

    public boolean existsByTitle(String aTitle){
        for (Ticket ticket : tickets){
            if (ticket.getTitle().equals(aTitle)){
                return true;
            }
        }
        return false;
    }

}
