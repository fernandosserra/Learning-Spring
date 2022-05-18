package com.fernandosserra.lil.learningspring.web;

import com.fernandosserra.lil.learningspring.business.ReservationService;
import com.fernandosserra.lil.learningspring.data.Reservation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/guests")
public class GuestListController {
    private final ReservationService reservationService;

    public GuestListController(ReservationService reservationService){
        this.reservationService = reservationService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getGuest(Model model){
        model.addAttribute("guests", this.reservationService.getHotelGuests());
        return "hotel-guests";
    }
}
