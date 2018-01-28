package ddd.guild.courtbooking.domain.commands

import ddd.guild.courtbooking.domain.aggregate.Court
import ddd.guild.courtbooking.domain.aggregate.DateTimeRange
import ddd.guild.courtbooking.domain.aggregate.Guid
import ddd.guild.courtbooking.domain.aggregate.MemberId

data class CreateBooking(
        val memberId: MemberId,
        val courtId: Court,
        val dateTimeRange: DateTimeRange)
