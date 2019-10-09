package ru.example.JPATestProject.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.PackagePrivate;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

import static lombok.AccessLevel.PRIVATE;

/**
 * Created by Admin on 09.10.2019.
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = PRIVATE)
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Size(
            min = 0,
            max = 10,
            message = "This value must be contains 10 or min symbol"
    )
    String surname;

    String name;

    String patronymic;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    Address address;


}
