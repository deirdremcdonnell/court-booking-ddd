package ddd.guild.courtbooking.domain.aggregate

import ddd.guild.courtbooking.domain.commands.CreateBooking
import ddd.guild.courtbooking.domain.events.BookingCreated

class Schedule(id: Int) : Aggregate(id) {
    // A booking for one court needs to know about bookings for other courts
    //
    // moveSchedule

    fun handle(cmd: CreateBooking) : BookingCreated{

        return BookingCreated(cmd.memberId, cmd.courtId, cmd.dateTimeRange);
    }

}

