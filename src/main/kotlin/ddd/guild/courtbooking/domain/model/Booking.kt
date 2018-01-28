package ddd.guild.courtbooking.domain.model

import ddd.guild.courtbooking.domain.aggregate.MemberId


data class Booking(val memberId: MemberId, val bookedSlot: BookedSlot)
{

}
