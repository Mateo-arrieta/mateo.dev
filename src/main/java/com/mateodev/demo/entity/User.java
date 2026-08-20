package com.mateodev.demo.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.mateodev.demo.entity.enums.Role;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor //genera todos los constructores con atributos
@NoArgsConstructor //genera todos los constructores sin atributos
@Builder //ejecutar todo y genera la tabla

public class User {
    @Id //lo pone como lllave
    @GeneratedValue(strategy = GenerationType.IDENTITY) //nos permite establecer el tipo de llave (primaria)
    private Long id;
    @Column(nullable = false, length = 50) // campo no null y de 50 caracteres
    private String firstName;
    @Column(nullable = false, length = 50) // campo no null y de 50 caracteres
    private String lastName;
    @Column(nullable = false, unique = true, length = 80) // campo no null y de 80 caracteres y unico
    private String email;
    @Column(nullable = false) // campo no null 
    private String password;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role ;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true) //mapea todos los usuarios, y cree la relacion y hereden las mismas propiedades y al elimmarlo elimine las relaciones
    @Builder.Default //construir la relacion
    private List<Account> accounts = new ArrayList<>(); // Instanciamos la clase account
    @CreationTimestamp //fecha de creacion
    @Column(updatable = false) // fecha inmutable
    private LocalDateTime createAt;
    @UpdateTimestamp // actualiza la fecha 
    private LocalDateTime updateAt;
    

}
