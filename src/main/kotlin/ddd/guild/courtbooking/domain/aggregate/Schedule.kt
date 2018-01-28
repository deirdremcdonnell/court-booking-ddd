package ddd.guild.courtbooking.domain.aggregate

import ddd.guild.courtbooking.domain.commands.CancelBooking
import ddd.guild.courtbooking.domain.commands.CreateBooking
import ddd.guild.courtbooking.domain.events.BookingCancelled
import ddd.guild.courtbooking.domain.events.BookingCreated
import ddd.guild.courtbooking.domain.model.BookedSlot
import ddd.guild.courtbooking.domain.model.Booking
import java.util.*

class Schedule : Aggregate {
    // first had courtid passed in as argument but decided against as
    // A schedule could be for a day.
    // A booking for one court needs to know about bookings for other courts
    //
    // moveSchedule
    //However, the purpose of our aggregate is to control change, not be the change.
    // Yes, we have data there organized as Value Objects or Entity references but that's because it's the easiest and

    //
    // Now, all these components eg BookingCreated, are value objects from DDD point of view,
    // because each represents a value with a business meaning and unlike a Transfer they don't need to have an explicit component
    // that acts as an identifier. Their value is their identity.

    constructor(id: Int) : super(id)
    {

    }

    // these methods could be static (pure functional)
    fun handle(cmd: CreateBooking) : BookingCreated{

        return BookingCreated(cmd.memberId, cmd.courtId, cmd.dateTimeRange);
    }

    fun handle(cmd: CancelBooking) : BookingCancelled {

        //return BookingCreated(cmd.memberId, cmd.courtId, cmd.dateTimeRange);
        return BookingCancelled(cmd.memberId, cmd.courtId, cmd.dateTimeRange);
    }

    fun apply(e: BookingCreated) {
        courts.filter(e.court).add
        //Booking(e.memberId, )
        BookedSlot(e.court, e.dateTimeRange)

    }

    fun apply(event: BookingCancelled) {
    }


}

