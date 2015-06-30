package ru.zajav.coursensei.web.rest.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Author entity.
 */
public class AuthorDTO implements Serializable {

	private static final long serialVersionUID = -5900165044175537860L;

	private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AuthorDTO authorDTO = (AuthorDTO) o;

        if ( ! Objects.equals(id, authorDTO.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "AuthorDTO{" +
                "id=" + id +
                ", name='" + name + "'" +
                '}';
    }
}
