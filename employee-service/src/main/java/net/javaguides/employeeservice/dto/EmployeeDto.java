package net.javaguides.employeeservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Schema(
        description = "EmployeeDto Modal Information"
)
public class EmployeeDto {
    private Long id;
    @Schema(
            description = "FirstName"
    )
    private String firstName;

    @Schema(
            description = "LastName"
    )
    private String lastName;

    @Schema(
            description = "Email"
    )
    private String email;

    @Schema(
            description = "Department Code"
    )
    private String departmentCode;

    @Schema(
            description = "Organization Code"
    )
    private String organizationCode;
}
