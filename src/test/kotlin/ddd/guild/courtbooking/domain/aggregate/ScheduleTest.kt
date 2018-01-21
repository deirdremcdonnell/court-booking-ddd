package ddd.guild.courtbooking.domain.aggregate

import ddd.guild.courtbooking.domain.commands.CreateBooking
import ddd.guild.courtbooking.domain.events.BookingCreated
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ScheduleTest {
    @Test
    fun canCreateNewBooking() {

        // Arrange
        val courtID = 1
        val memberID = 1234
        val scheduleID = 124433//Guid.new;

        val createBooking = CreateBooking(courtID, memberID, DateTimeRange())

        // Act
        val schedule = Schedule(scheduleID, courtID)
        val event = schedule.handle(createBooking)
        // Assert
        assert(event).equals(BookingCreated(courtID, memberID, DateTimeRange()))
    }
}