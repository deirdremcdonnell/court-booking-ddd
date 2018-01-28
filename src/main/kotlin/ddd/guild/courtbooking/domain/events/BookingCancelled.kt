package ddd.guild.courtbooking.domain.events

import ddd.guild.courtbooking.domain.aggregate.Court
import ddd.guild.courtbooking.domain.aggregate.DateTimeRange
import ddd.guild.courtbooking.domain.aggregate.MemberId

data class BookingCancelled(val memberId: MemberId, val court: Court, val dateTimeRange: DateTimeRange)