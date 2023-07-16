package com.dgmf.smsspringboot.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name = "tbl_users")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;
    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;
    @Column(name = "username", nullable = false, unique = true, length = 20)
    private String username;
    @Column(name = "email", nullable = false, unique = true, length = 45)
    private String email;
    @Column(name = "phone_number", length = 45)
    private String phoneNumber;
    @Column(name = "password", nullable = false, length = 15)
    private String password;
    @Column(name = "address", nullable = false)
    private String address;
    /*@Enumerated(value = UserT)
    private String UserType;*/
}
