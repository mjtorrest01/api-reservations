package dev.mjtorrest.reservations.dto;

import java.util.List;

public class ReservationDTO {
    private Long id;
    private List<PassengerDTO> passenger;
    private ItineraryDTO itinerary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<PassengerDTO> getPassenger() {
        return passenger;
    }

    public void setPassenger(List<PassengerDTO> passenger) {
        this.passenger = passenger;
    }

    public ItineraryDTO getItinerary() {
        return itinerary;
    }

    public void setItinerary(ItineraryDTO itinerary) {
        this.itinerary = itinerary;
    }
}
