package co.com.cargomaster.cargomaster.ticket.domain.usecases.ticket.ticketaccepted;

import co.com.cargomaster.cargomaster.ticket.domain.model.ticket.Ticket;
import co.com.cargomaster.cargomaster.ticket.domain.model.ticket.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@RequiredArgsConstructor
public class TicketAcceptedUseCase implements Function<String, Mono<Ticket>> {

    private final TicketRepository repository;

    @Override
    public Mono<Ticket> apply(String id) {
        return this.repository.updateStatusTicketToAccepted(id);
    }
}
