package ddd.guild.courtbooking.domain.events

import ddd.guild.courtbooking.domain.aggregate.DateTimeRange

data class BookingCreated (val memberId: Int, val courtId: Int, val dateTime: DateTimeRange)