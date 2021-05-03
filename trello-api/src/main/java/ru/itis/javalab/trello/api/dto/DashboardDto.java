package ru.itis.javalab.trello.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DashboardDto {
    private Long id;
    private UserDto user;
    private ProjectDto project;
    private String projectRole;
//    private List<Task> tasks;
}
