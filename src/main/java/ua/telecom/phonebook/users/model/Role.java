package ua.telecom.phonebook.users.model;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created on 29.08.2017.
 *
 * @author Sergiy Dyrda
 */
public enum Role implements GrantedAuthority {
    USER;

    @Override
    public String getAuthority() {
        return name();
    }
}
