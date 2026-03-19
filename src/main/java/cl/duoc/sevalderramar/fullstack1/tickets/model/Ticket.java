package cl.duoc.sevalderramar.fullstack1.tickets.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor //Crea el constructor con los 4 parametros automaticamente
public class Ticket {
    private Long id;
    private String title;
    private String description;
    private String status;
}



