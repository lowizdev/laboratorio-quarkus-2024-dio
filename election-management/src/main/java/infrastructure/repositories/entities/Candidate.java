package infrastructure.repositories.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Optional;

@Entity(name = "candidates")
public class Candidate {
    @Id
    private String id;

    @Column(name = "given_name")
    private String givenName;

    private String email;
    private String phone;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



    public static Candidate fromDomain(domain.Candidate domain) {
        Candidate entity = new Candidate();

        entity.setId(domain.id());

        entity.setGivenName(domain.givenName());

        entity.setEmail(domain.email());
        entity.setPhone(domain.phone().orElse(null));

        return entity;
    }

    public domain.Candidate toDomain() {
        return new domain.Candidate(getId(),
                getGivenName(),
                getEmail(),
                Optional.ofNullable(getPhone()));
    }
}