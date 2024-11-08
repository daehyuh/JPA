package hellojpa.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Member {
    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    @Column
    private String name;
    @Column
    private int city;

    @Column
    private String street;
    @Column
    private String zipcode;

    public Member() {
    }

    public Member(Long id, String name, int city, String street, String zipcode) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long l) {
        this.id = l;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public int getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getZipcode() {
        return zipcode;
    }
}
