package cl.duoc.sevalderramar.fullstack1.tickets.repository;

import cl.duoc.sevalderramar.fullstack1.tickets.model.TicketModel;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TicketRepository {
    List<TicketModel> ticketModels;

    long currentId = 0L;

    public  TicketRepository() {
        ticketModels = new ArrayList<>();
        ticketModels.add(new TicketModel(
                currentId++,
                "Ticket1",
                "Ticket 1",
                "NEW",LocalDateTime.now(),
                null,
                null));
        ticketModels.add(new TicketModel(
                currentId++,
                "Ticket1",
                "Ticket 1",
                "NEW",LocalDateTime.now(),
                null,
                null));
    }
    public List<TicketModel>getAll(){
        return ticketModels;
    }
    public TicketModel save(TicketModel newTicketModel){
        newTicketModel.setId(currentId++);
        ticketModels.add(newTicketModel);
        return newTicketModel;
    }

    public boolean existsByTitle(String aTitle){
        for (TicketModel ticketModel : ticketModels){
            if (ticketModel.getTitle().equals(aTitle)){
                return true;
            }
        }
        return false;
    }

}
