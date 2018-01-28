package ddd.guild.courtbooking.domain.commands

import ddd.guild.courtbooking.domain.aggregate.Court
import ddd.guild.courtbooking.domain.aggregate.DateTimeRange
import ddd.guild.courtbooking.domain.aggregate.MemberId
import java.time.Duration

data class CancelBooking(val memberId: MemberId,
                         val courtId: Court,
                         val dateTimeRange: DateTimeRange)
