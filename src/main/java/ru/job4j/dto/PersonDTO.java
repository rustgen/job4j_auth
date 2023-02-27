package ru.job4j.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class PersonDTO {

    @NotBlank(message = "Login can't be empty")
    @Size(min = 3, max = 15, message = "Invalid login. Login length should be 3 - 15 characters")
    private String login;

    @NotNull(message = "Password can't be empty.")
    @Size(min = 4, message = "length can't be less than 4 symbols")
    private String password;
}
