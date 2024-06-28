package br.com.pedroCoding.todolist.user;

import java.util.UUID;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users") //Nome da Tabela - Tem que ser diferente de users
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    
    private String name;
    private String username;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;


}
