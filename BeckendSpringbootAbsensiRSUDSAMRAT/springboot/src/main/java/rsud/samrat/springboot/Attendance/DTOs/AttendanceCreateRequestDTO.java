package rsud.samrat.springboot.Attendance.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rsud.samrat.springboot.Attendance.AttendanceStatus; // Import the AttendanceStatus enum

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceCreateRequestDTO {
    private Long scheduleId;
    private Long employeeId;
    private LocalDate attendanceDate;
    private LocalDateTime clockIn;
    private LocalDateTime clockOut;
    private Double locationLat;
    private Double locationLong;
    private String selfieUrl;
    private AttendanceStatus status; // Include the status field in the request
}
