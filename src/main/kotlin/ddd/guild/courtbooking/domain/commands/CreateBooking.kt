package ddd.guild.courtbooking.domain.commands

import ddd.guild.courtbooking.domain.aggregate.DateTimeRange

data class CreateBooking (val memberId: Int, val courtId: Int, val dateTime: DateTimeRange)