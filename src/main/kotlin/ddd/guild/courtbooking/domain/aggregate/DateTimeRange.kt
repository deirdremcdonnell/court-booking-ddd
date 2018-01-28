package ddd.guild.courtbooking.domain.aggregate

import java.time.Duration
import java.time.LocalDateTime

data class DateTimeRange(val date: LocalDateTime, val minsDuration: Duration)
{
}