package com.cringe.SocialNW.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(description = "������ �� ��������������")
public class SignInRequest {

    @Schema(description = "��� ������������", example = "Jon")
    @Size(min = 5, max = 50, message = "��� ������������ ������ ��������� �� 5 �� 50 ��������")
    @NotBlank(message = "��� ������������ �� ����� ���� �������")
    private String username;

    @Schema(description = "������", example = "my_1secret1_password")
    @Size(min = 2, max = 255, message = "����� ������ ������ ���� �� 8 �� 255 ��������")
    @NotBlank(message = "������ �� ����� ���� �������")
    private String password;
}
