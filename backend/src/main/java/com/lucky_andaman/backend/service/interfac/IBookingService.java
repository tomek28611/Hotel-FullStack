package com.lucky_andaman.backend.service.interfac;

import com.lucky_andaman.backend.dto.Response;
import com.lucky_andaman.backend.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
