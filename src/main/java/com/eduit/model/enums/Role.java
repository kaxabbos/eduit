package com.eduit.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
@Getter
public enum Role implements GrantedAuthority {
    ADMIN("Управляющий учебного центра"),
    MANAGER("Менеджер"),
    CLIENT("Сотрудник");

    private final String name;

    @Override
    public String getAuthority() {
        return name();
    }
}

