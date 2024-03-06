package com.recap.springrecipeapi.models;

import java.io.Serializable;

import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class UserEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "username")
    private String username;

   /*  @Column(name = "email")
    private String email; */

    @Column(name = "password")
    private String password;

   /*  @Column(name = "created_at")
    private String createdAt; */
    
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name="role_id", referencedColumnName = "id"))
    private List<Roles> roles = new ArrayList<>();

}
