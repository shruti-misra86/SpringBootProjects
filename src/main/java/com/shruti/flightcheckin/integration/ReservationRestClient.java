package com.shruti.flightcheckin.integration;

import com.shruti.flightcheckin.integration.dto.Reservation;
import com.shruti.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);

	public Reservation updateReservation(ReservationUpdateRequest request);

}
