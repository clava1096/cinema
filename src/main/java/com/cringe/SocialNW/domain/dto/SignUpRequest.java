package com.cringe.SocialNW.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(description = "������ �� �����������")
public class SignUpRequest {

    @Schema(description = "��� ������������", example = "Jon")
    @Size(min = 5, max = 50, message = "��� ������������ ������ ��������� �� 5 �� 50 ��������")
    @NotBlank(message = "��� ������������ �� ����� ���� �������")
    private String username;

    @Schema(description = "����� ����������� �����", example = "jondoe@gmail.com")
    @Size(min = 5, max = 255, message = "����� ����������� ����� ������ ��������� �� 5 �� 255 ��������")
    @NotBlank(message = "����� ����������� ����� �� ����� ���� �������")
    @Email(message = "Email ����� ������ ���� � ������� user@example.com")
    private String email;

    @Schema(description = "������", example = "my_1secret1_password")
    @Size(max = 255, message = "����� ������ ������ ���� �� ����� 255 ��������")
    private String password;
}
