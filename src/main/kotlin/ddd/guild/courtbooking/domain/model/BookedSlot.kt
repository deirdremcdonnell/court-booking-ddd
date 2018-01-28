package ddd.guild.courtbooking.domain.model

import ddd.guild.courtbooking.domain.aggregate.Court
import ddd.guild.courtbooking.domain.aggregate.DateTimeRange


data class BookedSlot (val courtId: Court, val dateTimeRange: DateTimeRange){
}