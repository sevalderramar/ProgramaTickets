package cl.duoc.sevalderramar.fullstack1.tickets.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter //Lee los datos
@Setter // setea todos los datos
@NoArgsConstructor
@AllArgsConstructor //Crea el constructor con los 4 parametros automaticamente
public class TicketModel {
    private Long id;
    private String title;
    private String description;
    private String status;
    private LocalDateTime createdAt;
    private LocalDate estimatedResolutionDate;
    private LocalDateTime effectiveResolutionDate;
}



