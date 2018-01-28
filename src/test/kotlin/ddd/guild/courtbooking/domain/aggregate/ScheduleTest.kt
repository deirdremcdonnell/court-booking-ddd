package ddd.guild.courtbooking.domain.aggregate

import ddd.guild.courtbooking.domain.commands.CreateBooking
import ddd.guild.courtbooking.domain.events.BookingCreated
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner
import java.awt.print.Book
import java.time.Duration
import java.time.LocalDateTime



@RunWith(MockitoJUnitRunner::class)
class ScheduleTest {
    @Test
    fun canCreateNewBooking() {

        // Arrange
        val courtID = Court.CourtOne;
        val memberID = MemberId(21);
        val scheduleID = 124433//Guid.new;
        val now = LocalDateTime.now()
        val dateTimeRange = DateTimeRange(now, Duration.ofMinutes(40));

        val createBooking = CreateBooking(memberID, courtID, dateTimeRange);

        // Act
        val schedule = Schedule(scheduleID);
        val event : BookingCreated = schedule.handle(createBooking)
        // Assert
        assert(event).equals(BookingCreated(memberID, courtID, dateTimeRange))
    }
}