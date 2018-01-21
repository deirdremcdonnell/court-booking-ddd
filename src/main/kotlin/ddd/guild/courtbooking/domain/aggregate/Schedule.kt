package ddd.guild.courtbooking.domain.aggregate

import ddd.guild.courtbooking.domain.commands.CreateBooking

class Schedule(id: Int, courtID: Int) : Aggregate(id) {
    fun handle(createBooking: CreateBooking): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

